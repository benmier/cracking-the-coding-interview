public class rotateMatrix{
	// static int[][] rotateMatrix(int[][] arr){
	// 	for(int i: arr){
	// 		for(int j: arr[i]){
	// 			int temp = arr[i][j];
	// 			arr[i][j] = arr[i];
	// 		}
	// 	}

	// 	return arr;		
	// }

	public static void main(String[] args){
		int test[][] = {{1,1,1},{2,2,2},{3,3,3},{4,4,4,4}};
		System.out.println(test.length);
		// rotateMatrix(test);
		System.out.println(java.util.Arrays.deepToString(test));
	}
}