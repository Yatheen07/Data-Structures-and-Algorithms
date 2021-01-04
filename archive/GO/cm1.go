package main

import (
	"fmt"
)

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func abs(a int) int {
	if a < 0 {
		return -1 * a
	}
	return a
}

func main() {
	s := "loveleetcode"
	c := 'e'
	//assign it to negative value
	cLastPostion := -1 * len(s)
	result := make([]int, len(s))
	for i := 0; i < len(s); i++ {
		if rune(s[i]) == c {
			cLastPostion = i
		}
		result[i] = i - cLastPostion
	}
	fmt.Println(result)
	for i := len(s) - 1; i >= 0; i-- {
		if rune(s[i]) == c {
			cLastPostion = i
		}
		result[i] = min(result[i], abs(i-cLastPostion))
	}
	fmt.Println(s)
	fmt.Println(result)
}
