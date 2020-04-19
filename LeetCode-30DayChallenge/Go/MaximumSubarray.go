package main

import (
	"fmt"
)

func getMax(a int,b int) int{
    if(a > b){
        return a;
    }   
    return b;
}

func maxSubArray(nums []int) int {
    maxCurrent := nums[0]
    maxGlobal := nums[0]
    for i := 1;i<len(nums);i++{
        maxCurrent = getMax(nums[i],maxCurrent + nums[i])
        maxGlobal = getMax(maxGlobal,maxCurrent)
    }
    return maxGlobal
}

func main(){
	result := maxSubArray([]int{-2,1,-3,4,-1,2,1,-5,4})
	fmt.Println(result)
}