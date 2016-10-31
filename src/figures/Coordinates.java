package figures;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getDistance(Coordinates cords){
        return Math.sqrt(Math.pow(cords.getX()-getX(), 2)
        +Math.pow(cords.getY() - getY(), 2));

    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}