import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		 //System.out.println(Double.POSITIVE_INFINITY);
		 Scanner kb = new Scanner (System.in);
		 int n = kb.nextInt();
		 int N = kb.nextInt();
		 int coin[] = new int[n];
		 
		 for(int i=0;i<n;i++) {
			 coin[i] = kb.nextInt();
		 }
		 
		 Arrays.sort(coin);
		 
		 System.out.println(change(coin,N));
		 /*int c[][] = new int[n+1][N+1];
		 for(int i=0;i<=n;i++) {
			 for(int j=0;j<=N;j++) {
				 if (i==0) {
					 c[i][j] = Integer.MAX_VALUE;
				 }else if(j==0) {
					 c[i][j] = 0;
				 }else {
					 if (j-coin[i] >= 0) {
						 if (j%coin[i] == 0) {
							 c[i][j] = j/coin[i];
						 }else {
							 int x = j-coin[i];
							 c[i][j] = c[i][x];
						 }
					 }else {
						 c[i][j] = Integer.MAX_VALUE;
					 }
					 //if(c[i][j] > c[i-1][j] ) {
						//	 c[i][j] = c[i-1][j];
					//}
				 }
			 }
		 }
		 
		 for(int i=2;i<=n;i++) {
			 for(int j=1;j<=N;j++) {
				c[i][j] = Integer.min(c[i-1][j], c[i][j-coin[i]]);	
			 }
		 }
		 
		// System.out.println(c[n][N]);
		 for(int i=0;i<=n;i++) {
			 for(int j=0;j<=N;j++) {
				 System.out.print(c[i][j] + " "); 
			 }
			 System.out.println();
		 }*/

	}
	public static int change(int[] sortedCoins,int x) {
		
		double c[][] = new double[sortedCoins.length+1][x+1];
		
		for(int i = 1; i <= sortedCoins.length; i++){
			for(int j = 0; j <= x; j++){
					c[0][j] = Double.POSITIVE_INFINITY;
					c[i][0] = 0;
			}
		}
		/*for(int i = 0; i <= sortedCoins.length; i++){
		 	for(int j=0;j<=x;j++) {
			 	System.out.print(c[i][j] + " "); 
		 	}
		 	System.out.println();
		}*/
		
		  for(int i = 1; i <= sortedCoins.length; i++){
			  for(int j = 1; j <= x; j++){
				  if(sortedCoins[i - 1] <= j)
					  c[i][j] = Double.min(1 + c[i][j - sortedCoins[i - 1]], c[i - 1][j]);
				  else
					  c[i][j] = c[i - 1][j];
			  }
		  }
		  
		/*for(int i = 0; i <= sortedCoins.length; i++){
			 for(int j=0;j<=x;j++) {
				 System.out.print(c[i][j] + " "); 
			 }
			 System.out.println();
		}*/
		  return (int)c[sortedCoins.length][x];
	  }
	}


