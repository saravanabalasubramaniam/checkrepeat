import java.io.*;
import java.util.*;
class Checkrepeat
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
        int b=input.nextInt();
	int flag=0;
	int arr[]=new int[a];      
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println("");
	}
	for(int j=0;j<a;j++)
	{
		if(arr[j]==b)
		{
			flag=flag+1;
		}	
	}
	System.out.println(flag);

  }
}
