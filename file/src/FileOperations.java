package src;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class FileOperations extends FileOperationServiceImpl {
	public static void main(String args[]) throws IOException,InputMismatchException{
		try{
			Scanner s = new Scanner(System.in);
			File file;
			String path;
			do{
				System.out.println("Enter the Root Directory path:");
				path = s.nextLine();
				file = new File(path);
			}while((!file.exists()) && (!file.isDirectory()));

			FileOperationService fileOperation = new FileOperationServiceImpl();
			do{
				int option = 0;
				String optn;
				boolean valid = false;
				while(valid == false) {
				System.out.println("\n\nSELECT OPTION\n1.Show Current File Names in Acending Order\n"
						+ "2.Business-level File operations\n3.Close the Application");
				 optn = s.nextLine();
				 try{
				 option = Integer.parseInt(optn);
				 valid = true;
				}catch(NumberFormatException e){
					System.out.println(e+"\nError-Please enter an integer value");
				}
				}

				switch(option){

				case 1:{
					int i =0;int level= 0;
					List<String> fileLists = new ArrayList<String>();
					File arrayFiles[] = file.listFiles(); 
					System.out.println("Displaying All the files:");
					System.out.println("*************************************************");
					fileOperation.listAcendingOrder(fileLists, arrayFiles, i, level);
					/*System.out.println("Before Sorting:\n");
					for(String fileName: fileLists)   
						System.out.print(" \n"+fileName);*/

					Collections.sort(fileLists);    
					//System.out.println("\n\nAfterSorting");
					for(String fileName: fileLists)   
						System.out.print(" \n"+fileName); 
					System.out.println("\n*************************************************");
					break;
				}
				case 2:{
					int childOption = 0;
					String opt;
					do{
						boolean isValid = false;
						while(isValid == false) {
						System.out.println("1.Add a File to the Existing Directory list\n2.Delete a File from the Existing"
								+ "Directory list\n3.Search a File from the main Directory\n4.Goto Main Context.");
						opt = s.nextLine();
						try{
						childOption = Integer.parseInt(opt);
						isValid = true;
						}catch(NumberFormatException e){
							System.out.println(e+"\nError-Please enter an integer value");
						}
						}
						switch(childOption){
						case 1:{
							fileOperation.addFile(path);
							break;
						}
						case 2:{
							fileOperation.deleteFile(path);
							break;
						}
						case 3:{
							fileOperation.searchFile(file);
							break;
						}
						case 4:{

							break;
						}
						default:{
							System.out.println("Enter the Correct Option");
						}
						}
					}while(childOption!=4);
					break;
				}
				case 3:{
					System.out.println("Thank You!");
					System.exit(0);
				}
				default:{
					System.out.println("Enter the Correct option");
				}
				}
			}while(true);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
