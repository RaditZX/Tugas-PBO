package task2;

public class Rectangle extends Shape{
    private double width;
    private double length;


    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    @Override
    public String toString(){
        return "A Rectangle with width=" + this.width +"and length= " +this.length+ ", which is a subclass of" +  super.toString();
    }
    
}
