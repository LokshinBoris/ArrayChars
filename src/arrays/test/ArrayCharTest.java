package arrays.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arrays.ArrayChar;



class ArrayCharTest {

	@Test
	void CompareToTest() {
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { '9' };
		char[] ar3 = { '1', '2', '3' };
		char[] ar4 = {};
		char[] ar5 = { '1', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
		assertEquals(-3, arrayChar4.compareTo(arrayChar3));
		assertEquals(1, arrayChar2.compareTo(arrayChar4));
		assertEquals(1, arrayChar1.compareTo(arrayChar5));
		assertEquals(-1, arrayChar5.compareTo(arrayChar1));
		assertEquals(0, arrayChar5.compareTo(arrayChar5));

		assertEquals(1, new ArrayChar(new char[] { 'a', 'a' }).compareTo(new ArrayChar(new char[] { 'a' })));
		assertEquals(-1, new ArrayChar(new char[] { 'a' }).compareTo(new ArrayChar(new char[] { 'a', 'a' })));

	}
	
	@Test
	void IndexOfTest()
	{
		char[] ar1 = { '1', '2', '3' , '2'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		assertEquals(1, arrayChar1.IndexOf('2'));
		assertEquals(-1, arrayChar1.IndexOf('9'));
	}

	
	@Test
	void lastIndexOfTest()
	{
		char[] ar1 = { '1', '2', '3', '2' };
		ArrayChar arrayChar1=new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('9'));
	}
	
	@Test
	void compareToIgnoreCaseTest()
	{
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { 'f', 'F' };
		char[] ar3 = { '1', '2', '3' };
		char[] ar4 = {};
		char[] ar5 = { 'F', 'f' };
		char[] ar6 = { 'a', 'b', 'C' };
		char[] ar7 = { 'A', 'b' };
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);	
		ArrayChar arrayChar6 = new ArrayChar(ar6);	
		ArrayChar arrayChar7 = new ArrayChar(ar7);	

		assertEquals(0, arrayChar3.compareToIgnoreCase(arrayChar1));
		assertTrue(arrayChar2.compareToIgnoreCase(arrayChar1)!=0);
		assertEquals(0, arrayChar2.compareToIgnoreCase(arrayChar5));
		assertEquals(1, arrayChar6.compareToIgnoreCase(arrayChar7));
		assertEquals(2, arrayChar5.compareToIgnoreCase(arrayChar4));
		assertEquals(0, arrayChar4.compareToIgnoreCase(arrayChar4));
		
		
	}
	
	@Test
	void Equaltest()
	{
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { '1', '2' };
		char[] ar3 = { '1', '2', '3' };
		char[] ar4 = {};
	
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);		
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		
		assertTrue(arrayChar3.Equals(arrayChar1));
		assertFalse(arrayChar2.Equals(arrayChar1));
		assertFalse(arrayChar4.Equals(arrayChar1));
		assertFalse(arrayChar1.Equals(arrayChar4));
		assertTrue(arrayChar4.Equals(arrayChar4));	
	}
	
	@Test
	void EqualIgnoreCaseTest()
	{
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { 'f', 'F' };
		char[] ar3 = { '1', '2', '3' };
		char[] ar4 = {};
		char[] ar5 = { 'F', 'f' };
		char[] ar6 = { 'a', 'b', 'C' };
		char[] ar7 = { 'A', 'b' };
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);	
		ArrayChar arrayChar6 = new ArrayChar(ar6);	
		ArrayChar arrayChar7 = new ArrayChar(ar7);	
		
		assertTrue(arrayChar3.EqualsIgnoreCase(arrayChar1));
		assertFalse(arrayChar2.EqualsIgnoreCase(arrayChar1));
		assertTrue(arrayChar2.EqualsIgnoreCase(arrayChar5));
		assertFalse(arrayChar6.EqualsIgnoreCase(arrayChar7));
		assertFalse(arrayChar1.EqualsIgnoreCase(arrayChar4));
		assertTrue(arrayChar4.EqualsIgnoreCase(arrayChar4));			
	}
	
	@Test
	void CountTest()
	{
		char[] ar1 = { '1', '2', '3', '2', '2', '1'} ;
		char[] ar2 = { } ;
		
		ArrayChar arrayChar1 = new ArrayChar(ar1);		
		ArrayChar arrayChar2 = new ArrayChar(ar2);	
		
		assertEquals(0, arrayChar1.Count('s'));
		assertEquals(1, arrayChar1.Count('3'));
		assertEquals(2, arrayChar1.Count('1'));
		assertEquals(3, arrayChar1.Count('2'));
		assertEquals(0, arrayChar2.Count('2'));	
	}
	
}
