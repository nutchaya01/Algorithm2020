import java.util.ArrayList;
import java.util.Scanner;

public class Raft {
	static ArrayList<String> arrlist = new ArrayList();
	static int[][] input;
	static String sixnum ="";
	public static boolean FindNumber(int row,int col) {
		if (row < 0 || row >= 4 || col < 0 || col >= 4)
			return false;
		if (sixnum.length()==6) {
			//System.out.println(sixnum);
			int same =0;
			for(String a:arrlist) {
				if(sixnum.equals(a)) {
					same++;
				}
			}
			if(same == 0) {
				arrlist.add(sixnum);
			}
			sixnum = "";
			return true;
		}
		
		sixnum+=input[row][col];
		//System.out.println(sixnum);
			
		if (FindNumber(row,col+1)) {
			return true;
		}
		if (FindNumber(row+1,col)) {
			return true;
		}	
		if (FindNumber(row,col-1)) {
			return true;
		}	
		if (FindNumber(row-1,col)) {
			return true;
		}
		
		sixnum = sixnum.substring(0,sixnum.length()-1);
		System.out.println(sixnum);
		
		return false;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		input = new int[5][5];
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				input[i][j] = kb.nextInt();
			}	
		}
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				FindNumber(i,j);
			}	
		}
		
		System.out.println(arrlist.size());
		//for(String a:arrlist) {
		//	System.out.print(a+" ");
		//}
		
		
		
		
		//for(int i=0;i<input.length;i++) {
		//	for(int j=0;j<input[i].length;j++) {
		//		System.out.print(input[i][j]+" ");
		//	} System.out.println();
		//}

	}

}
