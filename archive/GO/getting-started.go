package main

import (
	"fmt"
)

func main(){
	fmt.Println("Hello, World")

	//Variable Decalration
	var y int = 2;

	//Syntax sugar ->Short Form
	x := 5
	sum := x + y
	fmt.Println(sum)

	//Array declaration
	var arr [5]int
	array := [5] int{1,2,3,4,5}
	arr2 := [] int{1,2,3,4,5} //This is a slice
	fmt.Println(arr,array,arr2)

	//This will not be possible
	//array = append(array,6)
	
	//This will be possible
	arr2 = append(arr2,6)
	fmt.Println(arr,array,arr2)
}