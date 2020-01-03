func moveZeroes(nums []int) {
	counter := 0

	for _, val := range nums {
		if val != 0 {
			nums[counter] = val
			counter++
		}
	}

	for i := counter; i < len(nums); i++ {
		nums[i] = 0
	}
}