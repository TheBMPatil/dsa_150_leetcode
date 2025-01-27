# **"🔥 Rotate Array Efficiently in \(O(n)\) — Optimized Solution 🚀"**

## **Intuition**
The task is to rotate an array \(k\) steps to the right. Initially, the naive approach might involve shifting elements one by one, repeating \(k\) times. However, this would lead to a time complexity of \(O(k \times n)\), which is inefficient for large arrays or large \(k\).

The key realization is that the rotation can be achieved by reversing sections of the array in a systematic way:
1. Reverse the entire array.
2. Reverse the first \(k\) elements.
3. Reverse the remaining \(n-k\) elements.

This strategy ensures that the rotated array falls into place efficiently.

---

## **Approach**
1. **Normalize \(k\):** Since rotating the array \(n\) times results in the same array, we calculate \(k = k \% n\) to handle cases where \(k > n\).
2. **Reverse the entire array:** This step positions the elements for subsequent partial reversals.
3. **Reverse the first \(k\) elements:** Brings the rotated part to the beginning.
4. **Reverse the rest of the array:** Restores the order for the remaining elements.

By leveraging the reversal algorithm, the rotation is performed efficiently in \(O(n)\) time with \(O(1)\) space.

---

## **Complexity**
- **Time Complexity:**  
  \(O(n)\), where \(n\) is the length of the array. The reversal steps are linear.

- **Space Complexity:**  
  \(O(1)\), as no extra space is required apart from a few variables.

---

## **Code**
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        reverse(nums, 0, n - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);  // Reverse the first k elements
        reverse(nums, k, n - 1);  // Reverse the rest of the array
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
```

---

## **Key Example**
Input: `nums = [1, 2, 3, 4, 5, 6, 7]`, \(k = 3\)
1. **Step 1 (Reverse Entire Array):** `[7, 6, 5, 4, 3, 2, 1]`
2. **Step 2 (Reverse First \(k = 3\) Elements):** `[5, 6, 7, 4, 3, 2, 1]`
3. **Step 3 (Reverse Remaining Elements):** `[5, 6, 7, 1, 2, 3, 4]`

Output: `[5, 6, 7, 1, 2, 3, 4]`

---

## **Conclusion**
This solution is a testament to the elegance of algorithms. By breaking the problem into manageable steps, we achieve an efficient and scalable solution. The reversal algorithm demonstrates the power of simple operations combined with a clear strategy.

