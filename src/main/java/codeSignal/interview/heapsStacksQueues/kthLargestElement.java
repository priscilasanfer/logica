package codeSignal.interview.heapsStacksQueues;

import java.util.PriorityQueue;

/*
Note: Avoid using built-in std::nth_element (or analogous built-in functions in languages other than C++) when
solving this challenge. Implement them yourself, since this is what you would be asked to do during a real interview.

Find the kth largest element in an unsorted array. This will be the kth largest element in sorted order, not the kth
distinct element.

Example:

For nums = [7, 6, 5, 4, 3, 2, 1] and k = 2, the output should be
kthLargestElement(nums, k) = 6;
For nums = [99, 99] and k = 1, the output should be
kthLargestElement(nums, k) = 99.
 */
public class kthLargestElement {
    int kthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num: nums) {
            minHeap.add(num);
            if (minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}
