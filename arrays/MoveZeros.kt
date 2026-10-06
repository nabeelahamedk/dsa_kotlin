fun moveZeroes(nums: IntArray): Unit {
        var next = 0
        for (n in nums) {
            if (n != 0) {
                nums[next++] = n
            }
        }
        nums.fill(0, next)
}
