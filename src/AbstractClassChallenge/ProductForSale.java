package AbstractClassChallenge;

// abstract class -> productForSale
public abstract class ProductForSale {

    // three fields type, price and a description
    private String type;
    private final double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Class should also have methods to: getSalesPrice (concrete) --> takes quantity and returns the quantity*price
    public double getSalesPrice(int quantity) {

        return quantity*price;
    }

    // method to: printPricedItem (concrete) --> takes quantity and print itemized line item order with quantity and line-item price
    // like this: 3 x Pen @ ₹10 = ₹30
    public String printPricedItem(int quantity) {

        return quantity + " x " + type + " @ " + "₹" + price + " = " + "₹" + getSalesPrice(quantity);
    }

    // method to: showDetails (abstract) --> represents what might be displayed on product page: Product type, description, price, so on
    public abstract void showDetails();
}

// also create an OrderItem type that has two fields: quantity, ProductForSale
class OrderItem {

    private int quantity;
    private ProductForSale productForSale;

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }
}

// also create two or three classes that extends ProductForSale, that will be your products in your store
