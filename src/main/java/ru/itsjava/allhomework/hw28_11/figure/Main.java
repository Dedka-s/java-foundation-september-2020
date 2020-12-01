package ru.itsjava.allhomework.hw28_11.figure;


public class Main {
    public static void main(String[] args) {
        Figure ssss = new Round(4);
        System.out.println(ssss.getArea());
        System.out.println(ssss.getPerimeter());

        Figure sss = new Triangle(4,3,3);
        System.out.println(sss.getArea());
        System.out.println(sss.getPerimeter());

        Figure ss = new Rectangle(4,2);
        System.out.println(ss.getArea());
        System.out.println(ss.getPerimeter());

        Figure s = new Square(5);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());


        System.out.println("s.toString() = " + s.toString());
        System.out.println("ss.toString() = " + ss.toString());
        System.out.println("sss.toString() = " + sss.toString());
        System.out.println("ssss.toString() = " + ssss.toString());

        System.out.println("s.equals(new Square(5)) = " + s.equals(new Square(5)));
        System.out.println("s.equals(new Square(6)) = " + s.equals(new Square(6)));
        System.out.println("ss.equals(new Rectangle(5,1)) = " + ss.equals(new Rectangle(5, 1)));
        System.out.println("ss.equals(new Rectangle(5,4)) = " + ss.equals(new Rectangle(5, 4)));
        System.out.println("sss.equals(new Triangle(3,4,3)) = " + sss.equals(new Triangle(3, 4, 3)));
        System.out.println("sss.equals(new Triangle(3,4,5)) = " + sss.equals(new Triangle(3, 4, 5)));
        System.out.println("ssss.equals(new Round(4)) = " + ssss.equals(new Round(4)));
        System.out.println("ssss.equals(new Round(8)) = " + ssss.equals(new Round(8)));


    }
}
