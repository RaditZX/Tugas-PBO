package task2;

public class TestShape {
    public static void main(String[] args) {

        // Create a new Shape object
        Shape shape = new Shape();
        System.out.println("Shape color: " + shape.getColor());
        System.out.println("Shape filled: " + shape.isFilled());
        shape.setColor("red");
        shape.setFilled(false);
        System.out.println("Updated shape color: " + shape.getColor());
        System.out.println("Updated shape filled: " + shape.isFilled());
        System.out.println("Shape toString: " + shape.toString() + "\n");

        // Create a new Circle object
        Circle circle = new Circle();
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle filled: " + circle.isFilled());
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle toString: " + circle.toString()  + "\n");

        // Create a new Rectangle object
        Rectangle re = new Rectangle();
        System.out.println("Rectangle color: " + re.getColor());
        System.out.println("Rectangle filled: " + re.isFilled());
        System.out.println("Rectangle area: " + re.getArea());
        System.out.println("Rectangle width: " + re.getWidth());
        System.out.println("Rectangle length: " + re.getLength());
        System.out.println("Rectangle toString: " + re.toString() + "\n");

        // Create a new Square object
        Square sq = new Square();
        System.out.println("Square color: " + sq.getColor());
        System.out.println("Square filled: " + sq.isFilled());
        System.out.println("Square area: " + sq.getArea());
        System.out.println("Square toString: " + sq.toString());

    }
}
