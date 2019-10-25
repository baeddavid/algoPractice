// Map Solution
func hasCycle(head *ListNode) bool {
	current := head
	m := make(map[*ListNode]bool)

	for current != nil {
		if _, exists := m[current]; exists {
			return true
		} else {
			m[current] = true
			current = current.Next
		}
	}
	return false
}

// Two Pointers
func hasCycle(head *ListNode) bool {
	s := head
	f := head

	for f != nil && f.Next != nil {
		s = s.Next
		f = f.Next.Next
		if f == s {
			return true
		}
	}
	return false
}