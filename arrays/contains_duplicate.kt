fun containsDuplicate(nums: IntArray): Boolean {
        val unique = HashSet<Int>()
        for(num in nums) {
            if (!unique.add(num)) {
                return true
            }
        }

        return false
}
