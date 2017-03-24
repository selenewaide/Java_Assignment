package assignment1;

public class MyCharacter {
	
	// Returns true if ch is a lowercase character ('a' to 'z'); false otherwise.
	public static boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	// Returns true if ch is an uppercase character ('A' to 'Z'); false otherwise.
	public static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// Returns true if ch is a digit ('0' to '9'); false otherwise.
	public static boolean isDigit(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	// Returns true if ch is a space (' ') or tab ('\t') character; false otherwise.
	public static boolean isWhitespace(char ch) {
		return (ch == ' ' || ch == '\t');
	}

	// Returns the lowercase equivalent of ch, if any; otherwise, ch itself is returned.
	public static char toLowerCase(char ch) {
		// if the character is uppercase, convert it to lowercase and return, otherwise return it as is
		if (isUpperCase(ch)) {
			char lChar = (char) (ch + 32);
			return lChar;
		} else {
			return ch;
		}
	}

	// Returns the uppercase equivalent of ch, if any; otherwise, ch itself is returned.
	public static char toUpperCase(char ch) {
		// if the character is lowercase, convert it to uppercase and return, otherwise return it as is
		if (isLowerCase(ch)) {
			char uChar = (char) (ch - 32);
			return uChar;
		} else {
			return ch;
		}
	}
}
