package com.theironyard;

import java.util.LinkedList;

public class Main {

    public static boolean compareLists(LinkedList listOne, LinkedList listTwo){

        boolean objectsMatch = false;
        int matchingItems = 0;

        for (Object objectOne: listOne) {
            for (Object objectTwo: listTwo){
                if(objectOne.equals(objectTwo)){
                    matchingItems++;
                }
            }
        }
        if (matchingItems >= listOne.size()){
            objectsMatch = true;
        }

        return objectsMatch;
    }

    public static void main(String[] args) {

        //initializing two lists to be compared
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();

        // Populating each list
        for (int i = 1; i < 10; i++){
            listOne.add(i);
            listTwo.add(10 - i);
            listTwo.add(0);
        }

        boolean listTwoContainsListOne = compareLists(listOne, listTwo);

        if (listTwoContainsListOne) {
            System.out.println("All the items in list one are contained inside list two.");
        }
        else {
            System.out.println("All the items in list one are not contained inside list two.");
        }
    }
}
