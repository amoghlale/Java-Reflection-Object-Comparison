CS542 Design Patterns
Spring 2015
PROJECT <5> README FILE

Due Date: <Monday, May 4, 2015>
Submission Date: <May 4, 2015>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <Lale Amogh Pramod> 
e-mail(s): <alale1@binghamton.edu> 

PURPOSE:
[
  My Assignment tries to successfully implement reflection. I have also maintained 
  two separate data structures to find total number of instances and total number of 
  non-duplicate instances in First.java and Second.java. I have used Hashmap for this purpose.
  This is because HashMap are efficient for locating a value based on a key.Also, the insertion 
  and deletion can be done in O(1). The entries of a HashMap are not ordered.	 
]

PERCENT COMPLETE:
[
  I believe I have completed 100% of this assignment. My judgement is based 
  on the fact that my code is working for all test cases. 
]

PARTS THAT ARE NOT COMPLETE:
[
  I believe everything is complete.
]

BUGS:

[
  None
]

FILES:

[

Included with this project are 6 class files and 1 interface:
Class files-
Driver.java the main file associated with the program also contains main
FileProcessor.java -the file to read from an input file and write to an output file
MyLogger.java the file to validate command line arguments and print to standard output method
First.java the file to set IntValue and StringValue.
Second.Java the file to set IntVaue and Double Value
PopulateObjects.java The file containing Data Structure to find total instances and non-duplicate instances.

Interface-
FileProcessorInterface.java file having methods to read from and write to file


README.txt the text file you are presently reading
]

SAMPLE OUTPUT:

[
when debug value is 0 for inputbig.txt-
amogh@ubuntu:~/Documents/eclipse_workspace/objComp$ ant -buildfile src/build.xml run -Darg0=inputbig.txt -Darg1=1 -Darg2=0 
Buildfile: src/build.xml

jar:
    [mkdir] Created dir: /home/amogh/Documents/eclipse_workspace/objComp/BUILD/jar
    [jar] Building jar: /home/amogh/Documents/eclipse_workspace/objComp/BUILD/jar/objComp.jar

run:
     [java] Number of non-duplicate First objects: 237
     [java] Total Number of First objects: 474
     [java] Number of non-duplidate Second objects: 263
     [java] Total Number of Second objects: 526
     [java] Total time: 0.126 seconds

BUILD SUCCESSFUL
Total time: 0 seconds

when debug value is 0 for inputsmall.txt-
amogh@ubuntu:~/Documents/eclipse_workspace/objComp$ ant -buildfile src/build.xml run -Darg0=inputsmall.txt -Darg1=1 -Darg2=0
Buildfile: src/build.xml

jar:

run:
     [java] Number of non-duplicate First objects: 4
     [java] Total Number of First objects: 6
     [java] Number of non-duplicate Second objects: 6
     [java] Total Number of Second objects: 8
     [java] Total time: 0.015 seconds

BUILD SUCCESSFUL
Total time: 0 seconds
when debug value is 1 for inputsmall.txt-
amogh@ubuntu:~/Documents/eclipse_workspace/objComp$ ant -buildfile src/build.xml run -Darg0=inputsmall.txt -Darg1=1 -Darg2=1
Buildfile: src/build.xml

jar:

run:
     [java] deserObjects of PopulateObjects called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] hashCode of First overriden
     [java] hashCode of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] hashCode of First overriden
     [java] hashCode of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] hashCode of First overriden
     [java] equals of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] hashCode of Second called
     [java] hashCode of Second called
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] hashCode of First overriden
     [java] hashCode of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of First called
     [java] readfile of FileProcessor called
     [java] handleString of PopulateObjects called
     [java] SetStringValue of First called
     [java] hashCode of First overriden
     [java] hashCode of First overriden
     [java] readfile of FileProcessor called
     [java] readfile of FileProcessor called
     [java] handleInt of PopulateObjects called
     [java] SetIntValue of Second called
     [java] readfile of FileProcessor called
     [java] handleDouble of PopulateObjects called
     [java] SetDoubleValue of Second called
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] hashCode of Second called
     [java] equals of Second overriden
     [java] readfile of FileProcessor called
     [java] outputfDs of PopulateObjects called
     [java] outputsDs of PopulateObjects called

BUILD SUCCESSFUL
Total time: 0 seconds

when debug value is 2 for inputsmall.txt-
amogh@ubuntu:~/Documents/eclipse_workspace/objComp$ ant -buildfile src/build.xml run -Darg0=inputsmall.txt -Darg1=1 -Darg2=2
Buildfile: src/build.xml

jar:

run:
     [java] Parametrized Constructor of FileProcessor called
     [java] Parametrized Constructor of PopulateObjects called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of First called
     [java] Empty Constructor of First called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of First called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of First called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of Second called
     [java] Empty Constructor of First called
     [java] Empty Constructor of First called
     [java] Empty Constructor of Second called

BUILD SUCCESSFUL
Total time: 0 seconds


]

TO COMPILE:

[
  ant -buildfile src/build.xml all
]

TO RUN:

[
  ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=1 -Darg3=1


]
EXTRA CREDIT:

[
  Project running successfully on eclipse as well as using ANT. 
  DEBUG_VALUE=0 [Print to stdout the number of non-duplicate and total instances of First and Second]			
  DEBUG_VALUE=1 [Print to stdout everytime a method other than constructor is called] 
  DEBUG_VALUE=2 [Print to stdout everytime a constructor is called] 

]

BIBLIOGRAPHY:

[

http://stackoverflow.com/questions/6468730/converting-double-to-integer-in-java
http://stackoverflow.com/questions/1209633/create-hash-from-string-and-int
http://examples.javacodegeeks.com/core-java/lang/string/java-string-format-example/
http://examples.javacodegeeks.com/core-java/io/bufferedwriter/write-file-with-bufferedwriter-example/

]

ACKNOWLEDGEMENT:
[

Prof. Madhusudhan Govindaraju
cs542.cs.binghamton.edu mailing list

]
