package SetOperationChallenge;

import java.util.*;

public class Main {

    static Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);

    public static void main(String[] args) {
//          <-- PREVIOUSLY -->
//        sortAndPrint("All Tasks", tasks);
//
//        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
//        Set<Task> annsTasks = TaskData.getTasks("ann");
//        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);
//
//        getUnion();
//        getIntersect(TaskData.getTasks("all"), TaskData.getTasks("bob"));

        Set<Task> tasks = TaskData.getTasks("all");

        Set<Task> annsTasks = TaskData.getTasks("ann");
        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annsTasks, bobsTasks, carolsTasks);

        Set<Task> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);

        Set<Task> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        Set<Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<Task> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks);

        Set<Task> overlap  = getUnion(List.of(
                getIntersect(annsTasks, bobsTasks),
                getIntersect(carolsTasks, bobsTasks),
                getIntersect(annsTasks, carolsTasks)
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<Task> overlapping  = new ArrayList<>();
        for (Set<Task> set : sets) {
            Set<Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        Comparator<Task> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);

    }

    private static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (var taskSet : sets) {
            union.addAll(taskSet);
        }
        return union;
    }

    private static Set<Task> getIntersect(Set<Task> task1, Set<Task> task2) {

        Set<Task> intersect = new HashSet<>(task1);
        intersect.retainAll(task2); // retains common argument Set
        return intersect;
    }

    private static Set<Task> getDifference(Set<Task> task1, Set<Task> task2) {

        Set<Task> difference = new HashSet<>(task1);
        difference.removeAll(task2); // removes second argument's Set
        return difference;
    }
}
