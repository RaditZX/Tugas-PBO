package task2;

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle extends Shape { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
    private double radius;


    public Circle() { // 1st (default) constructor
        super();
        radius = 1.0;  
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        super();
        radius = r;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius; 
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
    return radius*radius*Math.PI;
    }
    
    @Override
    public String toString() {
        return "A Circle with radius="+ this.radius +", which is a subclass of " + super.toString();
    }
}