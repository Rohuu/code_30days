import java.util.Scanner;
class Main {

  public static int diagonalDifference(int[][] arr,int n){
    int d1=0;
        int d2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    d1=d1+arr[i][j];
                }
                if(i+j==n-1){
                    d2=d2+arr[i][j];
                }
            }
        }
        int answer=(d1-d2);
        return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
   int ans= diagonalDifference(arr,n);
    System.out.println(ans);
    }
}
    
