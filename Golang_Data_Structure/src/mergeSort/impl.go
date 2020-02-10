package mergesort

func MergeSort(arr []int) {
	if len(arr) > 1 {
		q := len(arr) / 2
		left := arr[:q]
		right := arr[q:]
		MergeSort(left)
		MergeSort(right)
		merge(arr, left, right)
	}
}

func merge(arr []int, left []int, right []int) {

	leftCopy := make([]int, len(left))
	rightCopy := make([]int, len(right))

	copy(left, leftCopy)
	copy(right, rightCopy)

	for i, j, k := 0, 0, 0; i < len(leftCopy) && j < len(rightCopy); k++ {
		if leftCopy[i] <= rightCopy[j] {

			arr[k] = leftCopy[i]
			i++
		} else {

			arr[k] = rightCopy[j]
			j++
		}
	}

}
