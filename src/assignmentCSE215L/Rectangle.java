package assignmentCSE215L;

public class Rectangle extends Shape{
    protected double length;
    protected double width;   
    
    Rectangle(boolean filled, String color, double length, double width){
        super(filled, color);
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return  2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle(" + super.toString() + " Length = " + length + " Width" + width + ")";
    }
}
