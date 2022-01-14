package com.mukilan.project_one;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Business_level_operations implements ProjectInterface  {
 List<String> retrieve= new ArrayList<String>();
 File[] files = new File("C:\\Users\\mukil\\eclipse-workspace\\phase-one-project").listFiles();
 @Override
 public void showAllFiles() {
  for(File file : files) {
   if(file.isFile()) {
    retrieve.add(file.getName());
   }
  }
  retrieve.forEach(System.out::println);
 }
 @Override
 public void addFile() {
  System.out.println("Enter the file that you want to add in directory : ");
  //sc.next();
  Scanner scan=new Scanner(System.in);
  String filename = scan.nextLine();
  File fileobj= new File(filename);
  try {
   if(fileobj.createNewFile()) {
    System.out.println(filename+" file is added to the directory");
    //Desktop.getDesktop().edit(F);
   }
   else {
    System.out.println("This file is already in the directory");
   }
  } catch (IOException e) {
   e.printStackTrace();
  } 
 }
 @Override
 public void deleteFile() {
  System.out.println("Enter the file that you want to delete in the directory : ");
  //sc.next();
  Scanner scan=new Scanner(System.in);
  String filename=scan.nextLine();
  File fileobj= new File(filename);
  if(fileobj.delete())
   System.out.println(filename+" is Deleted");
  else
   System.out.println("File Not Found in the directory");
 }
 @Override
 public void searchFile() {
  try { 
   Scanner scan= new Scanner(System.in);
   File directory = new File("C:\\Users\\mukil\\eclipse-workspace\\phase-one-project");
   System.out.println("Enter the file name that you want to search in the directory : ");
   String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int count =0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                       System.out.println("The filename "+fileName+" is present in the directory");
            File f= new File(fileName);
            Scanner toscan = new Scanner(f);
            while(toscan.hasNextLine()) {
            System.out.println(toscan.nextLine());
            }
           count = 1; 
                }
   }
        if(count == 0) {
         System.out.println("File not found in the directory");
        }
  }catch(FileNotFoundException ex) {
   System.out.println("File not found");
  }
 }
 }