package dmaberlin;


//4. Написать функцию linearize, которая принимает в качестве параметра двумерный массив
//        и возвращает одномерный массив со всеми элементами двумерного.

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][]myArray={{500,600,700},{1000,2000,3000},{10,20,30}};
        int[]newArr=linearize(myArray);

        System.out.println(Arrays.toString(newArr));
        System.out.println("sorted Array: " + Arrays.toString(sortArr(newArr)));


    }

    private static int[] linearize(int[][]bimetric){
        int size=calcArraySize(bimetric);
        int[]result=new int[size];
        int Index=0;

        for(int[]row:bimetric){
            for(int value:row){
                result[Index]=value;
                Index++;
            }
        }
        return result;
    }

    private static int[] sortArr(int[]arr) {
        Arrays.sort(arr);
        return arr;
    }
    private static int calcArraySize(int[][]arr){
        int size=0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i].length;
        }
        return size;
    }

}
