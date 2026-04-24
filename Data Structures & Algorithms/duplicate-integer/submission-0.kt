class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        for (i in nums){
            if (seen.contains(i)) return true
            seen.add(i)
        }
        return false
    }
}