package main

import "fmt"

func main(){
	nums := [] int{4,1,2,1,2}
	fmt.Println(singleNumber(nums))
}

func singleNumber(nums []int) int {
    var result int
    for i:=0;i<len(nums);i++{
        result ^= nums[i]
    }
    return result
}