// Map
func containsDuplicate(nums []int) bool {
	m := make(map[int]int)

	for _, val := range nums {
		if _, exists := m[val]; exists {
			m[val]++
		} else {
			m[val] = 1
		}
	}

	for _, val := range m {
		if val > 1 {
			return true
		}
	}

	return false
}

// Making a custon Set struct
func containsDuplicate(nums []int) bool {
	s := newSet()

	for _, val := range nums {
		if s.Has(val) {
			return true
		} else {
			s.Add(val)
		}
	}

	return false
}

type Set struct {
	list map[int]struct{}
}

func (s *Set) Has(v int) bool {
	_, exists := s.list[v]
	return exists
}

func (s *Set) Add(v int) {
	s.list[v] = struct{}{}
}

func newSet() *Set {
	s := &Set{}
	s.list = make(map[int]struct{})
	return s
}