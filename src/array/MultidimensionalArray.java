package array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numArr = new int[3][3];
        // providing values for array
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                numArr[i][j] = i + j;
            }
        }
        // Displaying array elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" " + numArr[i][j]);
            }
            System.out.println();
	}
	}
}
