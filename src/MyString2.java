
/**
 * This "MyString2" class is version 2.0.  
 *
 */
public class MyString2 {
	private char[] chars;
	
	/**
	 * MyString2 Constructor: Allocates a new MyString instance so that it represents the sequence of characters currently contained 
	 * in the character array argument. 
	 * @param chars
	 */
	public MyString2(char[] chars) {
		this.chars = chars;
	}
	
	/**
	 * Prints this MyString instance.
	 */
	public void printMyString() {
		for (char c: this.chars) {
			System.out.print(c);
		}
	}
	
	/**
	 * return the length of this MyString instance
	 * @return the length of this MyString instance.
	 */
	public int length() {
		int numberOfString = this.chars.length;
		return numberOfString;
	}
	
	/**
	 * return the char value at the specified index
	 * @param index
	 * @return the char value at the specified index
	 */
	public char charAt(int index) {
		if (index >=0 && index < (this.chars.length - 1) ) {
			return this.chars[index];
		}else {
			throw new IllegalArgumentException("index value is invalid.");
		}
	}
	
	/**
	 * 
	 * @param beginIndex
	 * @param endIndex
	 * @return a MyString instance that is a substring of this MyString instance. 
	 */
	public MyString2 substring(int beginIndex , int endIndex) {
		
		int length = endIndex - beginIndex;
		char[] newChar = new char[length];
		
		for (int i=beginIndex, j=0; i<endIndex && j<(endIndex - beginIndex); i++, j++) {
			newChar[j] = this.chars[i];
			j++;
		}
		
		MyString2 newString = new MyString2(newChar);
		return newString;
	}
	
	/**
	 * Converts all of the characters in this MyString instance to lower case
	 * @return the lower case of MyString object
	 */
	public MyString2 toLowerCase() {
		char[] newChar = new char[this.chars.length];
		for(int i=0;i<this.chars.length;i++) {
			newChar[i] = Character.toLowerCase(this.chars[i]);
		}
		//System.out.println(newChar);
		MyString2 newString = new MyString2(newChar);
		return newString;
	}
	
	/**
	 * Compares this MyString instance to the specified MyString instance. (Specifically compare whether or not two char arrays of 
	 * two MyString objects are equal)
	 * @param s
	 * @return boolean(true if if and only if the argument is not null and is a MyString object that represents the same sequence of 
	 * characters as this MyString object., false otherwise)
	 */
	public boolean equals(MyString2 s) {
		if(this == s) return true;
		if(s == null) return false;
		if(getClass() != s.getClass()) return false;
		if(this.chars!=s.chars) return false;
		if(this.chars == null) {
			if(s.chars!=null) return false;
		}else if(!this.chars.equals(s.chars)) return false;
		return true;
		
	}
	
	/**
	 * Returns the MyString representation of the int argument.
	 * @param i
	 * @return the MyString representation of the int argument
	 */
	public static MyString2 valueOf(int i) {
		int length = 0;
		while ((i=i/10) != 0) {
			length++;
		}
		char[] newChar = new char[length];
		for(int j = newChar.length-1; j>=0; j--) {
			newChar[j] = (char)(i % 10 + 48);
			i = i / 10;
		}
		MyString2 newString = new MyString2(newChar);
		return newString;
	}
	
	/**
	 * get the chars field
	 * @return char[]
	 */
	public char[] getChars() {
		return this.chars;
	}
}
