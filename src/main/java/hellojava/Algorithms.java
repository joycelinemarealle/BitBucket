package hellojava;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {

        //search numbers
        //refer to static method

        //test1
        //initialize variable
        System.out.println("\nSearching task");
        boolean searchResult1 = search(new int[]{1, 3, 5, 7, 9}, 4);
        System.out.println(searchResult1); //return false

        //test2
        boolean searchResult2 = search(new int[]{1, 3, 1, 5, 3}, 3);
        System.out.println(searchResult2); //return true

        //test3
        boolean searchResult3 = search(new int[5], 0);
        System.out.println(searchResult3); //return true

        //System.out.println(Arrays.toString(new int[5])); //array is empty has five 0 that is why true

        System.out.println("\nSorting task");
        //initialize variable type and name.
        //calls method need int[] are parameter
        int[] sortResult1 = sort(new int[]{1, 5, 3});
        System.out.println(Arrays.toString(sortResult1)); //prints out array

        //test2
        int[] sortResult2 = sort(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(sortResult2)); //prints out array

        //test3
        int[] sortResult3 = sort(new int[]{1, 5, 1, 3, 7, 9, 1});
        System.out.println(Arrays.toString(sortResult3)); //prints out array
    }

    //Static methods are outside main method but within class
    //Boolean static method
    public static boolean search(int[] toSearch, int target) { //method takes array and int target returns true or false if target found

        //Use for each loop to check every element in array
        for (int i : toSearch) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    //Sort static method
    //initialize the variable type and name add parameter specity type too
    public static int[] sort(int[] toSort) {
        //bubble sort to arrange from small to big element

        //for loop
        boolean swapped;
        int n = toSort.length; //length of array

        for (int i = 0; i < n - 1; i++) { //loop from index zero to 1 less than length.last number sorted do not need to sort last number
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {//i number sorted so no need to deal with with them
                //check if number is greater than the next if yes then swappe
                if (toSort[j] > toSort[j + 1]) {
                    //swap number to next
                    //need to empty number in index j using temp
                    int temp = toSort[j]; //nowtoSort[j] empty and ready to hold value next to it
                    toSort[j] = toSort[j + 1]; //transer toSort[j+1] to empty toSort[j]. Now toSort[j+1] is empty
                    toSort[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break; //If not two elements were swapped in inner loop then array is sorted
            }

        }
        return toSort; //return the sorted array after outerloop is done

    }
}