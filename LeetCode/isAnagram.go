import "sort"

// Map solution
func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	m := make(map[rune]int)

	for _, char := range s {
		if _, exists := m[char]; exists {
			m[char]++
		} else {
			m[char] = 1
		}
	}

	for _, char := range t {
		m[char]--
	}

	for _, val := range m {
		if val != 0 {
			return false
		}
	}
	return true
}

// Sort string solution
func isAnagram(s string, t string) bool {
	s = sortString(s)
	t = sortString(t)

	return s == t
}

func stringToRuneArr(s string) []rune {
	var r []rune
	for _, char := range s {
		r = append(r, char)
	}
	return r
}

func sortString(s string) string {
	r := stringToRuneArr(s)
	sort.Slice(r, func(i, j int) bool {
		return r[i] < r[j]
	})
	return string(r)
}