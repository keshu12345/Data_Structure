package main

import (
	"fmt"
)

func SelectionSort(arr []int) []int {

	for i := 0; i < len(arr); i++ {
		min := i
		for j := i + 1; j < len(arr); j++ {

			if arr[j] < arr[min] {
				min = j
			}
		}
		if i != min {
			var temp int
			temp = arr[i]
			arr[i] = arr[min]
			arr[min] = temp

		}

	}
	return arr
}

func main() {
	arr := []int{2, 5, 7, 10, 15, 30}

	fmt.Println(SelectionSort(arr))
}
