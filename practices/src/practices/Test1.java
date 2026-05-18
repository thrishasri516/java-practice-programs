package practices;

public class Test1{
		public static void main(String[] args) {
			// 2d array contains row and column when 1d has only row
			int[][]  arr=new int[3][3];
			arr[1][0] =45;
			arr[2][1] =35;
			arr[0][2] =90;
			
			for(int i=0;i<arr.length;i++){
			    for(int j=0;j<arr[i].length;j++){
			        System.out.print(arr[i][j]+"  ");
			    }
			    System.out.println();
			}
			
			int[][] a={{1,2,5},{10,20,50}};
			
			int[][]  myArr=new int[2][3];
			
			for(int k=0;k<a.length;k++) {
				for(int l=0;l<a[k].length;l++) {
					System.out.print(a[k][l]+"  ");
				}
				System.out.println();
			}
			    
		}
}
