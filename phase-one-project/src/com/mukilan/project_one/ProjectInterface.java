package com.mukilan.project_one;

import java.io.FileNotFoundException;

public interface ProjectInterface {
	 public void showAllFiles();
	 public void addFile();
	 public void deleteFile();
	 abstract void searchFile() throws FileNotFoundException;
	}

