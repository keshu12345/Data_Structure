
public class DynamicConnectivityClient {

	
	

	   private UnionFindUF uf;
	   private int numComponents;

	   public void SocialNetworkConnectivity(int N) {
	     uf = new QuickFindUF(N);
	     numComponents = N;
	   }

	   public void addFriendship(int p1, int p2) {
	     if (!uf.connected(p1, p2)) {
	       --numComponents;
	     }
	     uf.union(p1,p2);
	   }

	   public boolean fullyConnected() {
	     return this.numComponents == 1;
	   }

	   public static void main(String[] args) {

	     // initialize social network data structure with N sites

	     String f = null;
		while (!f.isEmpty()) {
	       // read timestamp and relationship
	       // union relationship
	       // check if members fully connected
	     }
	   
	   }
}

