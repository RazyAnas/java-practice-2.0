package GenericsExtra.util;

import GenericsExtra.model.Student;

import java.util.ArrayList;
import java.util.List;

// generic class
// adding multiple upper bounds
public class QueryList <T extends Student & QueryItem> {

    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

    public List<T> getMatches(String field, String value) {

        List<T> matches = new ArrayList<>();
        for (var item : items) {
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
