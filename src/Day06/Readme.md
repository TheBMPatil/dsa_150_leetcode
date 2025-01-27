# **🔥 Maximize Stock Profit in \(O(n)\) — Optimal Solution 🚀**

## **Problem Statement**
You are given an array `prices` where `prices[i]` is the price of a stock on the \(i\)-th day.  
Your goal is to maximize your profit by choosing **one day to buy** and a **different day in the future to sell**. If achieving profit is not possible, return \(0\).

---

## **Intuition**
The key to solving this problem efficiently lies in tracking:
1. The **minimum price** encountered so far (buy price).
2. The **maximum profit** achievable up to the current day.

By iterating through the array just once, you can:
- Update the minimum price dynamically.
- Calculate the maximum profit by comparing the current price difference with the previous maximum.

This approach avoids the need for nested loops, ensuring optimal performance.

---

## **Approach**
1. **Initialize Variables:**
  - `minPrice` to track the smallest stock price seen so far.
  - `maxProfit` to store the maximum profit.
2. **Iterate Through the Array:**
  - For each price:
    - Calculate the profit as `prices[i] - minPrice`.
    - Update `maxProfit` if the current profit is higher.
    - Update `minPrice` if the current price is lower.
3. **Return the Result:**
  - Return the `maxProfit`. If no profit is possible, this will remain \(0\).

---

## **Complexity**
- **Time Complexity:**  
  \(O(n)\), as the array is traversed once.

- **Space Complexity:**  
  \(O(1)\), since no additional space is used apart from a few variables.

---

## **Code**
```java
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit possible
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Calculate profit if selling at current price
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
```

---
## **Submission**
![Screenshot of the Submission](buysellstocks.png)

---
## **Key Example**
Input: `prices = [7, 1, 5, 3, 6, 4]`

1. **Day 1:** `minPrice = 7`, `maxProfit = 0`
2. **Day 2:** `minPrice = 1`, `maxProfit = 0`
3. **Day 3:** Profit = \(5 - 1 = 4\), Update `maxProfit = 4`
4. **Day 4:** Profit = \(3 - 1 = 2\), No Update
5. **Day 5:** Profit = \(6 - 1 = 5\), Update `maxProfit = 5`
6. **Day 6:** Profit = \(4 - 1 = 3\), No Update

Output: `5`

---

## **Edge Cases**
1. **Empty or Single Element Array:**  
   Input: `prices = []` or `prices = [5]`  
   Output: `0` (No profit possible)
2. **Descending Prices:**  
   Input: `prices = [7, 6, 4, 3, 1]`  
   Output: `0` (No profitable transaction possible)
3. **Constant Prices:**  
   Input: `prices = [3, 3, 3, 3]`  
   Output: `0` (No profit possible)

---

## **Conclusion**
This solution highlights the beauty of a single-pass algorithm. By maintaining two variables (`minPrice` and `maxProfit`), you efficiently find the best days to buy and sell stock, ensuring optimal performance and simplicity. 🚀