import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        Integer[] array = {1,2,6,8,3};
        String[] arrayString = {"Hello", "Java","SpongeBob", "Lusik", "Elf"};
        Double[] realNumbers = {1.2,0.009,2.8,-1.98,-0.991};

        Person[] person = new Person[2];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            person[i].readPerson();
        }

        for (int i = 0; i < person.length; i++) {
            person[i].toString();
        }

        System.out.print("Enter the index i : ");
        int i = scan.nextInt();
        System.out.print("Enter the index j : ");
        int j = scan.nextInt();
        swap(array,i,j);
        swap(arrayString,i,j);
        swap(realNumbers,i,j);
//        swap(person,i,j);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(realNumbers));

//        System.out.println("\nSwapped person array : ");
//        for (int k = 0; k < person.length; k++) {
//            person[k].toString();
//        }

        //Second task
        System.out.println("\nArray with the deleted element : ");
        System.out.print("Enter the index you wanna delete the element at : ");
        int index = scan.nextInt();
        System.out.println("Original array : ");
        System.out.println(Arrays.toString(arrayString));
        System.out.println("\n");
        deleteElement(arrayString,index);


        //SECOND TASK
        System.out.println("\n\nSecond task : ");

        int b = person[0].compareTo(person[1]);
        bigger(b);
    }

    private static <T> void swap(T thing[], int i, int j) {
        T temp = thing[i];
        thing[i] = thing[j];
        thing[j] = temp;
    }

    public static <T, V> void deleteElement(T array[], int index) {
//        ArrayList<T> newArray = new ArrayList<>(array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            newArray.add(array[i]);
//        }
//
//        newArray.remove(index);
//
//        System.out.println(newArray);

        if (array == null || index < 0 || index >= array.length) {
            return;
        }
        T[] newArray = (T[]) new Object[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = array[i];
        }

        System.out.println("The new array :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    public static void bigger(int b) {
        if (b > 0) {
            System.out.println("First name is longer than the second name!");
        } else if (b == 0) {
            System.out.println("Both names r equal in length!");
        } else {
            System.out.println("The second name is longer than the first name!");
        }
    }
}
