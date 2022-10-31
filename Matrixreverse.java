public class Matrixreverse{  
public static void main(String args[]){  
//creating a matrix  
int arr[][]={{1,2,3},{4,5,6},{7,8,9}};    
  
System.out.println("Printing Matrix without reverse:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(arr[i][j]+" ");    
}    
System.out.println();    
}    
System.out.println("Printing Matrix After reverse:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(arr[j][i]+" ");    
}    
System.out.println();   
}    
}}  