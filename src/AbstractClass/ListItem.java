package AbstractClass;

public abstract class ListItem {

    // It has three protected fields:
    // 1. two x listItems
    protected ListItem rightLink;
    protected ListItem leftLink;
    // 2. one x value object
    protected Object value;

    // constructor that takes an Object and sets it to value
    public ListItem(Object value) {
        this.value = value;
    }

    // 5 methods: next(), setNext(), previous(), setPrevious(), compareTo() --> package private + abstract
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem  setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    // 2 methods: getValue(), setValue(Object)
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

// ListItem (Abstract class) Done!