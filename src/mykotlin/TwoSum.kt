package mykotlin

import java.util.*

// Int Array Constructor
fun main() {
    val nums = intArrayOf(12, 13, 2, 10, 3, 4, 5, 6)
    println(twoSum(nums, 17).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray{

    val ans = IntArray(2)

    for (i in nums.indices)
        for (j in i + 1 until nums.size)
            if (nums[i] + nums[j] == target) {
                ans[0] = i
                ans[1] = j
                break
            }

    return ans
}