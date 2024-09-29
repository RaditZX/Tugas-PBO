package task2;

public class Square  extends Rectangle{

    public Square(){
        super();

    }

    public Square(double side){
        super(side,side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return "A Square with side="+ super.getWidth() +" which is a subclass of " + super.toString();
    }
    
}
