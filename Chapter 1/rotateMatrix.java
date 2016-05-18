public class rotateMatrix{
	static int[][] rotateMatrix(int[][] arr){
		int count = 0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr[i].length-i; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[arr[i].length-j-1][arr[j].length-i-1];
				arr[arr[i].length-j-1][arr[j].length-i-1] = temp;
				count++;
			}
		}
		System.out.println(count);
		return arr;		
	}

	public static void main(String[] args){
		int test[][] = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};
		System.out.println(java.util.Arrays.deepToString(test));
		rotateMatrix(test);
		System.out.println(java.util.Arrays.deepToString(test));
	}
}