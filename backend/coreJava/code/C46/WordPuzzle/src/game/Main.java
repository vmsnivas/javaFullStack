package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static String jumble(String word) {
		int count = 0;
		boolean []check = new boolean[word.length()];
		Random r = new Random();
		String result = "";
		while(count < word.length()) {
			int idx = r.nextInt(word.length());
			if(check[idx]) continue;
			result = result + word.charAt(idx);
			count++;
			check[idx] = true;
		}
		if(result.equals(word)) {
			return jumble(word);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String []words = {"APPLE","ROBOT","TIGER","PLUM","BOTTLE","CHAIR","WATCH"};
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. Start a new game");
			System.out.println("2. Exit");
			System.out.println("===================");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				int idx = random.nextInt(7);
				String actualWord = words[idx];
				String jumbledWord = jumble(actualWord);
				System.out.println("Jumbled word: " + jumbledWord);
				
				System.out.println("Your solved word: ");
				scanner.nextLine();
				String word = scanner.nextLine().toUpperCase();
				if(word.equals(actualWord)) {
					System.out.println("You won");
				}
				else {
					System.out.println("You lost");
				}
				
			}
			else if(choice == 2) break;
			else System.out.println("Wrong Choice");
		}
	}
}
