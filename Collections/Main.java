package com.tooneTownInc;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {
    // collections are dynamic rather than arrays
    // I could use this list to add models to my tracker program
    public static void main(String[] args) {
        String[] miniatures = {"Achilles", "Penthesilea", "Myrmidon Squad", "Thoraktai Squad"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for (String x : miniatures)
            list1.add(x);

        String[] removeSquads = {"Myrmidon Squad", "Thoraktai Squad"};
        List<String> list2 = new ArrayList<String>();

        //add array items to list
        for (String y : removeSquads)
            list2.add(y);
        System.out.println("Your models in your Aleph list are ");
        for (int i =0;i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        editlist(list1, list2);
        System.out.println();
        System.out.println("Your character models are ");


        for (int i=0; i < list1.size(); i++) {

            System.out.printf("%s,", list1.get(i));
        }
    }

    public static void editlist(Collection<String> l1, Collection<String> l2) {
        //goes through list 1 item by item
        Iterator<String> it = l1.iterator();
        //loop through till it reaches the end of the list
        while (it.hasNext()) {
            //check for items in list 2 and removes items in list 2 from list 1
            if (l2.contains(it.next()))
                it.remove();
        }
    }
}
