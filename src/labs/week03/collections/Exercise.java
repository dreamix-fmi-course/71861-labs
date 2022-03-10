package labs.week03.collections;

// T0) Write a method to insert an element into the array list at the first position

// T1) Write a method to retrieve an element (at a specified index) from a given list.

// T2) Write a method to remove the third element from an array list.

// T3) Write a method to search an element in a list.

// T4) Write a method to sort a given array list. (list of String/Integer/Dog).
// Implement Dog class with attribute breed and weight, sort the array by weight property.
// Tip: implement the task with Comparator and Comparable

// T5) Write a method to replace the second element of a ArrayList with the specified element.

// T6)?? Write a Java program to count the number of key-value (size) mappings in a map.

// T7) Write the following structure against aircraft tail number associate
// list of leg information (fromAirport, toAirport, date).
// Fill test information
// Extract legs inside list/set that have from/to airport for a specific airport
// (Example: All legs for airport LBSF)

import labs.week03.collections.entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Exercise {

    public static void findElement(List<String> list, String searched) {
        for (String item:list) {
            if (searched.equals(item)){
                int indexOfSearched = list.indexOf(item);
                System.out.println("Item found, item is at " + indexOfSearched + " position.");
                break;
            }
        }
        System.out.println("Item was not found in the list.");
    }

    public static void main(String... args){

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        //0
        list.add("blabla");

        list.add(0, "newFirst");

        //1
        list.get(2);

        //2
        list.remove(3);

        //3
        findElement(list, "blabla");

        Dog balkan = new Dog("balkan",4, 20);
        Dog sharo = new Dog("sharo", 2, 13);

        //6
        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("key1", balkan);
        dogMap.put("key2", sharo);
        int count = 0;
        for (Map.Entry<String, Dog> e : dogMap.entrySet()){
            count++;
            if (e.getValue().getAge() > 4){
                System.out.println(e.getValue());
            }
        }
        System.out.println(count);
    }

}
