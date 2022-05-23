package net.composite;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("file1", 15);
		FileComponent file2 = new FileLeaf("file2", 20);
		FileComponent file3 = new FileLeaf("file3", 40);
		
		FileComponent file4 = new FileLeaf("file4", 15);
		FileComponent file5 = new FileLeaf("file5", 20);
		FileComponent file6 = new FileLeaf("file6", 40);
		
		List<FileComponent> filesInFolder = Arrays.asList(file4, file5,file6);
		FileComponent folder1 = new FolderComposite(filesInFolder);
		List<FileComponent> files = Arrays.asList(file1, file2,file3,folder1);
		FileComponent folder = new FolderComposite(files);
		
		folder.showProperties();
		System.out.println("Total Size: " + folder.totalSize());
	}
}
