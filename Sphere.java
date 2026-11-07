public class Sphere extends Shape {

    // Attribute
    private double radius;

    // Parameterized Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculates The Surface Area
    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Calculates The Volume
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Display Sphere Information
    @Override
    public String toString() {
        return "Sphere"
                + "\nRadius: " + radius
                + "\nSurface Area: " + surface_area()
                + "\nVolume: " + volume();
    }
}