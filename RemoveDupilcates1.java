package week3Assgns;

public class RemoveDupilcates1 {

	    public static void main(String[] args) {
		
		String text="We learn java basics as part of java sessions in java week1";
		String txt="";
		//string[0]="We"
		//string[1]="learn"
		//string[2]="java"
		String[] split= text.split(" ");     //split length = 12 cal
		
		for(int i=0;i<=split.length-1;i++) {  
			txt = txt+split[i]+" "; 
			 for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j]))
						{
					    split[j]="";	
				}  	
	
			}
		}System.out.println("string without duplicate word: "+txt);
	}
}
			

