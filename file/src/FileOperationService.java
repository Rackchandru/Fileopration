package src;

import java.io.File;
import java.util.List;

public interface FileOperationService {
	public void listAcendingOrder(List<String> fileLists,File arrayFiles[],int i, int level);
	public void addFile(String path);
	public void deleteFile(String path);
	public void searchFile(File path)throws Exception;

}
