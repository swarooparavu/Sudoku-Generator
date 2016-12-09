package org.sudokugen;

import java.util.Random;

public class Sudoku {
	static int [][] board = new int[4][4];
	static int [] row3 = new int[4];
	static int [] coll = new int[4];
	static final int rangeMax = 3, rangeMin = 0, maxDigitValue = 4, minDigitValue = 1, minNumbersToGenerate = 4, maxNumbersToGenerate = 6;
	static int[][] grid = new int[4][4];
	static int row = 0;
	static int col = 0;
	static int randomNumber = 0;
	static int noOfCellsToBeGenerated = 0;
	static Random random = new Random();
	public static int Random_num(int x, int y){
		
		return NumGen.get_random_num(x,y);
		
	}
	public static int[] row_put(){
		for(int i=0;i<4;i++){
			row3[i] = Random_num(4,1);
		}
		if(NumGen.legal_move2(row3)){
			return coll_put(row3);
		}
		return row3;
	}
	public static int[] coll_put(int[] row2){
		for(int i=0;i<4;i++){
			coll[i] = Random_num(4,1);
		}
		if(NumGen.legal_move2(coll)){
			
			return put_num(row2);
		}
		return coll;
	}
	
	
	private static int[] put_num(int[] row2) {
		// TODO Auto-generated method stub
		return null;
	}
	public static int[][] generatePuzzle() {
		for (int i = 1; i <= noOfCellsToBeGenerated; i++) {
			row = random.nextInt(( rangeMax - rangeMin) + 1) + rangeMin;
			col = random.nextInt(( rangeMax - rangeMin) + 1) + rangeMin;
			randomNumber = random.nextInt((maxDigitValue - minDigitValue) + 1) + minDigitValue;

			if (grid[row][col] == 0 && NumGen.checkInsertedNumbers(grid, row, col, randomNumber)) {
				grid[row][col] = randomNumber;
			} else {
				i--;
			}
			
		}
		return grid;
	}
	public static void printPuzzle(int[][] grid) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	

}
