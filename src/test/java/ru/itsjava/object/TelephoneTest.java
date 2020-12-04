package ru.itsjava.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Класс телефон должен: ")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "999999999";
    public static final String DEFAULT_BRAND = "HW";
    public static final int DEFAULT_PRICE = 100;
    @DisplayName("иметь корректный конструтор от всех полей")
    @Test
    public void shouldHaveCorrectAllArgsConstructor(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);

//        Assertions.assertEquals("999999999", telephone.getPhoneNumber());
//        Assertions.assertEquals("HW", telephone.getBrand());
//        Assertions.assertEquals(1, telephone.getPrice());

        assertAll("telephone",
                ()-> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                ()-> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                ()-> assertEquals(DEFAULT_PRICE, telephone.getPrice())
        );
    }

    @DisplayName("иметь корректный конструтор от final полей")
    @Test
    public void shouldHaveCorrectRequiredArgsConstructor(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);


        assertAll("telephone",
                ()-> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                ()-> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                ()-> assertEquals(0.0, telephone.getPrice())
        );
    }

    @DisplayName("иметь корректный setter на цену")
    @Test
    public void shouldHaveCorrectSetPrice(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);
        telephone.setPrice(DEFAULT_PRICE);

        assertEquals(DEFAULT_PRICE, telephone.getPrice());
    }

    @DisplayName("иметь корректные Getters")
    @Test
    public void shouldHaveCorrectGetters(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND,DEFAULT_PRICE);

        assertAll("telephone",
                ()-> assertEquals(telephone.getPhoneNumber(), DEFAULT_NUMBER),
                ()-> assertEquals(telephone.getBrand(), DEFAULT_BRAND),
                ()-> assertEquals(telephone.getPrice(), DEFAULT_PRICE)
        );
    }

    @DisplayName("иметь корректный equals")
    @Test
    public void shouldHaveCorrectEquals(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND,DEFAULT_PRICE);
        var telephone1 = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND,DEFAULT_PRICE);
        var telephone2 = new Telephone(DEFAULT_NUMBER+DEFAULT_BRAND, DEFAULT_BRAND+DEFAULT_NUMBER,DEFAULT_PRICE+DEFAULT_PRICE);


        assertAll("telephone",
                ()-> assertEquals(true, telephone.equals(telephone1)),
                ()-> assertEquals(false, telephone.equals(telephone2))
        );
    }

    @DisplayName("иметь корректный to string")
    @Test
    public void shouldHaveCorrectToString(){
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        String str = "Telephone(phoneNumber=" + telephone.getPhoneNumber() + ", brand=" + telephone.getBrand() + ", price=" + telephone.getPrice() + ")";
        assertEquals(str, telephone.toString());
    }



}
