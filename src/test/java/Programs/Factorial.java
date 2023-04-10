package Programs;

public class Factorial {
public static void main(String args[])
{
int n=1;
int ft=1;
if(n==0)
{
ft=1;
}else
{
for(int i=1;i<=n;i++)
{
ft=ft*i;
}

}
System.out.println(ft);

}
}
