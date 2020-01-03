package sorts

func partition(a []int, left int, right int) int {
	pivot := a[right]
	i := left - 1

	for j := left; j < right; j++ {
		if a[j] < pivot {
			i++
			a[i], a[j] = a[j], a[i]
		}
	}
	a[i+1], a[right] = a[right], a[i+1]
	return i + 1
}

func quickSort(a []int, left int, right int) {
	if left < right {
		p := partition(a, left, right)
		quickSort(a, left, p-1)
		quickSort(a, p+1, right)
	}
}
