package ru.itsjava.object;

public class TelephoneShop {
    public static void main(String[] args) {
        Telephone vitPhone = new Telephone("8913823894294", "Iphone", 100);
        Telephone dashaPhone = new Telephone("899999999", "Nokia", 200);
        Telephone vitPhone2 = new Telephone("8913823894294", "Iphone", 100);

        System.out.println("vitPhone.equals(dashaPhone) = " + vitPhone.equals(dashaPhone));
        System.out.println("vitPhone.equals(vitPhone2) = " + vitPhone.equals(vitPhone2));

        System.out.println("new Object().hashCode() = " + new Object().hashCode());

        System.out.println("vitPhone.toString() = " + vitPhone.toString());
    }
}