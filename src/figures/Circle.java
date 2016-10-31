package figures;

public  class Circle extends Figures {

    public static void main(String[] args) {
    //
    }
    private Coordinates cords;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.cords = new Coordinates(x, y);
        this.radius = radius;
    }
    //
    public Circle(Coordinates cords, double radius) {
        this.cords = cords;
        this.radius = radius;
    }

    public Coordinates getCords() {
        return cords;
    }

    public void setCords(Coordinates cords) {
        this.cords = cords;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = radius;
        }
        this.radius = radius;
    }

    public Circle() {}

    public double calculateLenght(){
        return radius * 2 * Math.PI;
    }
    public double getDiameter(){
        return radius * 2;
    }

    @Override
    public double getPerimeter() {
        return calculateLenght();
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "cords=" + cords +
                ", radius=" + radius +
                '}';
    }
}

