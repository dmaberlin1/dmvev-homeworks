package dmaberlin;


//3. Заданы 2 массива целых чисел произвольной длины.
//        Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных
//        Пример:
///        1-й массив: {1, 2, 3, 4, 5}
//        2-й массив: {5, 6, 7}
//        Результат: {1, 5, 2, 6, 3, 7, 4, 5}

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] arr1={1000,2000,3000,4000,5000};
        int []arr2={10,20,30,40,50};
        int[] arrUnion=merge(arr1,arr2);
        System.out.println(Arrays.toString(arrUnion));
    }

        private static int[] merge (int[] arr1,int[]arr2){
            int[] lengthsOfArrays={arr1.length,arr2.length};
            int lengthUnionArr=lengthsOfArrays[0]+lengthsOfArrays[1];
            int[]unionArray=new int[lengthUnionArr];
            int ind1=0,ind2=0,mergeInd = 0;
            while (ind1<lengthsOfArrays[0]||ind2<lengthsOfArrays[1]){
                if(ind1<lengthsOfArrays[0]){
                    unionArray[mergeInd++]=arr1[ind1++];
                }
                if(ind2<lengthsOfArrays[1]){
                    unionArray[mergeInd++]=arr2[ind2++];
                }
            }

            return unionArray;
        }


}
