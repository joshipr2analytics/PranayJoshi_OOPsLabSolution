package com.greatlearning.CredentialSercvice;


import java.util.Random;
public class CredentialService{
    
    public char[] generatePassword(){
        int length = 10;
        String symbol= "-/.^&*!@%=+>)";
        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String number= "0123456789";
        
        String f = cap + small + number +symbol;

        Random ran = new Random();

        char[] password = new char[length];
        for (int i=0; i<length; i++){
              password[i]= f.charAt(ran.nextInt(f.length()));  
        }
        return(password);
    }

    public void showCredentials(String firstName){
        System.out.println("Dear "+ firstName.toUpperCase() +" your generated credentials are as follows :");
        System.out.println();
    }
    public void technical(String firstName, String lastName){
        
        showCredentials(firstName);
        System.out.println("Email : " + firstName.toLowerCase()+ lastName.toLowerCase()+"@tech.abc.com" );
        System.out.println("Password : "+ generatePassword().toString());
        
 
    } 
    public void admin(String firstName, String lastName){
        
        showCredentials(firstName);
        System.out.println("Email : " + firstName.toLowerCase()+ lastName.toLowerCase()+"@admin.abc.com" );
        System.out.println("Password : "+ generatePassword().toString());

    } 
    public void hr(String firstName, String lastName){
        showCredentials(firstName);
        System.out.println("Email : " + firstName.toLowerCase()+ lastName.toLowerCase()+"@hr.abc.com");
        System.out.println("Password : "+ generatePassword().toString());
    }
    public void legal(String firstName, String lastName){
        showCredentials(firstName);
        System.out.println("Email : " + firstName.toLowerCase()+ lastName.toLowerCase()+"@legal.abc.com");
        System.out.println("Password : "+ generatePassword().toString());
    }    

    public void exit(){
        System.out.println("Thank you !");

    }

    
}