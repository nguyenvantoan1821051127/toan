import java.util.Scanner;
public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);       
	        System.out.println("Nhập số : ");
	        int a = scanner.nextInt();
	        if( a%2==0 )  {
	        	System.out.println(a + "là số chẵn"); 
	        	}  
	        	// Ngược lại
	        	else { 
	        		System.out.println(a+"là số lẻ");   
	        	}
	}

}
