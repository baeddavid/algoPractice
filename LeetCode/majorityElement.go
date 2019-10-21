import "sort"

// Using a map
func majorityElement(nums []int) int {
	m := make(map[int]int)

	for _, val := range nums {
		if _, exists := m[val]; exists {
			m[val]++
		} else {
			m[val] = 1
		}
	}

	for key, val := range m {
		if val > (len(nums) / 2) {
			return key
		}
	}
	return -1
}

// Using a sort
func majorityElement(nums []int) int {
	sort.Ints(nums)
	return nums[len(nums)/2]
}