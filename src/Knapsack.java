import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int M = kb.nextInt();
		n++; M++;
		Item[] iArr = new Item[n];
		Item start = new Item(0,0);
		iArr[0] = start;
		for (int i=1;i<n;i++) {
			int p = kb.nextInt();
			int w = kb.nextInt();
			Item item = new Item(p,w);
			iArr[i] = item;
		}
		System.out.println(knap(iArr,n,M));
	}
	
	public static int knap(Item[] arr,int n,int M) {
		int[][] value = new int[n+1][M+1];
		
		for(int i=0;i<n;i++) {
			value[i][0] = 0;
		}
		for(int j=0;j<M;j++) {
			value[0][1] = 0;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<M;j++) {
				if(i>0 && j>=arr[i].getWeight()) {
					value[i][j] = Integer.max(value[i-1][j], arr[i].getValue()+value[i-1][j-arr[i].getWeight()]);
				}else if(j<arr[i].getWeight()) {
					value[i][j] = value[i-1][j];
				}
			}
		}
		
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(value[i][j]+" ");
			}
			System.out.println();
		}*/
		
		return value[n-1][M-1];
	}

}

class Item {
	private int value;
	private int weight;
	
	Item(int value,int weight){
		this.value = value;
		this.weight = weight;	
	}

	public int getValue() {
		return value;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Item value=" + value + ", weight=" + weight;
	}

}
