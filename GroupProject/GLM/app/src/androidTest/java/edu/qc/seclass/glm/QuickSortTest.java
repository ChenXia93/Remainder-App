package edu.qc.seclass.glm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {


    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    @Test
    public void testOrderedList_shouldBeTheSame() {
        Reminder[] arr = new Reminder[]{
                new Reminder("Homework", "Type 1"),
                new Reminder("Zoom", "Type 2"),
                new Reminder("Doctor appointment", "Type 3"),
                new Reminder("School", "Type 4"),
                new Reminder("Office work", "Type 5"),
                
        };
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertEquals("Type 4", arr[3].getType());
        assertEquals("Type 3", arr[2].getType());
        assertEquals("Type 2", arr[1].getType());
    }

    @Test
    public void testNonOrderedList_shouldSortItBeTheSame() {
        Reminder[] arr = new Reminder[]{
            new Reminder("Homework", "Type 1"),
            new Reminder("Zoom", "Type 2"),
            new Reminder("Doctor appointmeny", "Type 3"),
            new Reminder("School", "Type 4"),
            new Reminder("Office work", "Type 5"),
            new Reminder("Gym", "Type 6"),

        };
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        assertEquals("Type 1", arr[0].getType());
    
    }

    @Test
    public void testCompleteReversedList_shouldSortIt() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reversedAlphabet = reverseString(alphabet);
        Reminder[] arr = new Reminder[alphabet.length()];
        for (int i = 0; i < reversedAlphabet.length(); i++) {
            String type = Character.toString(reversedAlphabet.charAt(i));
            arr[i] = new Reminder(type, type);
        }
        QuickSort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < alphabet.length(); i++) {
            String type = Character.toString(alphabet.charAt(i));
            assertEquals(arr[i].getType(),type);
        }
    }
}