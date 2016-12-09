package org.sudokugen;

public class Main extends Sudoku {
	public static void main(String[] args){
		noOfCellsToBeGenerated = random.nextInt((maxNumbersToGenerate - minNumbersToGenerate) + 1) + minNumbersToGenerate;
		grid = Sudoku.generatePuzzle();
		Sudoku.printPuzzle(grid);
	}
	
}