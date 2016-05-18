public class rotateMatrix{
	static int[][] rotateMatrix(int[][] arr){
		for(int i=0; i<arr.length/2; i++){
			for(int j=0; j<arr[i].length/2; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[arr[i].length-i-1][arr[j].length-j-1];
				arr[arr[i].length-i-1][arr[j].length-j-1] = temp;
			}
			break;
		}

		return arr;		
	}

	public static void main(String[] args){
		int test[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		System.out.println(java.util.Arrays.deepToString(test));
		rotateMatrix(test);
		System.out.println(java.util.Arrays.deepToString(test));
	}
}