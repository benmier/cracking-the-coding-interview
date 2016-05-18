public class rotateMatrix{
	static int[][] rotateMatrix(int[][] arr){
		System.out.println(Arrays.deepToString(arr));
	}

	public static void main(String[] args){
		int test[][] = {{1,1,1},{2,2,2},{3,3,3}};
		System.out.println(rotateMatrix(test));
	}
}