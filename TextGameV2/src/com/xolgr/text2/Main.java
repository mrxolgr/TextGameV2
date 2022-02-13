package com.xolgr.text2;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		gameTitle();
	}
	
	public static void gameTitle() {
		System.out.println("- TEXT GAME: DOSTOEVSKY EDITION -");
		System.out.println("\nPress 'e' to begin.");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		if(input.equals("e")) {
		    game();
		} else {
			System.out.println("\nThat's not the letter 'e'!");
		}
	}
	
	public static void game() {
		System.out.println("\n------------------------\n\tSTORY\n------------------------\n");
		System.out.println("It's a cold day.\nYou're sitting down with a nice cup of hot chocolate.\nYou decide that you want to read a book, and approach your bookshelf.\n\n'What book will you read?'\n\n1. Crime and Punishment\n2. The Idiot\n3. The Demon\n4. None");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		switch(input) {
			case "1":
			case "1.":
			case "crime and punishment":
			case "Crime and Punishment":
			case "CRIME AND PUNISHMENT":
				firstOption();
		}
		
		switch(input) {
			case "2":
			case "2.":
			case "the idiot":
			case "The Idiot":
			case "THE IDIOT":
				secondOption();
		}
		
		switch(input) {
			case "3":
			case "3.":
			case "the demon":
			case "The Demon":
			case "THE DEMON":
				thirdOption();
		}
		
		switch(input) {
			case "4":
			case "4.":
			case "none":
			case "None":
			case "NONE":
				fourthOption();
		}
	}
	
	public static void firstOption() {
		System.out.println("\n------------------------------------------\n\t1. CRIME AND PUNISHMENT\n------------------------------------------\n");
		System.out.println("You decided to grab: Crime and Punishment by Dostoevsky.\nIt's a great thriller about a Russian man in poverty who contemplates whether or not he should kill a crooked lady for some extra cash.\n\nNice!");
		System.out.println("\nPress 'e' for your ending!");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.equals("e")) {
		    goodEnding();
		} else {
			System.out.println("\nThat's not the letter 'e'!");
		}
	}
	
	public static void secondOption() {
		System.out.println("\n------------------------------\n\t2. THE IDIOT\n------------------------------\n");
		System.out.println("You decided to grab: The Idiot by Dostoevsky.\n...\n\nNice!");
		System.out.println("\nPress 'e' for your ending!");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.equals("e")) {
		    goodEnding();
		} else {
			System.out.println("\nThat's not the letter 'e'!");
		}
	}
	
	public static void thirdOption() {
		System.out.println("\n------------------------------\n\t2. THE DEMON\n------------------------------\n");
		System.out.println("You decided to grab: The Demon by Dostoevsky.\n...\n\nNice!");
		System.out.println("\nPress 'e' for your ending!");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.equals("e")) {
		    goodEnding();
		} else {
			System.out.println("\nThat's not the letter 'e'!");
		}
	}
	
	public static void fourthOption() {
		System.out.println("\n------------------------------\n\t4. NONE\n------------------------------\n");
		System.out.println("You decided to grab: ...nothing.\n...\n\nYou spilled your hot chocolate, slipped, and died. The end. Fuck off.");
		System.out.println("\nPress 'e' for your ending!");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.equals("e")) {
		    badEnding();
		} else {
			System.out.println("\nThat's not the letter 'e'!");
		}
	}
	
	public static void goodEnding() {
		System.out.println("\n------------------------------\n\tGOOD ENDING\n------------------------------\n");
		System.out.println("Congrats! You got the 'Good Ending'!\nYou fell asleep graciously as the brewing storm outside died down.");
	}
	
	public static void badEnding() {
		System.out.println("\n------------------------------\n\tBAD ENDING\n------------------------------\n");
		System.out.println("Congrats! You got the 'Bad Ending'!\nYou died because you didn't read Dostoevsky!\nR.I.P.!");
	}
}