package AbstractClass;

// SearchTree (concrete class) --> implements NodeList.
public class SearchTree implements NodeList {
    private ListItem root; // one field of type ListItem called root

    // constructor
    public SearchTree(ListItem root) {
        this.root = root;
    }

    // 5 methods

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {

        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        // loop until set
        while (currentItem != null) {
            int compareToReturns = currentItem.compareTo(item);
            // check if currentItem < item
            if (compareToReturns < 0) {
                // if currentItem is smaller than "item" then go to next (if not null)
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else { // or else if next not available setNext as "item" and previous as "currentItem"
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (compareToReturns > 0) { // item to be added is less than currentItem, we got to check previous available
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else { // if there is no more previous
                    currentItem.setPrevious(item);
                    item.setNext(currentItem);
                    this.root = item; // since root is the head
                    return true;
                }
            } else {
                return false; // for duplicate --> question says don't set
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (this.root == null) { // root only exists if there are items, if no root = no items to be removed
            return false;
        }
        ListItem currentItem = this.root;

        while (currentItem != null){
            if (currentItem.getValue().equals(item.getValue())) { // if the root itself is equal to the "item"
                // set the root to the next if next is obviously available
                if (currentItem.next() != null) {
                    this.root = currentItem.next();
                    this.root.setPrevious(null);
                    return true;

                } else {
                    this.root = null; // if next is not there remove the root itself thus making it null
                    return true;

                }
            } else if (currentItem.next() != null) { // if it's not the root lets check forward
                currentItem = currentItem.next();
                if (currentItem.getValue().equals(item.getValue())) {
                    currentItem.previous().setNext(currentItem.next()); // delink the item to be removed and link together item before and after the item to be removed together

                } if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());

                }
                return true;
            } else {
                currentItem = null;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }

    // performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as --> private.
    // Call this method from removeItem() when the item is found.
    // leftLink <- Root Node -> RightLink
    // (ChatGPT) Why is parent needed?:
    // => Because in a tree, you can’t "look back" — nodes only know their children.
    private void performRemoval(ListItem item, ListItem parent) {
        this.root = parent;
        removeItem(item);
    }


}
