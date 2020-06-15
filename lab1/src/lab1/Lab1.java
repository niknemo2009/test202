/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Ася
 */
public class Lab1 {

    public int count(int[] array, int x){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                counter++;
            }
        }
        return counter;
    }
    
    public void showArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "  element = " + array[i]);
        }    
    }
    
    public int[] task5(int[] array, int x){
        int counter = count(array, x);
        int flag = 0;
        int[] arrayRes = new int[array.length-counter];
        for(int i = 0; i < array.length; i++){
            if(array[i] != x){
                arrayRes[i-flag] = array[i];
            }
            else{
                flag++;
            }
        }
        return arrayRes;
    }
    
    public String task9(int x){
        String res = null;
        switch(x){
            case 0:
                res = "нуль";
                break;
            case 1: 
                res = "один";
                break;
            case 2:
                res = "два";
                break;
            case 3: 
                res = "три";
                break;
            case 4:
                res = "чотири";
                break;
            case 5: 
                res = "п'ять";
                break;
            default:
                res = "Число не входить у заданий ліміт(0 - 5)";    
        }
        return res;
    }
    
    public int task11(int x){
        int sum = 0;
        while(x != 0){
            sum += (x % 10);
            x/=10;
        }
        return sum;
    }
    
    public void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    
    public int[] task13(int[] array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        return array;
    }
    
    public String task19(String str){
        String result = "";
        StringBuffer buffer = new StringBuffer(str);
        result = buffer.reverse().toString();
        return result;
    }
            
    public static void main(String[] args) {
        int[] array = {3,4,4,1,6,2,5,4};
        int x = 4;
        int longX = 12345;
        String str = "травень";
        Lab1 lr1 = new Lab1();
        //lr1.showArray(lr1.task5(array, x));       //завдання 1
        //System.out.println(lr1.task9(x));         //завдання 2
        //System.out.println(lr1.task11(longX));    //завдання 3
        //lr1.showArray(lr1.task13(array));         //завдання 4
        System.out.println(lr1.task19(str));        //завдання 5
    }
    
}
