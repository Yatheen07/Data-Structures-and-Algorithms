func reverse(x int) int {
    result := 0
    for x != 0 {
        result = (result  * 10) + (x % 10)
        x = x / 10
	}
	//Result must definetly be a 32 bit signed integer.
	//It it overflows we need to return 0.
	//Convert a int to 32-bit signed int and convert it back to int,
	//and compare the values, to check overFlow
    overFlowCheck := int(int32(result))
    if(overFlowCheck != result){
        return 0;
    }
    return result
}