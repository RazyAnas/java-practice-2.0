public class Wall {
    // two instance variables needed width and height of type double
    private double width;
    private double height;

    // class needs to have two constructors
    public Wall() {
    }
    public Wall(double width, double height) {

        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;

    }

    // Instance methods required as per question: getter and setters for width and height and getArea without parameters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else{
            this.height = height;
        }
    }

    public double getArea() {
        return getWidth()*getHeight();
    }
}
