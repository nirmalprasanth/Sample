package array;

public class StringEx {
	
	
	public static void main(String args[])
	{
		char arr[]={'a','b','c'};
		String s=new String(arr);
		System.out.println(s);
		
    //literal
    String s1="Welcome";
	
	String s2="welcome";
	//non literal
	String name=new String("Welcome");
	
	//immutable
	String s3 = s1.concat("Home");
	
	//String methods
	

	char charAt = s1.charAt(0);
	System.out.println(charAt);
	
	boolean contains = s1.contains("P");
	System.out.println(contains);
	
	boolean contentEquals = s1.contentEquals("Welcom");
	System.out.println(contentEquals);
	
	boolean equals = s1.equals(s2);
	System.out.println(equals);
	
	boolean ignoreCase = s1.equalsIgnoreCase(s2);
	System.out.println(ignoreCase);
	
	String upperCase = s2.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s2.toLowerCase();
	System.out.println(lowerCase );
	
	String replace = s.replace('a', 'A');
	System.out.println(replace);
	
	String spl="fxgcvhbjnk$#%^&   ASERTY34567";
	String replaceAll = spl.replaceAll("[^a-zA-Z]","");
	System.out.println(replaceAll);
	int indexOf = s.indexOf('a');
	System.out.println(indexOf);
	
	String eg="    ertyu   vbnm     ";
	String trim = eg.trim();
	System.out.println(trim);
	String trim2 = eg.replaceAll(" ","");
	System.out.println(trim2);
	
	}

}
