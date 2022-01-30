package taxisong;

import java.util.*;

public class Main {

//    Given an array of strings words and an integer k,
//    return the k most frequent strings.
//
//    Return the answer sorted by the frequency from highest to lowest.
//    Sort the words with the same frequency by their lexicographical order.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static List<String> TopKFrequentWords(String[] words, int k){
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words){
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        List<String> rec = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : cnt.entrySet()){
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return cnt.get(word1) == cnt.get(word2) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
            }
        });
        return rec.subList(0, k);
    }
}//end of Main
