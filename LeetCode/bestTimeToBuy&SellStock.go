import "math"

// Brute Force
func maxProfit(prices []int) int {
	mp := 0
	for i := 0; i < len(prices); i++ {
		ba := prices[i]
		for j := i + 1; j < len(prices); j++ {
			sa := prices[j]
			cp := sa - ba
			if cp > mp {
				mp = cp
			}
		}
	}
	return mp
}

// One Pass
func maxProfit(prices []int) int {
	minprice := math.MaxInt32
	maxprofit := 0
	for i := 0; i < len(prices); i++ {
		if prices[i] < minprice {
			minprice = prices[i]
		} else if prices[i]-minprice > maxprofit {
			maxprofit = prices[i] - minprice
		}
	}
	return maxprofit
}