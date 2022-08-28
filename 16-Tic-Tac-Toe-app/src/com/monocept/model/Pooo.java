package com.monocept.model;

import java.util.Scanner;

public class Pooo {
	
	public static void Printarray(int[][] arr)
	{
		for(int i = 0; i < 4; i ++)
		{
			for(int j = 0; j < 2; j ++)
			{
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Tic-Tac-Toe grid : ");
		n = sc.nextInt();
		int i, j, flag = 0, temp = 0, count = 0;
		char Currentplayer = 'X';
		char[][] Grid = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		int[][] row = new int[n][2];
		int[][] col = new int[n][2];
		int[][] diagonal = { { 0, 0 }, { 0, 0 } };
		for(int iter = 0; iter < n; iter ++)
		{
			row[iter][0] = 0;
			row[iter][1] = 0;
			col[iter][0] = 0;
			col[iter][1] = 0;
		}
		while (count < (n * n)) {
			System.out.print("Player '" + Currentplayer + "', enter your move (row[1-3] column[1-3]): ");
			i = sc.nextInt() - 1;
			j = sc.nextInt() - 1;
			if (Grid[i][j] == ' ') {
				Grid[i][j] = Currentplayer;
				row[i][flag] += 1;
				col[j][flag] += 1;
				if ((i + j) % 2 == 0) {
					if (i == 1 && j == 1) {
						diagonal[0][flag] += 1;
						diagonal[1][flag] += 1;
						temp = Math.max(diagonal[0][flag], diagonal[1][flag]);
					} else if ((i + j) == 2) {
						diagonal[0][flag] += 1;
						temp = diagonal[0][flag];
					} else if(i == j)
					{
						diagonal[1][flag] += 1;
						temp = diagonal[1][flag];
					}
				}

				if (row[i][flag] == n || col[j][flag] == n || temp == n) {
					System.out.println("\nPlayer '" + Currentplayer + "' won!");
					break;
				}
				if (flag == 0) {
					flag = 1;
					Currentplayer = 'O';
				} else {
					Currentplayer = 'X';
					flag = 0;
				}
				count += 1;
			} else {
				System.out.println("This move at (" + (i + 1) + "," + (j + 1) + ") is not valid. Try again...");
			}
		}
		if (count == (n * n))
			System.out.println("\nMatch Draw");
	}

}
