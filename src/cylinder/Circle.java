package cylinder;

public class Circle {

    private double radious = 1.0;
    private String color = "red";

    public Circle(){

    }

     public Circle(double radious){
        this.radious = radious;
     }

     public Circle(double radious,String color){
        this.radious = radious;
        this.color = color;
     }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radious*this.radious*Math.PI;
    }

    public String toString(){
        return "Circle [radius= "+this.radious + ", " + "color= " +this.color + "]";
    }
}
