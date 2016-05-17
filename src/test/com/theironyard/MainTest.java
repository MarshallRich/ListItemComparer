package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by MacLap on 5/16/16.
 */
public class MainTest {

    @Test
    public void testCompareListsWhenTrue() throws Exception {
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();

        for(int i = 0; i < 10; i++){
            listTwo.add(i);
            listOne.add(1);
            listOne.add(2);
            listOne.add(3);
        }

        Assert.assertTrue(Main.compareLists(listOne, listTwo));
    }

    @Test
    public void testCompareListsWhenFalse() {
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();

        listOne.add(100);
        listOne.add(1);
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);

        Assert.assertTrue(!Main.compareLists(listOne, listTwo));
    }
}