package mergesort

import (
	"sort"
	"testing"
)

func TestMergeSort(t *testing.T) {
	input := []int{7, 9, 1, 2, 4, 5}
	output := make([]int, len(input))
	expected := []int{1, 2, 4, 5, 7, 9}
	copy(input, output)
	t.Logf("Input: %v/n", output)
	t.Logf("Expected : %v\n", expected)
	MergeSort(output)

	if !sort.IntsAreSorted(output) {
		t.Errorf("Input is:%v\n", input)
		t.Errorf("output is:%v\n", output)
	}
}
