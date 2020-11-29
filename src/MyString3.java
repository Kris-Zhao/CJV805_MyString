/**
 * This "MyString3" class is version 3.0.  
 *
 */
public class MyString3 {
	private char[] chars;
	
	/**
	 * MyString3 Constructor: Allocates a new MyString instance so that it represents the sequence of characters currently contained 
	 * in the character array argument. 
	 * @param chars
	 */
	public MyString3(char[] chars) {
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
	 * Return the char value at the specified index
	 * @param index
	 * @return the char value at the specified index
	 */
	public char charAt(int index) {
		
		return this.chars[index];
		
	}
	
	/**
	 * Return a MyString instance that is a substring of this MyString instance.
	 * @param beginIndex
	 * @param endIndex
	 * @return a MyString instance that is a substring of this MyString instance. 
	 */
	public MyString3 substring(int beginIndex , int endIndex) {
		
		
		int length = endIndex - beginIndex;
		
		
		char[] newChar = new char[length];
			
		for (int i=beginIndex; i<endIndex; i++) {
			newChar[i-beginIndex] = this.chars[i];
		}
		System.out.println(newChar);
		MyString3 newString = new MyString3(newChar);
		return newString;
		
		
	}
	
	/**
	 * Converts all of the characters in this MyString instance to lower case
	 * @return the lower case of MyString object
	 */
	public MyString3 toLowerCase() {
		char[] newChar = new char[this.chars.length];
		for(int i=0;i<this.chars.length;i++) {
			newChar[i] = Character.toLowerCase(this.chars[i]);
		}
		//System.out.println(newChar);
		MyString3 newString = new MyString3(newChar);
		return newString;
	}
	
	/**
	 * Compares this MyString instance to the specified MyString instance. (Specifically compare whether or not two char arrays of 
	 * two MyString objects are equal)
	 * @param s
	 * @return boolean(true if if and only if the argument is not null and is a MyString object that represents the same sequence of 
	 * characters as this MyString object., false otherwise)
	 */
	public boolean equals(MyString3 s) {
		int count = 0;
		if(this == s) return true;
		if(s == null) return false;
		if(getClass() != s.getClass()) return false;
		if(this.length() != s.length()) return false;
		
		char[] newCharsArray = s.getChars();
		
		for(int i=0; i< this.length(); i++) {
			if((this.getChars())[i] == newCharsArray[i]) count++;
		}
		
		if(count == this.length()) return true;
		else return false;
		
	}
	
	/**
	 * Returns the MyString representation of the int argument.
	 * @param i
	 * @return the MyString representation of the int argument
	 */
	public static MyString3 valueOf(int i) {
		
		int number = i;
		int length = 0;
		while ((i=i/10) != 0) {
			length++;
		}
		char[] newChar = new char[length+1];
		for(int j = (newChar.length-1); j>=0; j--) {
			newChar[j] = (char)(number % 10 + 48);
			number = number / 10;
		}
		
		MyString3 newString = new MyString3(newChar);
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
