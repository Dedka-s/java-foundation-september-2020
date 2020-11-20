package ru.itsjava.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {
    private String view;
    private int cost;


    @Override
    public String toString() {
        return "{view = " + view + " cost = " + cost + "}";
    }

}
