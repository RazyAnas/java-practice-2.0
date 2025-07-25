package AbstractClass;

// implements NodeList
public class MyLinkedList implements NodeList {
    // one field of type ListItem called root
    private ListItem root;

    // constructor for root
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    // four methods
    @Override
    public ListItem getRoot() {
        return root; // getter for root
    }


    // takes a ListItem and returns true if it was added successfully or false otherwise --> added to ListItem
    // If the item is already present, it doesn't get added.
    // Use compareTo() to place the item in its proper order.
    // What is MyLinkedList.addItem() supposed to do?
    // We are adding a new ListItem in sorted order (like 3(root-head) -> 5 -> 10)
    /*
    Question:
    TIP: The rules for adding an item to the linked tree are:
      If the head of the tree is null, make the head refer to the item to be added.
      If the item to be added is less than the current item in the tree, add the item before the current item (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
      If the item to be added is greater than the current item, move onto the next item and compare again (if there is no next item, then that is where the new item belongs).
     */

    // head of the tree = root --> is just a variable pointing to the (head) node in the linked list.
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

    // If removing root, update root = root.next()
    // If removing middle, relink previous and next
    // If removing last, set previous.setNext(null)
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

    // If the root is null it prints out: The list is empty, otherwise print each value on a separate line.
    @Override
    public void traverse(ListItem root) {

        if (this.root != null) {
            while (root.next() != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        } else {
            System.out.println("The list is empty");
        }
    }
}
