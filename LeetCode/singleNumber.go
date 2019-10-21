// Extra Memory Solution
func singleNumber(nums []int) int {
	m := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if _, exists := m[nums[i]]; exists {
			m[nums[i]]++
		} else {
			m[nums[i]] = 1
		}
	}

	for i := 0; i < len(nums); i++ {
		if m[nums[i]] == 1 {
			return nums[i]
		}
	}
	return -1
}