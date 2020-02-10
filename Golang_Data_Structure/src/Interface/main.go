package main

import (
	"fmt"
)

type Shap interface {
	Area() float64
	Perimeter() float64
}

type Rect struct {
	width  float64
	height float64
}

func (r Rect) Area() float64 {
	return r.width * r.height
}

func (r Rect) Perimeter() float64 {
	return 2 * (r.width + r.height)
}

func main() {

	var s Shap = Rect{10, 30}

	fmt.Println(s.Area())
	fmt.Println(s.Perimeter())
}
