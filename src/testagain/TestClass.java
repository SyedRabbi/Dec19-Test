package testagain;

public class TestClass {
    public static void main(String[] args) {
        findRectangleArea(6.9, 5.5);
        double area = printAreaOfCircle(6.5);
        boolean isTrue = isASquare(6.9, 6.9);
        System.out.println(isTrue);
    }

    public static void findRectangleArea(double length, double width){
        double area = length * width;
        System.out.println("Area is "+area);
    }

    public static double printAreaOfCircle(double radius){
        double area = 3014 * radius * radius;
        System.out.println("Circle area is "+area);
        return area;
    }

    public static boolean isASquare(double length, double width){
        return length==width;
    }

}
