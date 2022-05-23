package net.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent{
	private List<FileComponent> files = new ArrayList<>();
	
	public FolderComposite(List<FileComponent> files) {
		this.files = files;
	}

	@Override
	public void showProperties() {
		// TODO Auto-generated method stub
		for(FileComponent file : files)
			file.showProperties();
	}

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		long total = 0;
		for(FileComponent file : files)
			total += file.totalSize();
		return total;
	}
	
}
