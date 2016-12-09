package org.sudokugen;

import java.util.stream.*;
public class NumGen {

	public static int get_random_num(int max, int min) {
		int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		
		
		//return 0;
	}
	public static boolean checkInsertedNumbers(int[][] sudokuMatrix, int rowNumber, int columnNumber, int insertNumber) {
		for (int i = 0; i < 4; i++) {
			if (sudokuMatrix[rowNumber][i] == insertNumber) {
				return false;
			}
			if (sudokuMatrix[i][columnNumber] == insertNumber) {
				return false;
			}
		}
		int gridRow = rowNumber - (rowNumber % 2);
		int gridColumn = columnNumber - (columnNumber % 2);
		for (int p = gridRow; p < gridRow + 2; p++) {
			for (int q = gridColumn; q < gridColumn + 2; q++) {
				if (sudokuMatrix[p][q] == insertNumber) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean legal_move2(int[] row){
		//boolean m;
		//int[] a = board[i];
		int sum = IntStream.of(row).sum();
		if(sum!=10){
			return false;
		}
		
		
	 return true;
		
		
	}

}
