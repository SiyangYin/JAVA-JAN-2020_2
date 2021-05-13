package Array;

public class ex3 
{
public static void main(String[] args)
{
int a[]=new int[3];
a[0]=20;
a[1]=30;
a[2]=40;
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
	
}
for(int x:a)
{
	System.out.println(x);
}
}
}