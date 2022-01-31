package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
        Comparator<Cone> coneComparator = Comparator.comparingDouble(Ingredient::getCost);
        return coneComparator.compare(o1,o2);
    }

}
