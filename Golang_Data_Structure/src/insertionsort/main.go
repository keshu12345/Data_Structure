
//best case time Compexity O(n) mean array is already sorted
//Worst Case  Time complexity O(n^2)

package main

import (
	"fmt"
)

func InsertionSort(arr []int) []int {
	n := len(arr)
	for i := 1; i < n; i++ {
		temp := arr[i]
		j := i - 1
		for j >= 0 && arr[j] > temp {
			arr[j+1] = arr[j]
			j--
		}
		arr[j+1] = temp
	}
	return arr
}
func main() {

	fmt.Println("Hello")

	arr := []int{7, 10, 15, 2, 30, 5}

	fmt.Println(InsertionSort(arr))

}
