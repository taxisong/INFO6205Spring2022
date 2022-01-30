package taxisong;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

//    Given a string s,
//    rearrange the characters of s so that any two adjacent characters are not the same.
//
//    Return any possible rearrangement of s or return "" if not possible.

    public static void main(String[] args) {
	// write your code here
        String s1 = "aab";//Example 1

        System.out.println(ReorganizeString(s1));
    }//end of main

    public static String ReorganizeString(String s){
        if (s.length() < 2){
            return s;
        }
        int[] count = new int[26];
        int maxCount = 0;
        int length = s.length();
        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            count[c - 'a']++;
            maxCount = Math.max(maxCount, count[c - 'a']);
        }
        if (maxCount > (length + 1) / 2){
            return "";
        }
        PriorityQueue<Character> queue = new PriorityQueue<Character>(new Comparator<Character>() {
            @Override
            public int compare(Character letter1, Character letter2) {
                return count[letter2 - 'a'] - count[letter1 - 'a'];
            }
        });
        for (char c = 'a'; c <= 'z'; c++){
            if (count[c - 'a'] > 0){
                queue.offer(c);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (queue.size() > 1){
            char letter1 = queue.poll();
            char letter2 = queue.poll();
            sb.append(letter1);
            sb.append(letter2);
            int index1 = letter1 - 'a', index2 = letter2 - 'a';
            count[index1]--;
            count[index2]--;
            if (count[index1] > 0){
                queue.offer(letter1);
            }
            if (count[index2] > 0){
                queue.offer(letter2);
            }
        }
        if (queue.size() > 0){
            sb.append(queue.poll());
        }
        return sb.toString();
    }//end of ReorganizeString
}//end of Main
