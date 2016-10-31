package figures;

public class Square extends Figures {

    private Coordinates coords;

    private double lineLinght;

    public Square(double x, double y, double lineLinght) {
        this.coords = new Coordinates(x, y);
        this.lineLinght =  lineLinght;
    }

    public Square(Coordinates coords, double lineLinght) {
        this.coords = coords;
        this.lineLinght = lineLinght;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }

    public double getLineLinght() {
        return lineLinght;
    }

    public void setLineLinght(double lineLinght) {
        this.lineLinght = lineLinght;
    }

    @Override
    public double getPerimeter() {
        return lineLinght * 4;
    }

    @Override
    public double getSquare() {
        return lineLinght * lineLinght;
    }

    @Override
    public String toString() {
        return "Square{" +
                "coords=" + coords +
                ", lineLinght=" + lineLinght +
                '}';
    }
}


