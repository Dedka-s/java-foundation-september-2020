package ru.itsjava.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {
    private int cost;
    private String manufacturer;
    private String view;

    public Goods(String view) {
        this.view = view;
        this.cost = 1;
        this.manufacturer = "Russia";
    }




}
