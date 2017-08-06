//here we showing the the program for a file copy where file is also known as a directory.here we showing how to create file from one dir to the same dir

package assignment16; //created package name as assignmnet16

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CreatingDir { //CREATED class as CreateDir 

	public static void main(String[] args) { //created main method 
		 
		File sourceFile =new File("C:/Users/IIS 3/Documents/uma.txt");//here created the file object which i have given  path of a source file 
		                                                                     //here the text which is in source file will be copied the same to the destination file 
		
		File destinationFile = new File("C:/Users/IIS 3/Documents/AcadGild.txt");//here created the file object which i given path of a destination file 
		                                                                            //here if we run the the program with the java application it shows the content as in the destination file 
	    try {
			Files.copy(sourceFile.toPath(), destinationFile.toPath()); //here I'm copying the source file to the destination file 
		} catch (IOException e) {         //which shows an checked exception to handle that we taken the try catch block
			 
			e.printStackTrace();
		}    //here in  the source file we  have a text which is copies the same text to the destination file if once it done by java application it shows an error which file already exists
	    
		
		
	}
}
