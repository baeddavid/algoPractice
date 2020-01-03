// Extra Memory Solution
func singleNumber(nums []int) int {
	m := make(map[int]int)

	for _, val := range nums {
		if _, exists := m[val]; exists {
			m[val]++
		} else {
			m[val] = 1
		}
	}

	for _, val := range nums {
		if m[val] == 1 {
			return val
		}
	}
	return -1
}