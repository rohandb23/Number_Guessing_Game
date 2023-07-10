package com.aurionpro.test;

import java.util.Scanner;

import java.lang.Math;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances;
		int answer = (int)(Math.random()*100)+1;
		//System.out.println("answer is : "+answer);
		System.out.println("you have to guess number correctly in 6 turns to win game");
		for(chances=6; chances>=1; chances--) {
			System.out.println("you have "+chances+" chances left");
			System.out.println("enter your guess : ");
			int guess = sc.nextInt();
			if(guess>=1 && guess<=100) {
				if(guess<answer) {
					System.out.println("your choice is low enter higher number!!");
				}
				else if(guess>answer) {
					System.out.println("your choice is high enter lower number!!");
				}
				else if(guess==answer){
					System.out.println(guess+" is correct guess!!");
					System.out.println("you won");
					break;
				}
				/*
				else {
					System.out.println("you have run out of chances, you LOSE");
					System.out.println("correct number is : "+answer);
					break;
				}
				*/
			}
			else {
				System.out.println("invalid input");
				chances++;
			}
		}
		if(chances==0) {
			System.out.println("you have run out of chnaces ");
			System.out.println("correct number was : "+answer);
		}
	}

}
