package step3;
import java.util.Scanner;

public class step33 {

	public static void main(String[] args)
	{Scanner scan = new Scanner(System.in);
		int n = 0;

	//the user is asked to enter an ip address that will be used 
	String ipAdd;
	System.out.print("Enter an ip to be searched:");
	ipAdd = scan.nextLine();
	
	
	//routing table size of 4 should be added to prevent error 
	System.out.print("Input the routing table size :");
	n = scan.nextInt();
	String s;
	s = scan.nextLine();
	String table[]=new String[n];
	//user is prompted to input the information from the chapter into the table
	System.out.println("Input routing table values:");
	System.out.println("address/mask Next hop");
	//for loop creates the routing table
	for(int i=0;i<n;i++)
		{table[i]=scan.nextLine();}
	
	//the text entered from earlier is then spit up so each value
	//can be converted and compared 
	String isplit[];
	isplit = ipAdd.split("[.]");
	String r_split[][] = new String[n][];

	//the split string method is going to show back our values
	//without the . or / characters
	for(int i=0;i<n;i++)
		{r_split[i] = table[i].split("[./ ]");}
	
	
	//the initial for loop will print the 
	//spilt values in the ip split,
	//the following will print the values in the routing table split
	for (String z :isplit)
		{System.out.print(z+" ");}
	
	System.out.println();
	
	for(int i=0;i<n;i++)
	{for(String z : r_split[i])
			System.out.print(z+" ");
				System.out.println();}

	//the routing operation is performed here
	int i;
	for(i=0;i<n-1;i++)
	{//here we create a matrix to hold the vaules to be compared while the for loop iterates
	int f = Integer.parseInt(r_split[i][4]);
	int num[]={0,0,0,0};
	int c=7,g=0;
	//here he loop searches for a match in the blues by comparing both 
	//parts of each array to one other, if there is no match the result
	//is the final entry default router 2 
	while(f>0)
	{if(c==0)
		{num[g]=num[g]+1;
			g++;
			c=7;}
		else
		{num[g]=num[g]+(int)Math.pow(2, c);
			c--;}
		f--;}	
	
	int j=0;
	for(j =0;j<isplit.length;j++)
		{int m = Integer.parseInt(isplit[j])&num[j];
			if(m!=Integer.parseInt(r_split[i][j]))
				{break;	}}
		
	//the result of the routing operation is then printed
	if(j==isplit.length)
	{System.out.println("Route to : "+r_split[i][r_split[i].length-2]+" "+
			r_split[i][r_split[i].length-1]);
		break;}	}

	if(i==n-1)
	{System.out.println("Route to : "+r_split[i][r_split[i].length-2]+" "+
			r_split[i][r_split[i].length-1]);	}}}
