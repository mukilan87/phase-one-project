package com.mukilan.project_one;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class UserInput {

 public static void main(String[] args) {
  welcomeScreen();
  try {
   menuDriven();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } 
 }
 /***
  * This is used to display the welcome screen on the console
  */
 private static void welcomeScreen() {

	 System.out.println("Project Assigned by :  Company Lockers Private Limited \n");
  
	 System.out.println("Project Name        :  Lockedme.com \n");
  
     System.out.println("Project Created by  :  Mukilan S \n");
 }

 /***
  * This is used for keep the menu for user interaction
  * @throws FileNotFoundException 
  */
 private static void menuDriven() throws FileNotFoundException {
  Scanner sc = new Scanner(System.in);
  Business_level_operations obj = new Business_level_operations();
  int option;
  do {
  System.out.println("Enter the choice that you want to select : \n\n");
  System.out.println("\t1. Retrieve filenames in a sequential order \n");
  System.out.println("\t2. Business-level operation menu \n");
  System.out.println("\t3. Exit from the application \n");
  
  option=sc.nextInt();
  switch(option) {
  case 1:
   obj.showAllFiles();
   break;
  case 2:
   int ch;
  do {
   System.out.println("Enter your choice for Business level operation");
   System.out.println("\t1. Add a file and its content to a directory");
   System.out.println("\t2. Delete a file from a directory");
   System.out.println("\t3. Searching a file and showing its content");
   System.out.println("\t4. Exit from menu");
   
   ch=sc.nextInt();
   switch(ch) {
   case 1:
    obj.addFile();
    break;
   case 2:
    obj.deleteFile();
    break;
   case 3:
    obj.searchFile();
    break;
   case 4:
    System.out.println("Exit from the Business - Level operation...");
    System.out.println("---------------------------------\n");
    break;
   default:
    System.out.println("Invalid Choice Entered");
    break;
   }
  }while(ch!=4);
  break;
  case 3:
   System.out.println("Exit from the application...");
   break;
  default:
   System.out.println("Invalid choice Entered");
  }
  }while(option!=3);

 }
}