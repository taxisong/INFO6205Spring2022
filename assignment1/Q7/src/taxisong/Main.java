package taxisong;

public class Main {

//    You are given two strings order and s.
//    All the words of order are unique and were sorted in some custom order previously.
//
//    Permute the characters of s so that they match the order that order was sorted.
//    More specifically, if a character x occurs before a character y in order,
//    then x should occur before y in the permuted string.
//
//    Return any permutation of s that satisfies this property.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static String CustomSortString(String order, String s){
        int[] count = new int[26];
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray()){
            for (int i = 0; i < count[c - 'a']; i++){
                ans.append(c);
            }
            count[c - 'a'] = 0;
        }
        for (char c = 'a'; c <= 'z'; c++){
            for (int i = 0; i < count[c - 'a']; i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }//end of CustomSortString
}//end of Main
