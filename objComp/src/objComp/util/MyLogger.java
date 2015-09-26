package objComp.util;

public class MyLogger {



	    	    public static int DEBUG_VALUE;
				
				private volatile static MyLogger mylogger;
				private MyLogger(){}
					
				
				
				public static MyLogger getInstance() {
						if(mylogger == null){
							synchronized (MyLogger.class){
								mylogger = new MyLogger();
							}
						}
						return mylogger;
				 }
				
				public static void setValue(String args){
				if (!(args.equals("0")||args.equals("1")||args.equals("2")))
				{
			        System.err.println("\nInvalid debug value entered");	
					System.exit(0);
				}
				DEBUG_VALUE=Integer.parseInt(args);
				}
				
				
				public static int getValue(){
					return DEBUG_VALUE;
				}
				
				public void printToStdout(int level,String debugMessage){
				if(level==DEBUG_VALUE){
					System.out.println(debugMessage);
				}
				
				}
				
				 public String toString() {
					  	String retValue = "\n toString() method of MyLogger Class \n";
						return retValue;
					    }
			}



