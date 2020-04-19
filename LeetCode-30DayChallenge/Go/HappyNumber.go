package main

import (
	"fmt"
)
var squareValues map[int]int

func main(){
	input := 18
	fmt.Println(isHappyNumber(input))
}

func generateSquares(){
	squareValues = make(map[int]int)
	for i:=0;i<10;i++{
		squareValues[i] = i*i
	}
}
func isHappyNumber(input int) bool{
	generateSquares()
	seenValues := make(map[int]bool)
	for input != 1{
		current := input
		sum := 0
		for current != 0{
			sum += squareValues[current % 10]
			current /= 10
		}
		//fmt.Printf("Current sum: %d\n", sum)
		if _,status := seenValues[sum]; status{
			return false
		}
		seenValues[sum] = true
		input = sum
	}
	return true
}