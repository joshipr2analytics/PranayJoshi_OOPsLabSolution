package com.greatlearning.models;
    

public class Employee{

   public Employee(){} 
   public Employee(String firstName, String lastName){
       this.firstName= firstName;
       this.lastName= lastName;
   }     
    public String firstName;
    public String lastName;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
}