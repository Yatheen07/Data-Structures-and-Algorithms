package main

import (
	"fmt"
)

func moveZeroes(nums []int)  {
    currentIndex := 0
    for i:=0;i<len(nums);i++{
        if nums[i] != 0{
            nums[currentIndex] = nums[i]
            currentIndex++
        }
    }
    
    for i:=currentIndex;i<len(nums);i++{
        nums[i] = 0;
    }
}

func main(){
	nums := []int{0,1,0,13,12,0,1,0,9,8,7,6,1,0,0,0,0,13}
	moveZeroes(nums)
	fmt.Println(nums)
}