package main

import (
	"fmt"
)

func sort(arr []int, l int, r int) []int {
	if l < r {
		p := partition(arr, l, r)
		sort(arr, l, p-1)
		sort(arr, p+1, r)
	}
	return arr
}

func partition(arr []int, l int, r int) int {
	pivot := arr[r]
	i := l - 1
	temp := 0
	for j := l; j < r; j++ {
		if arr[j] <= pivot {
			i++
			temp = arr[i]
			arr[i] = arr[j]
			arr[j] = temp
		}
	}
	temp = arr[i+1]
	arr[i+1] = arr[r]
	arr[r] = temp

	return i + 1

}

func main() {
	arr := []int{10, 3, 2, 20, 4, 15}
	fmt.Println("Hello Zo")
	fmt.Println(sort(arr, 0, len(arr)-1))
	fmt.Println("Hello ZOZO")
}
