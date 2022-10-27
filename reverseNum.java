public class reverseNum {

	public static void main(String[] args) {
		int num,temp=0;
	int	a=23456;

		
		for(int i=0;i<a;i++) {
			num=a%10;
			temp=(temp*10)+num;
			a=a/10;
			System.out.println(temp);
					
		}
		

	}

}
