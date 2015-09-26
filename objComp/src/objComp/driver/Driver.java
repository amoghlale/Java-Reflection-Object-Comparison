package objComp.driver;

import objComp.util.MyLogger;
import objComp.fileOperations.FileProcessor;
import objComp.fileOperations.FileProcessorInterface;
import objComp.util.PopulateObjects;

	public class Driver {

		public static void main(String[] args) {
			
			if(args.length < 3) {
				System.err.println("Invalid number of Command line arguments\n");
				System.exit(1);
			
			}
		
			String inputfile=args[0];
		
			int number_of_iterations=Integer.parseInt(args[1]);
					
			MyLogger.setValue(args[2]);
			
			PopulateObjects p=null;
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < number_of_iterations; i++) {
				FileProcessorInterface fp=new FileProcessor(inputfile);
				p=new PopulateObjects(fp);
				p.deserObjects();
				
			}
			p.outputfDs();
			p.outputsDs();
			long finishTime = System.currentTimeMillis();
			double total_time=(finishTime-startTime)/number_of_iterations;
			double total_time_in_sec=total_time/1000;
			MyLogger myLog=MyLogger.getInstance();
			myLog.printToStdout(0,"Total time: "+total_time_in_sec+" seconds");
		}
	}

