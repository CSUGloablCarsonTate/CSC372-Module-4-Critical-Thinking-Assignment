public class Cone extends Shape {

    // Attributes
    private double radius;
    private double height;

    // Parameterized Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculates The Surface Area
    @Override
    public double surface_area() {
        return Math.PI * radius *
                (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    // Calculates The Volume
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Display Cone Information
    @Override
    public String toString() {
        return "Cone"
                + "\nRadius: " + radius
                + "\nHeight: " + height
                + "\nSurface Area: " + surface_area()
                + "\nVolume: " + volume();
    }
}