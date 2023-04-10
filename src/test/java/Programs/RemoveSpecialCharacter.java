package Programs;

public class RemoveSpecialCharacter {
	public static void main(String args[])
	{
		
		String s="aAzZ09nirmalprasanth96@@#$%^&*";
		char arr[]=s.toCharArray();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if((arr[i]>=48 && arr[i]<=57)||( arr[i]>=65 && arr[i]<=90) ||( arr[i]>=97 && arr[i]<=122))
			{
				s1=s1+s.charAt(i);
			}
		
		}
		System.out.println(s1);
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
	}

}
