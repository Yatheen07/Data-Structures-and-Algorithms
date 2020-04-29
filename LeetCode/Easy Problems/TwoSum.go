func twoSum(nums []int, target int) []int {
    var result []int
    mapObj := make(map[int]int)
    for index:=0;index<len(nums);index++{
        requiredSum := target - nums[index]
        if value, status := mapObj[requiredSum]; status{
            result = []int{value,index}
            break
        } else{
            mapObj[nums[index]] = index
        }
    }
    return result
}