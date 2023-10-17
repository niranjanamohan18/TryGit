package com.project;

import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player{
	
	AIPlayer(String name, char mark){
		this.name = name;
		this.mark = mark;
	}
	
	void makeMove() {
		Scanner scan = new Scanner(System.in);
		int row;
		int col;
		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
		}
		while(!isValidMove(row, col));
		
		TicTacToe.placeMark(row, col, mark);
	}

}
