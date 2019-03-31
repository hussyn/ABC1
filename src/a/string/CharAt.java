package a.string;

/*whats String

type of string

usage of different types of strings*/

public class CharAt {
	
    public static void encode(String text, int shift) {
        System.out.print("The encoded message: ");
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            // shift only letters (leave other characters alone)
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + shift);

                // may need to wrap around
                if (letter > 'z') {
                    letter = (char) (letter - 26);
                } else if (letter < 'a') {
                    letter = (char) (letter + 26);
                }
            }
            System.out.print(letter);
        }
        System.out.println();
    }


	
	public static void main(String[] args) {
		
	
	for (char c = 'a'; c <= 'z'; c++) {
	    System.out.print(c);
	}

	}
}
