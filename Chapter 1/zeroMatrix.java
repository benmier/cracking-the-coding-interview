public class zeroMatrix{
	static void zeroMatrix(int[][] arr){
		boolean[] rows = new boolean[arr.length];
		boolean[] cols = new boolean[arr[0].length];
		//Find all zeros
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(arr[i][j]==0){
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
		//Set all rows with a zero equal to zero
		for(int i=0; i<rows.length; i++){
			if(rows[i]){
				for(int j=0; j<arr[0].length; j++)
					if(arr[i][j] != 0)
						arr[i][j] = 0;
			}
		}
		//Set all cols with a zero equal to zero
		for(int j=0; j<cols.length; j++){
			if(cols[j]){
				for(int i=0; i<arr.length; i++)
					if(arr[i][j] != 0)
						arr[i][j] = 0;
			}
		}
		return;
	}

	static void zeroMatrixAlternate(int[][] arr){
		boolean rowHasZero = false;
		boolean colHasZero = false;

		//Check if first row has zero
		for(int j=0; j<arr[0].length; j++){
			if(arr[0][j]==0){
				rowHasZero = true;
				break;
			}
		}
		//Check if first col has zero
		for(int i=0; i<arr.length; i++){
			if(arr[i][0]==0){
				colHasZero = true;
				break;
			}
		}
		//Check for zeros in the rest of the array
		for(int i=1; i<arr.length; i++){
			for(int j=1; j<arr[0].length; j++){
				if(arr[i][j]==0){
					arr[0][j] = 0;
					arr[i][0] = 0;
				}
			}
		}
		//Nullify rows based on values in first col
		for(int i=1; i<arr.length; i++){
			if(arr[i][0]==0){
				for(int j=1; j<arr[0].length; j++){
					if(arr[i][j]!=0)
						arr[i][j] = 0;
				}
			}
		}
		//Nullify cols based on values in first row
		for(int j=1; j<arr[0].length; j++){
			if(arr[0][j]==0){
				for(int i=1; i<arr.length; i++){
					if(arr[i][j]!=0)
						arr[i][j] = 0;
				}
			}
		}
		//Nullify first row
		if(rowHasZero){
			for(int j=0; j<arr[0].length; j++){
				if(arr[0][j]!=0)
					arr[0][j] = 0;
			}
		}
		//Nulify first col
		if(colHasZero){
			for(int i=0; i<arr.length; i++){
				if(arr[i][0]!=0)
					arr[i][0] = 0;
			}
		}
		return;
	}

	public static void main(String[] args){
		int test[][] = {{1,1,1,1},{2,2,2,2},{3,0,3,3},{4,4,4,4},{5,5,5,5}};
		System.out.println(java.util.Arrays.deepToString(test));
		zeroMatrixAlternate(test);
		System.out.println(java.util.Arrays.deepToString(test));
	}
}