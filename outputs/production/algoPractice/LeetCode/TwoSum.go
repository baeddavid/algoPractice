func twoSum(nums []int, target int) []int {
	m := make(map)[int]int)

	for i:= 0; i < len(nums); i++ {
		complement := target - nums[i]
		
		if key, present := m[complement]; present {
			return []int{i, key}
		} else {
			m[nums[i]] = i
		}
	}
	return []int{-1, -1}
}