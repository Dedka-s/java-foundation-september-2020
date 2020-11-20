package ru.itsjava.oop.homework1;

public class Street {
    public static void main(String[] args) {
        Cat lion = new Lion("Simba");
        Cat panther = new Panther("Bagira");
        lion.sayMeow();
        panther.sayMeow();


        Person bob = new Male("Bob",45);
        Person zak = new Male("Zak", 30);
        Person fiona = new Female("Fiona", 38);
        Person zaya = new Female("Zaya",19);
        Person[] city = new Person[]{bob, zak,fiona,zaya};
        for (int i = 0; i < city.length; i++) {
            city[i].printAge();
        }

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

        Figure dd = new Rectangle(2,4);
        System.out.println("dd.equals(ss) = " + dd.equals(ss));
    }





}
