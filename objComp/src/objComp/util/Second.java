package objComp.util;

import objComp.util.MyLogger;

public class Second {

    private double DoubleValue;
    private int IntValue;
    MyLogger myLog=MyLogger.getInstance();
    
    public Second(){
    	 myLog.printToStdout(2, "Empty Constructor of Second called");	
    }
    public void setIntValue(int iIn) {
    	 myLog.printToStdout(1, "SetIntValue of Second called");	
    	 IntValue=iIn;
    	
    } 
    public void setDoubleValue(double dIn) {
    	 myLog.printToStdout(1, "SetDoubleValue of Second called");	
    	 DoubleValue=dIn;
    } 
   
    @Override
     public boolean equals(Object obj) {
    	 myLog.printToStdout(1, "equals of Second overriden");	
        	boolean returnValue = false;
    		if (obj instanceof Second) {
    			Second s = (Second)obj;
    			if (s.IntValue == IntValue && (s.DoubleValue==DoubleValue))
    				returnValue=true;
    		}
    		return returnValue;
	}
    
    @Override
	public int hashCode(){
    	 myLog.printToStdout(1, "hashCode of Second called");	
    	return 31* IntValue + (int)Math.round(DoubleValue);
	}
    
    public String toString() {
	    myLog.printToStdout(1, "toString of Second called");
	  	String retValue = "\n toString() method of Second Class \n";
	  	return retValue;
	    }
}