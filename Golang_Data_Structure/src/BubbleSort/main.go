//best case time Compexity O(n) mean array is already sorted
//Worst Case  Time complexity O(n^2)
package main

import (
	"fmt"
)

func BubbleSort(arr []int) []int {
	for i := 0; i < len(arr)-1; i++ {
		for j := 0; j < len(arr)-1-i; j++ {
			if arr[j] > arr[j+1] {
				var temp int
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
			}
		}
	}
	return arr
}

func main() {
	arr := []int{7, 10, 15, 2, 30, 5}

	fmt.Println(BubbleSort(arr))

}
