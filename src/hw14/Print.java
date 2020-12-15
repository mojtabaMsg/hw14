package hw14;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        Character[] charArray = {'a', 'b', 'c'};
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"abcd","efgh","rew"};

        printArray(intArray);
        printArray(charArray);
        printArray(intArray,0,6);
        printArray(strArray);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static <T> void printArray(T[] array, int lowSubscript, int highSubscript) {
        if (lowSubscript < 0 || highSubscript > array.length )
            throw new IllegalArgumentException("Illegal lowSubscribt or highSubscribt");
        for (int i = lowSubscript;i<highSubscript;i++) {
            System.out.println(array[i]);
        }


    }

    public static void printArray(String[] array) {
        for (String t : array) {
            System.out.println(t);
        }
    }

}
