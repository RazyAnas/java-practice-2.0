package GenericsExtraChallenge.GenericsExtra.util;

import GenericsExtraChallenge.GenericsExtra.model.Student;

import java.util.ArrayList;
import java.util.List;

// generic class
// adding multiple upper bounds
public class QueryList <T extends Student & QueryItem> extends ArrayList<T> {

//    private List<T> items;

    public QueryList() {

    }
    public QueryList(List<T> items) {
        super(items);
//        this.items = items;
    }

    public QueryList<T> getMatches(String field, String value) {

        QueryList<T> matches = new QueryList<>();
        for (var item : this) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }

        return matches;
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items,
                                                           String field, String value) {

        // generic's method type declared is unrelated to the type declared at generic class
        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }

        return matches;
    }
}
