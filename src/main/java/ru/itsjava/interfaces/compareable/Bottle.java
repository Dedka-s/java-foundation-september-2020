package ru.itsjava.interfaces.compareable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bottle implements Comparable<Bottle>, Cloneable {
    private final String material;
    private final double mills;

    @Override
    public int compareTo(Bottle bottle) {
//        if (mills > bottle.mills){
//            return 1;
//        } else if (mills == bottle.mills){
//            return 0;
//        }
//        return -1;
        int compareMaterial = material.compareTo(bottle.material);
        if (compareMaterial == 0) {
            return Double.compare(mills, bottle.mills);
        } else return compareMaterial;



    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
