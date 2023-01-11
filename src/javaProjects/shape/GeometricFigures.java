package javaProjects.shape;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        Triangle triangle = new Triangle(4,2);
        //Shape shape = new Shape();//can't create an abstract class object
        showArea(rectangle);
        showArea(triangle);

        Shape[] shapes = {rectangle, triangle};//we can create an array of elements of abstract type
    }
    public static void showArea(Shape shape) {//we can create a reference - using an abstract type
        System.out.println("Area: " + shape.getArea());
    }
}
