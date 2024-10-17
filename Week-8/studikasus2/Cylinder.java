package studikasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double height){
        super("Sphere");
        this.radius = r;
        this.height = height;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " and height " +  height;
    }
}
