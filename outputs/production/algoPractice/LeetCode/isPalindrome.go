import (
	"regexp"
	"strings"
)

// Regex and String Solution
func isPalindrome(s string) bool {
	lowerS := strings.ToLower(s)
	String := strings.Replace(lowerS, " ", "", -1)
	reg, _ := regexp.Compile("[^a-zA-Z0-9]+")
	cleanString := reg.ReplaceAllString(String, "")
	reverseString := Reverse(cleanString)
	return reverseString == cleanString
}

func Reverse(s string) string {
	r := []rune(s)
	for i, j := 0, len(r)-1; i < len(r)/2; i, j = i+1, j-1 {
		r[i], r[j] = r[j], r[i]
	}
	return string(r)
}

// Two Pointer Solution
func isPalindrome(s string) bool {
	lowerS := strings.ToLower(s)
	String := strings.Replace(lowerS, " ", "", -1)
	reg, _ := regexp.Compile("[^a-zA-Z0-9]+")
	cleanString := reg.ReplaceAllString(String, "")

	i, j := 0, len(cleanString)-1
	for i < j {
		if cleanString[i] != cleanString[j] {
			return false
		} else {
			i++
			j--
		}
	}
	return true
}