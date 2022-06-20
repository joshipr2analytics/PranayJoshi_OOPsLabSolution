package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.CredentialSercvice.CredentialService;
import com.greatlearning.models.Employee;

public class DriverClass{
    static String firstName;
    static String lastName;
    public static void main(String[] args){
        CredentialService cser = new CredentialService();
        Employee emp= new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first Name");
        firstName = sc.nextLine();
        System.out.println("Please Enter the Last Name");
        lastName = sc.nextLine();
                
        emp.setFirstName(firstName);
        emp.setLastName(lastName);

        int dept;
        do{
            System.out.println("Please Enter the department from the following list");
            System.out.println("1.: Technical");
            System.out.println("2.: Admin");
            System.out.println("3.: Human Resource");    
            System.out.println("4.: Legal");
            System.out.println("0.: Exit");
            
            dept = sc.nextInt();

            switch(dept){
                case 0:{
                        cser.exit();
                }
                    break;
                case 1:{
                    cser.technical(firstName, lastName);
                }
                    break;
                case 2:{
                    cser.admin(firstName, lastName);
                }
                    break;
                case 3:{
                    cser.hr(firstName, lastName);
                }
                case 4:{
                    cser.legal(firstName, lastName);                        
                }
                    break;
                default:{
                    System.out.println("Enter Valid Option");
                }                
            }
        }
        while(dept !=0);
        
    }
 }

