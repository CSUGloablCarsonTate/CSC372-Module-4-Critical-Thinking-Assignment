public class ShapeArray {

    public static void main(String[] args) {

        // Creates The Shape Objects
        Sphere sphere = new Sphere(8.0);
        Cylinder cylinder = new Cylinder(6.0, 9.0);
        Cone cone = new Cone(5.0, 10.0);

        // Store Objects in the Shape Array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Display The Shape's Information
        System.out.println("Shape Surface Area and Volume Calculator");
        System.out.println("----------------------------------------");

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println();
        }
    }
}
