package testing;

import java.util.LinkedList;
import java.util.List;

public class CommonPrefix {
public static void main(String args[])
{
List<String> l=new LinkedList<>();	
l.add("arose");
l.add("arome");
l.add("aroha");
int count=999;
String temp=l.get(0);
for(int i=1;i<l.size();i++)
{
	
	int min=0;
	for(int j=0;j<l.get(i).length();j++)
	{
		if(temp.charAt(j)==l.get(i).charAt(j))
		{
			min++;
		}else
		{
			break;
		}
	}
	if(min<count)
	{
		count=min;
	}
}
System.out.print(temp.substring(0,count));


}
}
