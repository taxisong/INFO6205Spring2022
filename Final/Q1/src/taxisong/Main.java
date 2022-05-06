package taxisong;

public class Main {

//    String Compression:
//    Implement a method to perform basic string compression
//    using the counts of repeated characters.
//    For example, the string aabcccccaaa would become a2b1c5a3.
//    If the "compressed" string would not become smaller than the original string,
//    your method should return the original string.
//    You can assume the string has only uppercase and lowercase letters (a - z).

    public static void main(String[] args) {
	// write your code here
        String s1 = "aabcccccaaa";
        String s2 = "ab";
        System.out.println(StringCompression(s1));
        StringCompression(s2);
    }//end of main

    public static String StringCompression (String s) {
        int n = s.length();
        String ans = new String();
        for (int i = 0; i < n;) {
            int count = 1;
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            ans += s.charAt(i);
            String counter = String.valueOf(count);
            ans += counter;
            i++;
        }
        int m = ans.length();
        if (m < n) return ans;
        else return s;
    }
}//end of Main
