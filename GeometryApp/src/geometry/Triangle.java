package geometry;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of the Triangle: " + calculateArea());
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }


}
