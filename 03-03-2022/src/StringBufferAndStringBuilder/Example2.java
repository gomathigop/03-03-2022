package StringBufferAndStringBuilder;

public class Example2 {
	public static void main(String[] args) 
	{		
		
		StringBuffer name = new StringBuffer("Gomathi");
		
		name.append("Gopi");
		
		System.out.println(name);	
		
		System.out.println("********************");
		
		StringBuilder myName = new StringBuilder("Gomathi");
		
		myName.append("Kavi");
		
		System.out.println(myName);
		
	}

}



