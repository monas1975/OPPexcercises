package excercises;

import java.io.IOException;
import java.util.concurrent.Callable;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("Circle has r=" + c1.getRadius() + "and areaof" + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Circle has r=" + c2.getRadius() + "and areaof" + c2.getArea());

        //System.out.println("Circle has r=" +c2.radius);

        Circle c4 = new Circle();

        c4.setRadius(5);
        System.out.println("r= " + c4.getRadius());

        c4.setColor("pink");
        System.out.println("r= " + c4.getRadius());
        ;

        System.out.println(c1.toString());

        Circle c5 = new Circle(1.2);
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operatoe '+' involes toString too" + c2);

        String path = "circle3.txt";
        Circle[] kolo = new Circle[1000];

        for (int i=0; i<=kolo.length-1;i++){
            kolo[i] = new Circle(i,"red");

        }


       Circle.saveCircelToTxtFile(kolo,path);

        Circle.readFromFile(path);



        }
            }






