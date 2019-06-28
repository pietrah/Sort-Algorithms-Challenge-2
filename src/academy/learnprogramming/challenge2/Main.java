package academy.learnprogramming.challenge2;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22, -53,-22,51,120,43,62,-5,3,-2,6,-56 };
        int firstUnsortedIndex = 1;

        recursionInsertionSort(intArray, intArray.length-1);


        showSort(intArray);
    }

    public static void recursionInsertionSort(int[] input, int numItems) {
        if(numItems < 2) {
            return;
        }

        recursionInsertionSort(input, numItems-1);
        int newElement = input[numItems];

        int i;

        for (i = numItems; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        numItems++;
        input[i] = newElement;



    }






    public static void showSort(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}


