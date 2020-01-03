package sorts

func merge(a []int, left int, median int, right int) {
	leftLength := median - left + 1
	rightLength := right - median

	Left := make([]int, leftLength)
	Right := make([]int, rightLength)

	for i := 0; i < leftLength; i++ {
		Left[i] = a[left+i]
	}
	for j := 0; j < rightLength; j++ {
		Right[j] = a[median+1+j]
	}

	i, j, k := 0, 0, left
	for i < leftLength && j < rightLength {
		if Left[i] <= Right[j] {
			a[k] = Left[i]
			i++
		} else {
			a[k] = Right[j]
			j++
		}
		k++
	}

	for i < leftLength {
		a[k] = Left[i]
		i++
		k++
	}

	for j < rightLength {
		a[k] = Right[j]
		j++
		k++
	}
}

func mergeSort(a []int, left int, right int) {
	if left < right {
		median := (left + right) / 2
		mergeSort(a, left, median)
		mergeSort(a, median+1, right)
		merge(a, left, median, right)
	}
}
