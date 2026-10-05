fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for(i in nums.indices) {
            val complement = target - nums[i]
            val firstIndex = map[complement]
            if (firstIndex != null) {
                return intArrayOf(firstIndex, i)
            }
            map[nums[i]] = i
        }
        
        return intArrayOf()
}
