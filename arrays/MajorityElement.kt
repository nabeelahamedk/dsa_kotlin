fun majorityElement(nums: IntArray): Int {
        nums.sort()
        return nums[nums.size / 2]
}
