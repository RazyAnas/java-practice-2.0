package SetOperationChallenge;

import java.util.*;

public class Main {

    static Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);

    public static void main(String[] args) {
//          <-- PREVIOUSLY -->
//        Set<Task> tasks = TaskData.getTasks("all");
//        sortAndPrint("All Tasks", tasks);
//
//        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
//        Set<Task> annsTasks = TaskData.getTasks("ann");
//        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);
//
//        getUnion();
//        getIntersect(TaskData.getTasks("all"), TaskData.getTasks("bob"));

        // What is the full task list? --> this is the list of all tasks described by your manager
        // and any additional tasks the employees have, that may not be on that list

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All tasks", tasks);

        // Which tasks are assigned to at least one of your 3 team members
        Set<Task> annsTasks = TaskData.getTasks("ann");
        Set<Task> bobsTasks = TaskData.getTasks("bob");
        Set<Task> carolsTasks = TaskData.getTasks("carol");
        Set<Task> allAssignedTasks = new HashSet<>();
        allAssignedTasks.addAll(annsTasks);
        allAssignedTasks.addAll(bobsTasks);
        allAssignedTasks.addAll(carolsTasks);
        getDifference(allAssignedTasks, tasks);

        System.out.println("allAssignedTasks: " + allAssignedTasks.size());
        System.out.println("tasks (manager): " + tasks.size());


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

    private static void getUnion(Set<Task> additionalTasks) {

        // Union of all sets
        Set<Task> allTasks = new HashSet<>();
        allTasks.addAll(TaskData.getTasks("ann"));
        allTasks.addAll(TaskData.getTasks("bob"));
        allTasks.addAll(TaskData.getTasks("carol"));
        allTasks.addAll(additionalTasks);

        sortAndPrint("All new tasks", allTasks, sortByPriority);
    }

    private static void getIntersect(Set<Task> task1, Set<Task> task2) {

        Set<Task> taskA = new HashSet<>(task1);
        Set<Task> taskB = new HashSet<>(task2);

        Set<Task> intersectAB = new HashSet<>(taskA);
        intersectAB.retainAll(taskB); // retains common argument Set

        sortAndPrint("(A ∩ B) Intersect task (A) and task (B)", intersectAB);
    }


    private static void getDifference(Set<Task> task1, Set<Task> task2) {

        Set<Task> taskA = new HashSet<>(task1);
        Set<Task> taskB = new HashSet<>(task2);

        Set<Task> differenceAB = new HashSet<>(taskA);
        differenceAB.removeAll(taskB); // removes second argument's Set



        sortAndPrint("(A - B) (A) tasks minus (B) tasks", differenceAB);
    }




}