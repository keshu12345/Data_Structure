class MyClas {
    private int[] a;
    private int[] size;
    int N=0;
    public MyClas(int n){
        N=n;
        a = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            a[i]=i;
            size[i]=1;
        }
    }
    private int root(int x){
        while(x != a[x]){
            x=a[x];
        }
        return x;
    }
    public boolean connected(int p, int q){
        return root(p)==root(q);
    }
    public void union(int p,int q, String timestamp){
        int i = root(p);
        int j = root(q);
        if(i == j) return;
        if(size[i] < size[j]){
            a[i] = j;
            size[j]+=size[i];
            if(size[j]==N){
                System.out.println("All Members are connected at Timestamp"+ timestamp);
            }
        }
        else{
            a[j] = i;
            size[i]+=size[j];
            if(size[i]==N){
                System.out.println("All Members are connected at Timestamp"+ timestamp);
            }
        }
    }



    public static void main(String args[]) {
      MyClas obj = new MyClas(6);
      obj.union(1,5, "2019-08-14 18:00:00");
      obj.union(2,4, "2019-08-14 18:00:01");
      obj.union(1,3, "2019-08-14 18:00:02");
      obj.union(5,2, "2019-08-14 18:00:03");
      obj.union(0,3,"2019-08-14 18:00:04");
      obj.union(2,1,"2019-08-14 18:00:05");

    }
}