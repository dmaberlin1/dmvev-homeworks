package dmaberlin;


import java.util.Arrays;

//2. Написать программу,
// удаляющую все повторяющиеся целые числа из массива и печатающую результат.
// Массив должен использоваться тот же самый.
// На место удаленных элементов ставить цифру 0.
public class Task2 {

    public static void main(String[] args) {
        int[]myArray={10,20,50,30,40,50,60,50,70,60,30,20,10,70,70,70,50,30};
        int changes=duplicateCheckAndRemove(myArray);
        String myArrayOnString=Arrays.toString(myArray);
        System.out.println("Array after removing duplicates:: " + myArrayOnString);
        System.out.println("Number of elements replaced by 0: " + '<'+changes+'>');
    }

    private static int duplicateCheckAndRemove(int[] values){
        int changes=0;
        for (int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){
                if(values[i]==values[j] && values[i] !=0){
                    System.out.println("Replace to 0: " + '<' +values[i] +'>');
                    values[j]=0;
                    changes++;
                }
            }
        }

        return changes;
    }
}
