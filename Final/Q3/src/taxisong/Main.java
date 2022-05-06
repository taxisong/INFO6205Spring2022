package taxisong;

import java.util.*;

public class Main {

//    Given an array of strings strs, group the anagrams together.
//    You can return the answer in any order.
//    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//    typically using all the original letters exactly once.

    public static void main(String[] args) {
	// write your code here
        List<String> strs1 = new ArrayList<>();
        strs1.add("eat");
        strs1.add("tea");
        strs1.add("tan");
        strs1.add("ate");
        strs1.add("nat");
        strs1.add("bat");
        groupAnagrams(strs1);
    }//end of main

    public static List<List<String>> groupAnagrams(List<String> strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}//end of Main
