public class Rectangle{
    private double width;
    private double length;
    private String color;
    public Rectangle(){
        width = 4.0;
        length = 5.6;
        color = "red";
    }
    public Rectangle(double w, double l, String color){
        width = w;
        length = l;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public String color(){
        return color;
    }
    
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return length * width;
    }
}
