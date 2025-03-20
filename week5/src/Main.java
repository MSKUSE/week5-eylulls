
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2 = new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);
        Point tLeft = new Point(3,4);
        Rectangle r1 = new Rectangle(
                tLeft,
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTobleLeft().xCoord);
        System.out.println(r1.getTobleLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());
        c1.setradius(-21);
        System.out.println(c1.getRadius());
    }
}