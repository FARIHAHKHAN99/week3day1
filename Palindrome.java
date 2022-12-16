package week3Assgns;

public class Palindrome {

public static void main(String[] args) {
		
		String str="madam";     // len=5
		String rev="";          //null
		for(int i=str.length()-1;i>=0;i--) {
			//index[4='m'] and + for concadination of char
			        rev=rev+str.charAt(i);       	        
		}
            
           System.out.println("reverse word:" +rev);

		if(str.equals(rev)) {
			System.out.println("Given string is a palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
			
		}
		
	}

}
