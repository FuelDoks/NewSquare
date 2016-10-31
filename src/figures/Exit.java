package figures;

public class Exit {
    public static void main(String[] args) {
        Square a = new Square(2d,3d,5d);

        Coordinates cords = new Coordinates(1d,2d);

        Circle b = new Circle(cords, 3d);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getCoords().getDistance(b.getCords()));
    }
}
