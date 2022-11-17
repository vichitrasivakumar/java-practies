public class insertNumber {
	public static void  arrInsert(int[]number,int pos, int val) {
		 //Traversing the array from the last position to the position where the element has to be inserted
		for(int i=number.length-1;i>=pos;i--) {
			number[i]=number[i-1];
			
		}
		number[pos-1]=val;
	}
public static void main(String a[]) {
	int number[]= new int[6];
	number[0]=1;
	number[1]=3;
	number[2]=5;
    number[3]=4;
    number[4]=7;
	
	insertNumber.arrInsert(number, 3, 0);
	for(int i=0;i<number.length;i++)
	System.out.println(number[i]);
			
}
}