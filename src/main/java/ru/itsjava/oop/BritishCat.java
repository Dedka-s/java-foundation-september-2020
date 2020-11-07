package ru.itsjava.oop;

public class BritishCat extends Cat{

    public BritishCat() {
        super("Британка");
        System.out.println("Я доча -- Британская кошка");
    }

    @Override
    public void sayMeow() {
        System.out.println("Mrrrrr");
        super.sayMeow();
    }

    public void sayMrrr() {
        System.out.println("Mrrr");
    }
}
