package src;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileOperationServiceImpl implements FileOperationService {

	@Override
	public void listAcendingOrder(List<String> fileLists, File arrayFiles[], int i, int level) {
		try{ 
			if(i == arrayFiles.length)  
			{  
				return;  
			}  
			if(arrayFiles[i].isFile())  
			{  
				//System.out.println(arrayFiles[i].getName());  
				fileLists.add(arrayFiles[i].getName());
			}  
			else if(arrayFiles[i].isDirectory())  
			{  
				//fileLists.add(arrayFiles[i].getName());
				//System.out.println("[" + arrayFiles[i].getName() + "]");  
				listAcendingOrder(fileLists, arrayFiles[i].listFiles(), 0, level + 1);  
			}  

			listAcendingOrder(fileLists, arrayFiles, i + 1, level); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void addFile(String path) {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter File Name with extension for adding into Existing Directory List:");
		String fileName = get.nextLine();
		 try {  
             File file = new File(path, fileName);   
             if (file.exists()) {  
            	 System.out.println("File is already exist in the directory.");
                        
             } else if(file.createNewFile()) {  
            	  System.out.println("File " + file.getName() + " is created successfully.");  
             }  
           } catch (IOException exception) {  
                    System.out.println("An unexpected error is occurred.");  
                    exception.printStackTrace();  
        }   
	}

	@Override
	public void deleteFile(String path) {

		Scanner get = new Scanner(System.in);
		System.out.println("Enter File Name with extension for deleting into Existing Directory List:");
		String fileName = get.nextLine();
		int flag = 0;
		 try {  
             File file = new File(path); 
             String[] flist = file.list();
             for (int i = 0; i < flist.length; i++){
            	 String sFile = flist[i];
            	 if (sFile.equals(fileName)) {
            		 sFile = path+"\\"+sFile;
            		 File deleteFile = new File(sFile);
            		 deleteFile.delete();
                	 System.out.println("The File " + deleteFile.getName()+" is Deleted Successfully.");
                	 flag =1;
            	 }
             }
              if(flag==0)
            	  System.out.println("File Not Found.");  
           } catch (Exception exception) {  
                    System.out.println("An unexpected error is occurred.");  
                    exception.printStackTrace();  
        }   
	
	}

	@Override
	public void searchFile(File path)throws Exception {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter File Name with extension to Search into Existing Directory List:");
		String fileName = get.nextLine();

		String[] flist = path.list(); 
		int flag = 0; 
		if (flist == null) { 
			System.out.println("Empty directory."); 
		} 
		else { 
			for (int i = 0; i < flist.length; i++) { 
				String file = flist[i]; 
				if (file.equals(fileName)) { 
					System.out.println(file + " found"); 
					flag = 1; 
				} 
			} 
		} 

		if (flag == 0) { 
			System.out.println("File Not Found"); 
		} 
	}  

}
