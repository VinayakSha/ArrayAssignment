package ArrayAssignment;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrayOne[]= {2,5,8,9};
int arrayTwo[]= {15,13,7,12};
int arrayThree[]= new int[arrayOne.length+arrayTwo.length];
int index=arrayOne.length;

for(int i=0;i<arrayOne.length;i++)
{
	arrayThree[i]=arrayOne[i];
}
for(int j=0;j<arrayTwo.length;j++)
{
	arrayThree[index]=arrayTwo[j];
	index++;
}
{
    Arrays.sort(arrayThree);
}
for(int k=0;k<arrayThree.length;k++)
{
	System.out.print(arrayThree[k]+" ");
}
	}

}

