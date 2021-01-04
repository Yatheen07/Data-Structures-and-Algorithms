package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	for {
		value, _, err := reader.ReadRune()
		if err != nil {
			break
		}
		fmt.Println(value)
	}

}
