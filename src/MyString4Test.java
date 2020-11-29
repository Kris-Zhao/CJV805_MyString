import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit Test for MyString4
 *
 */
public class MyString4Test {
	private char[] chars = {'A', 'P', 'P', 'L', 'E'}; 
	private MyString4 myString = new MyString4(chars);
	
	private char[] chars2 ; 
	private MyString4 myString2 = new MyString4(chars2);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Version 4.0: MyString4Test beginning");
		System.out.println("I am going use A P P L E to test all methods.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("\nTest ending");
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	
	/**
	 * Test printMyString method. the result should be printed as "APPLE" on the console.
	 */
	@Test
	public void printMyStringTest() {
		
		System.out.println("Test printMyString method:");
		myString.printMyString();
		
	}
	/**
	 * Test printMyString method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void printMyStringForNullTest() {
		myString2.printMyString(); //check the case when the char array of one MyString object is null.
	}
	
	
	
	/**
	 * Test length method. the result should be equal to the length of "APPLE", 5.
	 */
	@Test
	public void lengthTest() {
		assertEquals(myString.length(), 5);
	}
	/**
	 * Test length method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void lengthForNullTest() {
		myString2.length(); //check the case when the char array of one MyString object is null.
	}
	
	
	
	/**
	 * Test charAtTest method. Here, I tested it using the second character in "APPLE", and to see whether or not they are identical.
	 */
	@Test
	public void charAtTest() {
		
		char secondChar = 'P';
		assertEquals(myString.charAt(1), secondChar);
	}
	/**
	 * Test charAtTest method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void charAtForNullTest() {
		myString2.charAt(1); //check the case when the char array of one MyString object is null.
	}
	/**
	 * Test charAtTest method when arguments to this method are invalid. It should throw an IllegalArgumentException.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void charAtWithInvalidArgumentsTest() {
		myString.charAt(-1);
	}
	
	
	
	
	/**
	 * Test substring method. Here, the substring that I want to get is 'P', 'P', 'L'. I use substring(1, 4) method to see if I can get
	 * P', 'P', 'L' from the original char array.
	 */
	@Test
	public void substringTest() {
		char[] newChar = {'P', 'P', 'L'};
		MyString4 newMyString = new MyString4(newChar);
		int j = 0;
		
		MyString4 subString = myString.substring(1, 4);
		
		for(int i=0; i<subString.length(); i++) {
			if ((subString.getChars())[i] == (newMyString.getChars())[i]) j++;
		}
		
		if(j==subString.length()) assertTrue(true);
		else assertTrue(false);
		
	}
	/**
	 * Test substring method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void substringForNullTest() {
		myString2.substring(1, 4); //check the case when the char array of one MyString object is null.
	}
	/**
	 * Test substring method when arguments to this method are invalid. It should throw an IllegalArgumentException.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void substringWithInvalidArgumentsTest() {
		myString.substring(1, 10);
	}
	
	
	
	
	/**
	 * Test toLowerCase. Check after using toLowerCase() method, the result is whether or not equal to "apple"(all lower case).
	 */
	@Test
	public void toLowerCaseTest() {
		char[] newChar = {'a', 'p', 'p', 'l', 'e'};
		MyString4 newMyString = new MyString4(newChar);
		int j = 0;
		
		MyString4 changedString = myString.toLowerCase();
		
		
		for(int i=0; i<myString.length(); i++) {
			if ((changedString.getChars())[i] == (newMyString.getChars())[i]) j++;
		}
		if(j==myString.length()) assertTrue(true);
		else assertTrue(false);
	}
	/**
	 * Test toLowerCase method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void toLowerCaseForNullTest() {
		myString2.toLowerCase(); //check the case when the char array of one MyString object is null.
	}
	
	
	
	/**
	 * Test equals method. Check if two MyString objects' char arrays are equal.
	 */
	@Test
	public void equalsTest() {
		char[] newChar = {'A', 'P', 'P', 'L', 'E'};
		MyString4 newMyString = new MyString4(newChar);
		assertTrue(myString.equals(newMyString));
	}
	/**
	 * Test equals method when the char array of one MyString object is null. It should throw a NullPointerException.
	 */
	@Test(expected = NullPointerException.class)
	public void equalsForNullTest() {
		char[] newChar = {'A', 'P', 'P', 'L', 'E'};
		MyString4 newMyString = new MyString4(newChar);
		myString2.equals(newMyString); //check the case when the char array of one MyString object is null.
	}
	
	
	
	/**
	 * Test valueOf method. In this case, the int number that I want to test is -1234. After using valueOf method on this number, check
	 * if the result from this method is the MyString representation of the int argument -1234.
	 */
	@Test
	public void valueOfTest() {
		int number = -1234;
		//int number = 0;
		MyString4 mystring = MyString4.valueOf(number);
		
		char[] newCharArray = {'-', '1', '2', '3', '4'};
		//char[] newCharArray = {'0'};
		MyString4 newString = new MyString4(newCharArray);
		
		int count = 0;
		for (int i=0; i<mystring.length(); i++) {
			if((mystring.getChars())[i] ==  (newString.getChars())[i]) count++;	
		}
		if(count == newString.length()) assertTrue(true);
		else assertTrue(false);
		
		
	}
	
	
}
