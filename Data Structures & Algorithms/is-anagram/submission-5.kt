class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sSize = s.length
        val tSize = t.length

        val sFrequency = s
            .filter { it.isLetter() }               // Keep only actual letters
            .groupingBy { it.lowercaseChar() }       // Group case-insensitively
            .eachCount()

        val tFrequency = t
            .filter { it.isLetter() }               // Keep only actual letters
            .groupingBy { it.lowercaseChar() }       // Group case-insensitively
            .eachCount()

        println(sFrequency)
        println(tFrequency)


        if (sSize != tSize) {
            return false
        }

        return sFrequency == tFrequency

        
       


    }
}
