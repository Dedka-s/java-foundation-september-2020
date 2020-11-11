package ru.itsjava.oop;

public class Jungle {
    public static void main(String[] args) {
        Lion scare = new Lion("Scare");

        scare.printLion();

        scare.setName("King Scare");

        scare.printLion();
        System.out.println("В наших джунглях есть: " + scare.getName());

        scare.setPawsCount(3);
        System.out.println("Количество лап " + scare.getName() + ": " + scare.getPawsCount());

        Hog pumba = new Hog("Pumba");
        pumba.printHog();

        Meerkat timon = new Meerkat("Timon");
        timon.printMeerkat();

        Hyena gul = new Hyena("Gul");
        gul.printHyena();

        Cat marusya = new BritishCat();

        System.out.println("marusya.getBreed() = " + marusya.getBreed());
        marusya.sayMeow();

        System.out.println("**************************************");
        System.out.println("Home Work");
        //1. Создать 5 коров, у 3 из них поменять цвет
        //2. Написать set get для поля nameBreed
        Cow my = new Cow("My","черный");
        Cow myy = new Cow("My", "желтый");
        Cow mymy = new Cow ("MyMy", "Синий");
        Cow myymyy = new Cow ("MyyMyy", "серый");
        Cow mymyy = new Cow ("MyMyy","белый");
        my.setColor("фиолетовый");
        myy.setColor("красный");
        mymy.setColor("зеленный");
        myymyy.setNameBreed("MyMyy");
        mymyy.setNameBreed("MyyMyy");
        my.printCow();
        myy.printCow();
        mymy.printCow();
        myymyy.printCow();
        mymyy.printCow();








    }
}
