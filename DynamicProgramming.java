class DynamicProgramming{

// utility fuction, returns max of 2 int
  static int max(int a, int b){
    return a > b ? a : b;
  }
  // max valule that can be put in the knapsack (max W)
  static int knapSack(int W, int wt[], int val[], int n){
    int i , w;
    int K[][] = new int[n + 1][W + 1];
    // build table for K, bottom up
    for(i = 0; i <= n; i++) {
      for(w = 0; w <= W; w++ ){
        if(i == 0 || w == 0){
          K[i][w] =0;
        }
        else if( wt[i -1] <= w){
          K[i][w] = max(val[i-1] + K[i-1][w- wt[i-1]] , K[i-1][w]);
        }
        else{
          K[i][w] = K[i-1][w];
        }

      }
    }
    return K[n][W];
  }
  // test of the function
  public static void main(String[] args){
    int val[] = new int[] {20, 200, 430};
    int wt[] = new int[] {5,10,15};
    int W = 50;
    int n = val.length;

    System.out.println(knapSack(W, wt, val, n));
  }
}
