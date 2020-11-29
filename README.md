Assignment2 Submission Form
==========================================================================
I/we declare that the attached assignment is my/our work in accordance with
Seneca Academic Policy. No part of this assignment has been copied manually or
electronically from any other source (including web sites) or distributed to other
students.
 
Student name: Yuhang Zhao (150467199)
		 	   


Reflection: You should explain briefly (50-100 words) explain what your code is doing and what is the logic behind your ideas.
----------------------------------------------------------------------------------------------------------------------------
Version 2.0: MyString2 and MyString2Test
This MyString2 basically has a few errors when you run the MyString2Test. That's because there are some problems with my equals method 
in MyString2.java. For instance, when I use assertEqual or "==" to compare if two MyString objects are same, I am actually comparing two
references instead of the contents of these two objects. That's not correct, so I made some modifications on it.


Version 3.0: MyString3 and MyString3Test
For the MyString3 and MyString3Test, there are also few error. The problems are that sometimes the arguments for these method to be tested 
are not valid as we imagined. At this time, some exceptions like IllegalArgumentException would occur. In order to dealwith this problem, 
I further refine the MyString3 and get the final version MyString4.


Version 4.0: MyString4 and MyString4Test
This is the final version of this assignment. You can run MyString4Test to test all methods in MyString4. The result shows all methods pass
tests. In addition, MyString4 can deal with some cases with invalid arguments. 

For example, in public char charAt(int index) method, if the value of index is out of range of indexes of array, it will produce an 
IllegalArgumentException telling you "index value is invalid.". This is basically also applied to public MyString4 substring(int beginIndex , int endIndex)
method. If the beginIndex or endIndex arguments violate some conditions, it will also pop up an IllegalArgumentException telling you
"BeginIndex or endindex value is invalid.".

Another thing is to avoid that when an user creates a MySting4 object whose instance variable chars2 is not initialized in like the following:
private char[] chars2 ; 
private MyString4 myString2 = new MyString4(chars2);
I add an additional check at the beginning of every method(except the last static valueOf method) to check if the char array field of
current MyString4 object is null. If yes, throwing a new NullPointerException telling user "The char array of MyString object is null";
otherwise, continue executing the test.
