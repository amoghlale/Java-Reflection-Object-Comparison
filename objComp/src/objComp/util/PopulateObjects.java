package objComp.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import objComp.util.MyLogger;
import objComp.fileOperations.FileProcessorInterface;

public class PopulateObjects {
    String line=null; 
    String clsName=null;
    Class<?> cls = null;
    Map<Object,Integer> fDs= new HashMap<Object,Integer>();
    Map<Object,Integer> sDs= new HashMap<Object,Integer>();
    MyLogger myLog=MyLogger.getInstance();
    String[] equalSplit=null;
    String[] commaSplittype=null;
    String typeOfObject;
    String[] commaSplitvar=null;
    String varName;
    String userValue;
    Class<?>[] signature;
    String methodName;
	public FileProcessorInterface fp=null;
	
	public PopulateObjects(FileProcessorInterface fin){
		myLog.printToStdout(2, "Parametrized Constructor of PopulateObjects called");	
		fp=fin;
	}
	public void deserObjects() {
		myLog.printToStdout(1, "deserObjects of PopulateObjects called");
		String[]clas = null;
		int countTotalfirst=0,countTotalsecond=0;
		while((line = fp.readfile())!=null)    //first line
		     { 
		    	String firstThreeLetters=line.substring(0, 3);
		    	if(firstThreeLetters.equalsIgnoreCase("fqn"))
		    	{
		    		clas= line.split("\\:");
		    		clsName = clas[1];		
				
		    		try {
					cls = Class.forName(clsName);
					} 
		    		catch (ClassNotFoundException e) {
					System.err.println("Class not found Exception ");
					System.exit(0);
					}
			    		
		    		Object obj = null;
		    		Method meth=null;
		              
		    		//create one single instance
		    		try {
						obj = cls.newInstance();
					} catch (InstantiationException e) {
						System.err.println("Instantiation Exception ");
						System.exit(0);
					} catch (IllegalAccessException e) {
						System.err.println("Illegal Access Exception ");
						System.exit(0);
					}
                    int loop_counter=0;
		    		while(loop_counter<2)
		    		{	
		    			if((line = fp.readfile())!=null)        
		    			{
		    				Object[] params=null;	
   					    
		    				//split 
		    				equalSplit=line.split("\\=");
		    				commaSplittype=equalSplit[1].split("\\,");
		    				typeOfObject=commaSplittype[0];
		    				commaSplitvar=equalSplit[2].split("\\,");
		    				varName=commaSplitvar[0];
		    				userValue=equalSplit[3];
					
		    				signature = new Class[1];  
		    				methodName = "set" + varName; 	        

		    				if(typeOfObject.equalsIgnoreCase("int"))
		    				{	
		    					signature[0]=Integer.TYPE;
		    					int usV=Integer.parseInt(userValue);
		    					params=handleInt(usV);
			    				
		    				} 
		    				else if (typeOfObject.equalsIgnoreCase("String"))
		    				{
		    					signature[0]=String.class;
		    					params=handleString(userValue);
		    				}
		    				else if (typeOfObject.equalsIgnoreCase("Double"))
		    				{
		    					signature[0]=Double.TYPE;
		    					double double_val=Double.parseDouble(userValue);
		    					params=handleDouble(double_val);
		    				}
			    			
		    				try {
		    					meth = cls.getMethod(methodName, signature);
		    				} catch (NoSuchMethodException e) {
		    					System.err.println("No Such Method Exception ");
		    					System.exit(0);
		    				} catch (SecurityException e) {
		    					System.err.println("Security Exception ");
		    					System.exit(0);
		    				} 
			    		
		    				try {
		    					Object result = meth.invoke(obj, params);
			    		
		    				} catch (IllegalAccessException e) {
		    					System.err.println("Illegal Access Exception ");
		    					System.exit(0);
		    				} catch (IllegalArgumentException e) {
		    					System.err.println("Illegal Argument Exception ");
		    					System.exit(0);
		    				} catch (InvocationTargetException e) {
		    					System.err.println("Invocation Target Exception ");
		    					System.exit(0);
		    				}
			    	       		   				
					 } //if closed
		    			loop_counter++;
		    		}//inner while closed		
		           
		    			if(obj instanceof First) 
		    		    {
	    					if(fDs.containsKey(obj))
	    				    {
	    						
	    						int countextracted3=fDs.get(obj);
	    						countTotalfirst=countextracted3+1;
	    						fDs.put(obj, countTotalfirst);
	    		      
	    				    }
	    					else
	    					{
	    						fDs.put(obj,1);
	    					}
	    				}
		    		
	    				else if(obj instanceof Second)
	    				{
	    					if(sDs.containsKey(obj))
	    				    {
	    						
	    						int countextracted4=sDs.get(obj);
	    						countTotalsecond=countextracted4+1;
	    						sDs.put(obj, countTotalsecond);
	    		      
	    				    }
	    					else
	    					{
	    						sDs.put(obj,1);
	    					}
	    				}	
		            } //if closed
				}	//while closed
			    			    	
		     }
	
	public Object[] handleDouble(double double_val) {
		myLog.printToStdout(1, "handleDouble of PopulateObjects called");
		Object[] params = new Object[1];
		params[0] = new Double(double_val);			
        return params;		
	
	}
	public Object[] handleString(String methodName) {
		myLog.printToStdout(1, "handleString of PopulateObjects called");
		Object[] params = new Object[1];
		params[0] = new String(userValue);			
		return params;
    }

	public Object[] handleInt(int usV) {
		myLog.printToStdout(1, "handleInt of PopulateObjects called");
		Object[] params = new Object[1];
    	params[0] = new Integer(usV);			
    	return params;
	}

	public void outputfDs(){
		myLog.printToStdout(1, "outputfDs of PopulateObjects called");
		int total_first=0;
		myLog.printToStdout(0,"Number of non-duplicate First objects: "+String.valueOf(fDs.entrySet().size()));
		for(Entry<Object, Integer> entry: fDs.entrySet()){
			Integer value=entry.getValue();
			total_first=total_first+ value;
			
		}
		myLog.printToStdout(0,"Total Number of First objects: "+ String.valueOf(total_first));
	}
	
	public void outputsDs(){
		myLog.printToStdout(1, "outputsDs of PopulateObjects called");
		int total_second=0;
		myLog.printToStdout(0,"Number of non-duplicate Second objects: "+String.valueOf(sDs.entrySet().size()));
		for(Entry<Object, Integer> entry: sDs.entrySet()){
			Integer value=entry.getValue();
			total_second=total_second+ value;
			
		}
		myLog.printToStdout(0,"Total Number of Second objects: "+ String.valueOf(total_second));
	}
	
	 public String toString() {
		    myLog.printToStdout(1, "toString of PopulateObjects called");
		  	String retValue = "\n toString() method of PopulateObjects Class \n";
		  	return retValue;
	 }
}