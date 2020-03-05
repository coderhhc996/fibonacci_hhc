package fibonacci;

public class FibonacciMain {
 
 public static void main(String[] args) {
  for(int i=1 ; i <= 200 ; i++){
   System.out.print("Fibonacci.of(" + i + ")==");
   of(i);
   System.out.println("\n");
  }
        
 }
 
 public static int of(int n) {
  long [][]m=new long[201][5];
     int i,j;
  long d=0;
     for(i=0;i<201;i++){
      for(j=0;j<5;j++){
       m[i][j]=0;
      }
     }
     m[0][0]=m[1][0]=1;
     for(i=2;i<201;i++){
      for(j=0;j<5;j++){
       m[i][j]=m[i-1][j]+m[i-2][j]+d;
       d=m[i][j]/1000000000;
       m[i][j]=m[i][j]%1000000000;
      }
     }
     int f=0;
     for(i=4;i>=0;i--){
      if(m[n][i]!=0){
       f=1;
       System.out.print(m[n][i]);
      }
      else if(f==1){
           System.out.print(m[n][i]); 
      }
     }
  
  return 0;
  }

}