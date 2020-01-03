package sorts

func selectionSort(a []int) []int {
	for i := 0; i < len(a); i++ {
		min := i
		for j := i + 1; j < len(a); j++ {
			if a[j] < a[i] {
				min = j
			}
		}
		a[i], a[min] = a[min], a[i]
	}
	return a
}
