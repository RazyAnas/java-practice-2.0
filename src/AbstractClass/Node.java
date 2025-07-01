package AbstractClass;

public class Node extends ListItem { // extends ListItem

    // constructor --> takes Object and pass to parent
    public Node(Object value) {
        super(value);
    }

    // 5 methods: next(), setNext(ListItem), previous(), setPrevious(ListItem), compareTo(ListItem)
    // all package-private
    @Override
    ListItem next() {
        return rightLink; // takes no parameter and return the ListItem to its right
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink; // takes a ListItem and sets it as its rightLink, then it returns rightLink
    }

    @Override
    ListItem previous() {
        return leftLink; // takes no parameters and returns the ListItem to its left
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink; // takes a ListItem and sets it as its leftLink, then it returns leftLink
    }

    //  takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison.
    //  If this value is greater than the value that was passed in, then it should return a number greater than zero.
    //  If vice versa, then it should return a number less than zero, and zero if equal.
    /*
    Key Aspects of compareTo():
    Implementation:
    Classes that need a natural ordering implement the Comparable interface and define the compareTo() method.

    Parameters:
    It takes a single argument, which is another object of the same type as the object on which the method is called.
    Return Values:

    Negative Integer: The current object is lexicographically less than the argument object.
    Zero: The current object is lexicographically equal to the argument object.
    Positive Integer: The current object is lexicographically greater than the argument object.

     */
    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}

// Node (Concrete class) Done!