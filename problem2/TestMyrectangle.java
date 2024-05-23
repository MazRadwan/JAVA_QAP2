package problem2;

public class TestMyrectangle {
    public static void main (String[] args) {
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);

        MyRectangle rect = new MyRectangle(p1,p2);

        System.out.println();
        System.out.println();
        System.out.println("Top Left: " + rect.getTopLeft());
        System.out.println("Bottom Right: " + rect.getBottomRight());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle: " + rect.toString());
        System.out.println();
        System.out.println();
    }
}
