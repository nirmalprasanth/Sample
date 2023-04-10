package array;

public class Matrix {
	public static void main(String args[]) {

		int arr[][] = new int[2][2];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();
		}
		
		
		int mat[][] = new int[3][3];

		mat[0][0] = 1;
		mat[0][1] = 2;
		mat[0][2] = 3;
		mat[1][0] = 4;
		mat[1][1] = 5;
		mat[1][2] = 6;
		mat[2][0] = 7;
		mat[2][1] = 8;
		mat[2][2] = 9;
		
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);

			}
			System.out.println();
		}
		int m[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]);

			}
			System.out.println();
		}
		
		
		char a[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);

			}
			System.out.println();
		}

	}
	

}
