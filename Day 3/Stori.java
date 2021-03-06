//Give a warm welcome to Stori! 

import java.util.*;

public class Stori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// intializing some variables and a Scanner
		int num;
		Scanner kb = new Scanner(System.in);
		String word = "";
		String worm = "";

		// track loops
		int trackWords = 0;
		int countNums = 0;
		String again = "Y";

		// stores the lists' contents
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Stori intruduction
		System.out.println("Hi, I'm Stori, your own personal list sorter.");

		while (again.equals("Y")) {
			System.out.println("What data would you like me to order?" + "(w for words, n for numbers)");

			// determine what type of list user wants
			String type = kb.nextLine();

			// for if the user wants a list of words
			if (type.equals("w")) {

				// clear list for more entries
				if (trackWords > 0) {
					words.clear();
				}

				System.out.println("Go ahead, enter as many words as you like! Type DONE when you're " + "finished ");

				while (!word.equals("DONE")) {
					word = kb.nextLine();
					// if DONE is entered, program moves on
					if (word.equals("DONE")) {
						break;
					}
					words.add(word);
				}

				// sorting words
				words.sort(Comparator.comparing(String::toString));
				System.out.println(words);
			}

			// for if the user wants a list of numbers
			if (type.equals("n")) {

				// clear list for more entries
				if (countNums > 0) {
					numbers.clear();
				}

				System.out.println("Great, enter as many numbers as you like! Type DONE when you're " + "finished ");

				while (!worm.equals("DONE")) {
					worm = kb.nextLine();
					// if DONE is entered, program moves on
					if (worm.equals("DONE")) {
						break;
					}
					// converts string num (worm) into an integer type
					num = Integer.parseInt(worm);
					numbers.add(num);
				}

				// sorting numbers
				numbers.sort(Comparator.comparing(Integer::valueOf));
				System.out.println(numbers);
			}

			System.out.println("Would you like to sort something else? (Y/N)");
			again = kb.nextLine();
			trackWords++;
			countNums++;

			if (again.equals("N")) {
				System.out.println("Well, I'll be here if you need anything!");
				break;
			}
		}
	}

}
