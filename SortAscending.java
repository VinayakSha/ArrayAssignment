package ArrayAssignment;

public class SortAscending {

	public static void main(String[] args) {

		int[] marks = { 5, 20, 15, 25, 45, 35, 60, 80 };
		int temp;
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
			}
		}

		for (int a : marks) {
			System.out.print(a + " ");
		}
	}
		
}
			
			
					
		//
			
			
			//int [] a= {5,20,15,25,45,35,60,80,10,0};
			
			 //Arrays.sort(a);
		
		//for(int k=0;k<a.length;k++)
		//{
			//System.out.print(a[k]+" ");
		//}
		
//
	//}
	//
