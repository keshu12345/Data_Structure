package main

import (
	"fmt"
)

type Node struct {
	Value int
	Left  *Node
	Right *Node
}

func PrintNode(n *Node) {

	fmt.Print("Value: ", n.Value)
	if n.Left != nil {
		fmt.Print(" Left: ", n.Left.Value)
	}
	if n.Right != nil {
		fmt.Print(" Right: ", n.Right.Value)
	}
	fmt.Print(" ")
}

func main() {

	var N int
	fmt.Scanf("%d", &N)
	fmt.Println(N)
	var nodes []Node = make([]Node, N)

	for i := 0; i < N; i++ {
		var Val, IndexLeft, IndexRight int
		fmt.Scanf("%d %d %d", &Val, &IndexLeft, &IndexRight)
		fmt.Println("Value:", Val, "IndexLeft:", IndexLeft, "IndexRight:", IndexRight)
		nodes[i].Value = Val
		if IndexRight >= 0 {
			nodes[i].Left = &nodes[IndexLeft]
		}
		if IndexRight >= 0 {
			nodes[i].Right = &nodes[IndexRight]
		}

	}
	for _, node := range nodes {
		PrintNode(&node)
	}

	// test := &Node{
	// 	Value: 123}

	// right := &Node{
	// 	Value: 23,
	// }
	// test.Right = right

	// //fmt.Println(test)
	// PrintNode(test)
}
