package dmaberlin;

import java.util.Arrays;

    /*** Напишите программу, которая циклически сдвигает элементы
     * массива вправо на одну позицию, и печатает результат.
     * Цикличность означает, что последний элемент массива становится
     * самым первым его элементом.
     */


    public class Task1 {
        public static void main(String[] args) {
            int[]myArray={10,20,30,40,50,60,70};
            int[] originalArray = myArray.clone();
           dragToRightPrintFullCycle(myArray,originalArray);
        }


        private static void dragToRightPrintFullCycle(int[]arr,int[]origArr){
            while (true){
                dragToRightPrint(arr);
                if (Arrays.equals(arr,origArr)){
                    System.out.println("Complete full cycle");
                    break;
                }
            }
        }

        private static void dragToRightPrint(int [] array){
            dragToRight(array);
            String arrayInString= Arrays.toString(array);
            System.out.println(arrayInString);
        }

        private static void dragToRight(int[] array){
            int lastElem=array[array.length-1];
            int arrLength=array.length-1;
            for (int i = arrLength; i >0 ; i--) {
                array[i]=array[i-1];
            }
            array[0]=lastElem;
        }

    }
