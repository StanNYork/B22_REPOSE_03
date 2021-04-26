package REPLITS.METHODS;

import java.util.*;

public class split_Personal_info {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        //your code here
        String[] infoArray = info.split(",");
        System.out.println("person name: " + infoArray[0]);
        System.out.println("last name: " + infoArray[1]);
        System.out.println("age: " + infoArray[2]);


        /*String[] infoArray = info.split(",");
        System.out.println("person name: " + infoArray[0]);
        System.out.println("last name: " + infoArray[1]);
        System.out.println("age: " + infoArray[2]);*/
    }
}