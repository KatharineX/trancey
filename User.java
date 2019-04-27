import java.util.*;
import java.lang.*;
import java.io.*;

// In User, we are reading a file, and withdrawing the information from the file to concatinate a block
public class User{
	public static String path;
	
	public User(){
		
	}
	
	// testing if the file 
	public static void main(String[] args) throws Exception{
		
		if(args.length == 1){
			path = args[0];
			File file = new File(path); 
    		Scanner scan = new Scanner(file); 
  
    		while (scan.hasNextLine()) {
		 		System.out.println(scan.nextLine()); 
			}
			
		}else{
			System.out.println("Nein, no file specified.");
		}
		
	} 
}
