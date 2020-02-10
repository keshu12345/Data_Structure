
public class InsertionSortMethod {
	int i,j,item;
	void insertionSort(int a[],int n) {
		for(i=1;i<=n-1;i++) {
			item=a[i];
			for(j=i-1;j>=0 && a[j]>item;j--) {
				if(a[j]>item) {
					a[j+1]=a[j];
				}
				
				}
				a[j+1]=item;
			}
		}
		
	}


