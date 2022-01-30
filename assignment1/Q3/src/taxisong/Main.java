package taxisong;

import java.util.Arrays;

public class Main {

//    Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return compute the researcher's h-index.
//
//    According to the definition of h-index on Wikipedia: A scientist has an index h if h of their n papers have at least h citations each, and the other n − h papers have no more than h citations each.
//
//    If there are several possible values for h, the maximum one is taken as the h-index.

    public static void main(String[] args) {
	// write your code here
        int[] citations1 = {3,0,6,1,5};//Example 1
        int[] citations2 = {1,3,1};//Example 2
//        must be odd
    }//end of main

    public static int HIndex(int[] citations){
        Arrays.sort(citations);
        int h = 0;
        int i = citations.length - 1;
        while (i >= 0 && citations[i] > h){
            h++;
            i--;
        }
        return h;
    }//end of HIndex
}//end of Main
