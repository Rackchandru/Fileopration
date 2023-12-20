# Fileopration

Algorithm for File Operations :

Step 1: Start the application of File Operations
Step 2: Enter the Root directory path for file operations
Step 3: Select the any of the below option
		SELECT OPTION
		1.Show Current File Names in Acending Order
		2.Business-level File operations
		3.Close the Application
Step 4: If Enter Option 1 for Show Current File Names in Acending Order
		It will Shows list of files from given folder in acending order
Step 5: Go to Step 3 
Step 6: If Enter Option 2 for Business-level File Operations Select the any of below option
		1.Add a File to the Existing Directory list
		2.Delete a File from the ExistingDirectory list
		3.Search a File from the main Directory
		4.Goto Main Context.
Step 7: If Enter Option 1 for Add a File to the Existing Directory list
		Enter File Name with extension for adding into Existing Directory List:
		After entered the file If file is not exist already it will show File filename.extension is created successfully.
		Otherwise it will show File is already exist in the directory.
Step 8: Please select below option
		1.Add a File to the Existing Directory list
		2.Delete a File from the Existing Directory list
		3.Search a File from the main Directory
		4.Goto Main Context.
Step 9: If Enter Option 2 for Delete a File from the Existing Directory list
		Enter File Name with extension for deleting into Existing Directory List:
		After Entered the file If file is exist then it will show The File filename.extension is Deleted Successfully.
		If file is not exist then it will show File Not Found.
		Go to Step 8.
Step 10: If Enter Option 3 for Search a File from the main Directory
		 Enter File Name with extension to Search into Existing Directory List:
		 If file exist then it will show filename.extension found
		 If file is not exist then it will show File Not Found
		 Go to Step 8.
Step 11: If Enter Option 4 for Goto Main Context.
		 Go to Step 2.
Step 13: If Enter any other Option except 1 to 4.
	 Go to Step 8.
Step 14: If Enter Option 3 for Close the Application
		 It will show Thank You! and terminate the application.
Step 15: If Enter any Option except 1 to 3.
	 Go to Step 3;
Step 16: Terminated the application of File Operations.

====================================================================================================

Psedocode:


function selectOption{
Select Option
1.Show Current File Names i
n Acending Order
 2.Businesslevel File operations
 3.Close the
 Application;
}
function selectBusinessOpti
on{
 1.Add a File to the Exist
ing Directory list
2.Delete a File from the Ex
istingDirectory list
3.Search a File from the ma
in Directory
4.Goto Main Context.;
}
Start;
Enter root Directory;
call selectOption;
if(Option==1){
 Shows file names in acend
ing order;
}
else if(Option==2){
 call selectBusinessOption
;
if(Option==1){
 Enter File Name with
 extension for adding into
 Existing Directory List;
 shows file name added suc
essfully;
}else if(Option==2){
 Enter File Name with exte
nsion
 for deleting into Existin
g Directory List;
 if(file exist){
 filename deleted succes
sfully;
 }else{
 File not found;
 }
}
else if(Option==3){
 Enter File Name with exte
nsion
 to Search into Existing D
irectory List;
 if(file exist){
 file found;
 }else{
 file not found;
 }
}
else if(Option==4){
call selectOption;
}
else{
 Enter correct Option;
 call selectBusinessOption
;
}
}
else if(Option==3){
 Terminate the application
;
}else{
 Enter correct Option;
 call selectOption;
}
