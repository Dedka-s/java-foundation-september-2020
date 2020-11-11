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

    }





}
