package assignment1;

public class MyString {
	// Returns a new string with the characters in str converted to lowercase.
	public static String toLowerCase(String str) {
		String lString = "";
		for (int i = 0; i < str.length(); i++) {
	        if (Character.isUpperCase(str.charAt(i))) {
	        	lString += MyCharacter.toLowerCase(str.charAt(i));
	        } else {
	        	lString += str.charAt(i);
	        }
	    }
		return lString;
	}

	// Returns a new string with the characters in str converted to uppercase.
	public static String toUpperCase(String str) {
		String uString = "";
		for (int i = 0; i < str.length(); i++) {
	        if (Character.isLowerCase(str.charAt(i))) {
	        	uString += MyCharacter.toUpperCase(str.charAt(i));
	        } else {
	        	uString += str.charAt(i);
	        }
	    }
		return uString;
	}

	// Returns true if the two strings s1 and s2 are equal; false otherwise. 
	// Two strings are considered equal if they are of the same length and 
	// corresponding characters in the two strings are equal.
	public static boolean equals(String s1, String s2) {
		
		// set checker to true, if there is a mismatch, it is set to false
		boolean checkEquals = true;
		
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
		        if ((s1.charAt(i) == s2.charAt(i)) && checkEquals) {
		        	continue;
		        } else {
		        	checkEquals = false;
		        }
		    }
		} else {
			checkEquals = false;
		}
		return checkEquals;	
	}
	
	// Returns true if the two strings s1 and s2 are equal ignoring case; false 
	// otherwise. Two strings are considered equal if they are of the same length 
	// and corresponding characters in the two strings are equal ignoring case.
	public static boolean equalsIgnoreCase(String s1, String s2) {
		String lowerS1 = toLowerCase(s1);
		String lowerS2 = toLowerCase(s2);
		
		return equals(lowerS1, lowerS2);
	}

	// Returns a new string with every occurrence of character ch1 in str replaced 
	// with character ch2.	
	public static String replace(String str, char ch1, char ch2) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == ch1) {
	        	newString += ch2;
	        } else {
	        	newString += str.charAt(i);
	        }
	    }
		return newString;
	}

	// Returns a new string with all leading and trailing whitespace characters (space 
	// or tab characters) in str removed.
	public static String trim(String str) {
		String newString = "";
		
		int headCounter = 0;
		String headString = "";
		
		int tailCounter = 0;
		String tailString = "";
		
		for (int i = 0; i < str.length(); i++) {
	        if (MyCharacter.isWhitespace(str.charAt(i)) && headString == "") {
	        	headCounter++;
	        } else {
	        	headString += str.charAt(i);
	        }
	    }
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (MyCharacter.isWhitespace(str.charAt(i)) && tailString == "") {
	        	tailCounter++;
	        } else {
	        	tailString += str.charAt(i);
	        }
	    }
		
		for (int i = headCounter; i < (str.length() - tailCounter); i++) {
	        newString += str.charAt(i);
	    }
		
		return newString;
	}
	
	// Returns true if str starts with the specified prefix; false otherwise.
	public static boolean startsWith(String str, String prefix) {
		
		String newString = "";
		
		if (str.length() >= prefix.length()) {
			
			for (int i = 0; i < prefix.length(); i++) {
		        newString += str.charAt(i);
		    }
			
		}
		return MyString.equals(newString, prefix);
	}

	// Returns true if str ends with the specified suffix; false otherwise.
	public static boolean endsWith(String str, String suffix) {
		String newString = "";
		
		if (str.length() >= suffix.length()) {
			
			for (int i = (str.length() - suffix.length()); i < str.length(); i++) {
		        newString += str.charAt(i);
		    }
			
		}
		return MyString.equals(newString, suffix);
	}
}
