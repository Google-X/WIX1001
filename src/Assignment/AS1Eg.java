/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AS1Eg {

    public static void main(String[] args) {

        int all = 0;
        ArrayList<String> allPer = new ArrayList<>();

        System.out.println("All per: ");
        for (int i = 0; i <= 54321; i++) {

            if (String.valueOf(i).contains("1") && String.valueOf(i).contains("2") && String.valueOf(i).contains("3") && String.valueOf(i).contains("4") && String.valueOf(i).contains("5")) {
                allPer.add(String.valueOf(i));
                System.out.println(i);
                all++;
            }

        }

        System.out.println("\n");

        System.out.println("Good per: ");
        int goodPer = all;
        for (int i = 0; i < allPer.size();) {

            if (allPer.get(i).contains("12") || allPer.get(i).contains("23") || allPer.get(i).contains("34") || allPer.get(i).contains("45")) {
                goodPer--;
                i++;
            } else {
                System.out.println(allPer.get(i));
                i++;
            }

        }

        System.out.println("\n");
        System.out.println("Total permutation for 4 = " + all);
        System.out.println("Total good per = " + goodPer);

    }
}
