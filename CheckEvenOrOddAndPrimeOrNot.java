
public class CheckEvenOrOddAndPrimeOrNot


public static void main(String[] args) {
        //check the nummber is even or odd
		
		int  number =2;
	  int temp;  
                
    boolean isPrime = true; 
		 
		if(number%2==0) {
			System.out.println(  number+" is even");
		
		}
		
		
		else 
		{
			System.out.println( number +" is odd");
		
			
		}
		for (int i = 2; i <= number / 2; i++)   
		 {  
                    temp = number % i;  
                    if (temp == 0)   
                    {  
                        isPrime = false;  
                        break;  
                    }  
                }  
                
		 if (isPrime) System.out.println(number + " is a Prime Number");  
                else System.out.println(number + " is not a Prime Number");  
        }  
   
    }
