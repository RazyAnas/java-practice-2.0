package LambdaExpressions;

// this is a generic interface, with no bounds
@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);

}
