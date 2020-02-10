
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {90,79,80,69,10,27,55,13};
		int n=8;
		
		InsertionSortMethod ism=new InsertionSortMethod();
		ism.insertionSort(a, n);
		Dispaly d=new Dispaly();
		d.display(a, n);

	}

}
