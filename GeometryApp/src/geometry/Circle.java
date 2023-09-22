package geometry;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of the Circle: " + calculateArea());
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
