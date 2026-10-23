/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2;


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Student
 */
public class POEPart2 {

    public static void main(String[] args) {
    
        int numMessagesSend = 0;
        System.out.println("Welcome to Quick Chat");
        System.out.println("How many messages do you want to enter");
        Scanner input = new Scanner(System.in);
        int numMessages = input.nextInt();
        
        // Create menu
        System.out.println("====Menu===");
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        
        int option = input. nextInt();
        
    if(option == 1) {
         // GENERATING MESSAGE ID
        for (int x = 0; x< numMessages; x++)
        {
        Random random = new Random();
        Long maximum = 99999999999L;
        Long minimum = 1000000000L;
        Long MessageID = random.nextLong(maximum-minimum) +minimum;
        //==============
        //total number of messages
         numMessagesSend = numMessagesSend + numMessagesSend;
        System.out.println("Enter The Recipient Number");
        String RNumber = input.nextLine();
        
        System.out.println("Enter your message");
        String Message =  input.nextLine();
        
        if(Message.length()> 250) {
          System.out.println("Please enter a message of less than 250 characters");
        }else{
            System.out.println("Message sent");
        }
        String Hash = "";
       
        
        //conversion
        //integer to String = Integer.valueOf(String value)
        // Long to String = String. valueOf(Long value)
        
        String frstTwoDigits = String.valueOf(MessageID).substring(0,2);
       
        int NumberOfMessage = x;
        //Split Function
        // Hi guys
        //  0 1 2 3 4
        
        String[] Words = Message.split (" ");
        String firstword = Words[0];
        String lastWord = Words[Words.length - 1];
         Hash = frstTwoDigits +":"+ NumberOfMessage +":"+ firstword+lastWord;
        
        Hash = Hash.toUpperCase();
        System.out.println("====Menu===");
        System.out.println("Option 1)Send Message");
        System.out.println("Option 2) Disread Message");
        System.out.println("Option 3) Store Message to send later");
        int Choice = input.nextInt();
        
       
          if (Choice ==1){
            System.out.println("Message successfuly sent");
            System.out.println("Message ID: " + MessageID);
            System.out.println("Message Hash:" + Hash);
            System.out.println("Recipient:"+ RNumber);
            System.out.println("Message:" + Message);
        }else if (Choice ==2){
            System.out.println("press 0 to delete message");
        }else if (Choice ==3) {
            System.out.println("Message successfully stored");
        }else{
            System.out.println("Invalid input, please enter 1, 2, or 3");
        }
          
        }
        

        }
        
        
        




       
        

        
    
      

      

    
   
           