package objComp.util;

import objComp.util.MyLogger;

public class First {

    private int IntValue;
    private String StringValue; 
    MyLogger myLog=MyLogger.getInstance();
    
    public First(){
    	 myLog.printToStdout(2, "Empty Constructor of First called");	
    }
    public void setIntValue(int iIn) {
    	 myLog.printToStdout(1, "SetIntValue of First called");
    	 IntValue=iIn;
     } 
    
    public  void setStringValue(String sIn) {
    	myLog.printToStdout(1, "SetStringValue of First called");
    	StringValue=sIn;
     } 

    @Override
    public boolean equals(Object obj) {
    	myLog.printToStdout(1, "equals of First overriden");
    	boolean returnValue = false;
		if (obj instanceof First) {
			First f = (First)obj;
			if(f.IntValue == IntValue && (f.StringValue.equalsIgnoreCase(StringValue)))
				 returnValue=true;
		}
		return returnValue;
	
	}
    
    @Override
	public int hashCode(){
    	myLog.printToStdout(1, "hashCode of First overriden");
    	if(StringValue==null)
    		return IntValue * 32;
    	
		return StringValue.hashCode() + IntValue * 32;
	}
    
    public String toString() {
	    myLog.printToStdout(1, "toString of First called");
	  	String retValue = "\n toString() method of First Class \n";
	  	return retValue;
	    }
}