package Gress.lab1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        //задача №6 о сравнении массивов
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        System.out.println("Array a:");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\nArray b:");
        for (int j : b)
            System.out.print(j + " ");
        if (m.compArray(a, b))
            System.out.println("\nArrays are equal");
        else
            System.out.println("\nArrays are not equal");

        //задача №7 об обратном написании числа
        int n = 45876;
        System.out.println("Your number: " + n);
        System.out.println("Reversed number: " + m.reverseInt(n));

        int[] arr = {1, 7, 13, 5};

        //заача №10 об объединении массивов
        System.out.println("Array a:");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\nArray b:");
        for (int i : b)
            System.out.print(i + " ");
        System.out.println("\nArray c:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println("\nHere is your integrated array: ");
        for(int k: m.arraysIntegration(a,b,arr))
            System.out.print(k + " ");
        m.arraysIntegration(a,b,arr);
        System.out.println("\n");
        //
        //задача №3 о вставке нового элемента в массив
        int[] newArr = m.addElementToArr(arr, 9, 2);
        for (int i : newArr)
            System.out.print(i + " ");
        System.out.println("\n");

        //задача №12 о сортировке массива методом вставок
    }

    //задача №6 о сравнении массивов
    public boolean compArray(int[] a, int[] b) {
        boolean isEqual = false;
        int i = 0;
        if (a.length != b.length)
            return isEqual;
        insertionSort(a);
        insertionSort(b);
        for (i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
                break;
        }
        if (i == a.length)
            isEqual = true;
        return isEqual;
    }

    //задача №7 об обратном написании числа
    public int reverseInt(int number) {
        int newNumber = 0;
        while (number != 0) {
            newNumber = newNumber * 10 + number % 10;
            number /= 10;
        }
        return newNumber;
    }

    //задача №10 об объединении массивов
    public int[] arraysIntegration(int[]... args) {
        int length = 0;
        for(int i = 0; i < args.length; i++)
            length += args[i].length;
        int [] newArr = new int [length];
        int k = 0;
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length; j++) {
                newArr[k] = args[i][j];
                k++;
            }
        }
        return newArr;
    }

    //задача №3 о вставке нового элемента в массив
    public int[] addElementToArr(int[] arr, int element, int position) throws ArrayIndexOutOfBoundsException
    {
        int newLength = arr.length + 1;
        if(position < 0 || position >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Incorrect position for adding your element to the array");
            //System.out.println("Incorrect value of position variable");
        }
        int j = 0;
        int[] newArr = new int [newLength];
        for(int i = 0; i < arr.length; i++){
            if(i == position) {
                newArr[position] = element;
                j++;
                newArr[j] = arr[i];
            }
            else
                newArr[j] = arr[i];
            j++;

        }
        return newArr;


    }

    //задача №12 о сортировке массива методом вставок
    public static void insertionSort (int[] arr){
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            while (i >= 0){
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
                i--;
            }
            arr[i + 1] = value;
        }
    }
}





