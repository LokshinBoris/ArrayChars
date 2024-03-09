package arrays;


public class ArrayChar {
	private char[] array;

	public ArrayChar(char[] array) {
		this.array = array;

	}

	public int compareTo(ArrayChar another) {
		int length=Math.min(array.length,another.array.length);
		int i=0;
		while (i<length && array[i]==another.array[i])
		{
			i++;
		}
		return i==length ? array.length-another.array.length:array[i]-another.array[i];
	}
	
	public int IndexOf(char character)
	{
		int i= 0;
		while (i<array.length && array[i]!=character)
		{
			i++;
		}
		return i==array.length ? -1:i;
	}
	
	public int lastIndexOf(char character)
	{
		int i= array.length-1;
		while (i>=0 && array[i]!=character)
		{
			i--;
		}
		return i;		
	}
	
	public int compareToIgnoreCase(ArrayChar another)
	{
		int length=Math.min(array.length,another.array.length);
		int i=0;
		while (i<length && Character.toLowerCase(array[i])==Character.toLowerCase(another.array[i]))
		{
			i++;
		}
		return i==length ? array.length-another.array.length:Character.toLowerCase(array[i])-Character.toLowerCase(another.array[i]);			
	}
	

	public boolean Equals(ArrayChar another)
	{
		return this.compareTo(another)==0 ? true : false;
	}
	
	public boolean EqualsIgnoreCase(ArrayChar another)
	{
		return this.compareToIgnoreCase(another)==0 ? true : false;		
	}
	
	public int Count(char character)
	{
		int length=array.length;
		int count=0;
		for (int i=0; i<length; i++)
		{
			if (array[i]==character) count++;
		}
			
		return count;		
	}
}
