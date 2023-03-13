package org.veco.zadaciWiki;

public class vrata {
    public static void dajOpis(){
        System.out.println("https://rosettacode.org/wiki/100_doors  -  " +
                "There are 100 doors in a row that are all initially closed. You make " +
                "100 passes by the doors. The first time through, visit every door and toggle the door " +
                "(if the door is closed, open it; if it is open, close it). The second time, only visit " +
                "every 2nd door (door #2, #4, #6, ...), and toggle it. The third time, visit every 3rd " +
                "door (door #3, #6, #9, ...), etc, until you only visit the 100th door.");
    }
    public static void dajRjesenje(){
        boolean[] vrataSva = new boolean[100];
        for(int i=1;i<101;i++){
            vrataSva[i-1]=false;
        }
        for(int i=1;i<101;i++){
            for(int j=i;j<101;j+=i) {
                vrataSva[j-1] = !vrataSva[j-1];
            }
        }
        for(int i=1;i<101;i++){
            if(vrataSva[i-1]) System.out.println(i);
        }
    }
}
