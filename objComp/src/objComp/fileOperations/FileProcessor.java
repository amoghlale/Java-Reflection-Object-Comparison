package objComp.fileOperations;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import objComp.util.MyLogger;


public class FileProcessor implements FileProcessorInterface {

    
		BufferedReader br=null;
		String inputFile;
		
		BufferedWriter bw=null;  
		FileWriter fw=null;
		MyLogger myLog=MyLogger.getInstance();
		
		public FileProcessor(String inputFile){
			 myLog.printToStdout(2, "Parametrized Constructor of FileProcessor called");
	    	try {
	    		this.inputFile=inputFile;
	    		
				br = new BufferedReader(new FileReader(inputFile));
	    	}catch(NullPointerException e){
	       		System.err.println("NullPointerException");
	    		System.exit(0);
			} catch (FileNotFoundException e) {
			    System.err.println("Filenotfound Exception occured");
				System.exit(0);	
		}
		
		}
		
		public String readfile(){
			 myLog.printToStdout(1, "readfile of FileProcessor called");
			try {
				 String str=br.readLine();
				 return str;
			} catch (IOException e) {
				System.out.println("IOException occured");
				System.exit(0);	
			}
			return null;
			
	   }			
		
		
		 public String toString() {
			    myLog.printToStdout(1, "toString of FileProcessor called");
			  	String retValue = "\n toString() method of FileProcessor Class \n";
			  	return retValue;
			    }
		
		}

