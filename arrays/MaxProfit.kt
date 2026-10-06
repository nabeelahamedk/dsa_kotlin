fun maxProfit(prices: IntArray): Int {
        var min = Int.MAX_VALUE
        var profit = 0

        for (p in prices) {
            if (p < min) {
                min = p
            } else {
                profit = maxOf(profit, p - min)
            }
        }

        return profit
}
