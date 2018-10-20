package excercises;

import java.io.*;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "Circel[" + this.radius + "," +this.color + "]";
    }

    public static boolean saveCircelToTxtFile(Circle[] circle, String path) {
        boolean result = false;
       /// String textToWrite = "Okrag o promieniu" + circle.getRadius() + "ma pole = " + circle.getArea() + "\n" ;

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(int i =0;i<circle.length;i++){
            try {
                bufferedWriter.write(Double.toString(circle[i].getArea()));
                bufferedWriter.newLine();;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return result ;
    }


    public static boolean readFromFile(String path){
        String line;
        FileReader fr = null;
        try {
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine() )!=null){

                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




        return true;
    }

}
