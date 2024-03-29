package taxisong;

import java.util.*;

public class Main {

//    Given an integer array nums and an integer k,
//    return the k most frequent elements. You may return the answer in any order.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int[] TopKFrequentElements(int[] nums, int k){
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums){
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        List<int[]> values = new ArrayList<int[]>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()){
            int num = entry.getKey(), count = entry.getValue();
            values.add(new int[]{num, count});
        }
        int[] ret = new int[k];
        qsort(values, 0, values.size() - 1, ret, 0, k);
        return ret;
    }//end of TopKFrequentElements

    public static void qsort(List<int[]> values, int start, int end, int[] ret, int retIndex, int k) {
        int picked = (int) (Math.random() * (end - start + 1)) + start;
        Collections.swap(values, picked, start);

        int pivot = values.get(start)[1];
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (values.get(i)[1] >= pivot) {
                Collections.swap(values, index + 1, i);
                index++;
            }
        }
        Collections.swap(values, start, index);

        if (k <= index - start) {
            qsort(values, start, index - 1, ret, retIndex, k);
        } else {
            for (int i = start; i <= index; i++) {
                ret[retIndex++] = values.get(i)[0];
            }
            if (k > index - start + 1) {
                qsort(values, index + 1, end, ret, retIndex, k - (index - start + 1));
            }
        }
    }
}//end of Main
