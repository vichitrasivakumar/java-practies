public class Palindromes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=343,summ=0;
	 int temp =n;
		while(n>0) {
			int sum=n%10;
			 summ=(summ*10)+sum;
			n=n/10;
			System.out.println(temp);
		}
			if(summ==temp) {
				System.out.println(" palindrome");
			}
			else
			{
				System.out.println(" not palindrome");
			}
		}

	}