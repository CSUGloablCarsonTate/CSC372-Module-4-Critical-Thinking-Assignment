public class Cylinder extends Shape {

    // Attributes
    private double radius;
    private double height;

    // Parameterized Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculates The Surface Area
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Calculates The Volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Display Cylinder Information
    @Override
    public String toString() {
        return "Cylinder"
                + "\nRadius: " + radius
                + "\nHeight: " + height
                + "\nSurface Area: " + surface_area()
                + "\nVolume: " + volume();
    }
}