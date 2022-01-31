package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        for(int i = 0; i<flavors.size(); i++){
            System.out.println(flavors);
        }

        flavors.sort(new FlavorComparator());

        System.out.println("------- Flavor after Flavor--------------");

        for(int i = 0; i<flavors.size(); i++){
            System.out.println(flavors);
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field..
        for(int i = 0; i<cones.size(); i++){
            System.out.println(cones);
        }

        cones.sort(new ConeComparator());

        System.out.println("-------Cones after Cones--------------");

        for(int i = 0; i<cones.size(); i++){
            System.out.println(cones);
        }



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
