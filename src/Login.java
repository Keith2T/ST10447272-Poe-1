import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Login {

    /**
     * @param args the command line arguments
     */
String Username;
String Password;
String First;
String Last;
String username;
String password;
public boolean checkUsername(){
    //this method will check the username complexity if it has an underscore and does not contain more than 5 characters and if all the conditions are met it will return true.
   boolean check=false;
    for(int i=0; i<Username.length(); i++){
   if(Username.length() <=5){
       
   if((int)Username.charAt(i) ==95)
       check=true;
   }
    }
    return check;
}

   
 
public boolean checkPasswordComplexity(){
    //this method will check if the password has a capital a number a special character and check if it has more than 8 characters if all the conditions are met it will return true
  boolean CapitalLetter=false;  
  boolean Number =false;
  boolean Special=false;
 for(int i=0; i<Password.length(); i++){
   if(Password.length() >= 8){ 
   if((int)Password.charAt(i) >65 &&(int)Password.charAt(i) <=90) {
       CapitalLetter=true;
   }  
  if((int)Password.charAt(i) >=48 &&(int)Password.charAt(i) <=57){
       Number=true;
               }          
   if((int)Password.charAt(i) >=33 &&(int)Password.charAt(i) <=47 || (int)Password.charAt(i) >=58 &&(int)Password.charAt(i) <=64 || (int)Password.charAt(i) >=91 &&(int)Password.charAt(i) <=96 || (int)Password.charAt(i) >=123 &&(int)Password.charAt(i) <=126)   
          Special=true;
   }

       
   }
return CapitalLetter && Number && Special;
}
public String registerUser(){
 
  if(checkUsername()==true){
           System.out.println("Username succefully captured");
       }else{
           System.out.println("Username is not correctly formatted,please ensure that your Username contains an underscore and is no more than 5 characters in length ");
       }   
       if(checkPasswordComplexity()==true){
           System.out.println("Password succefully captured");
       }else{
           System.out.println("Password is not correctly formatted please ensure that the password contains atleast 8characters, a capital letter , a number and a special character ");
       }
           if(checkUsername()==true && (checkPasswordComplexity()==true)){
         System.out.println("The two above conditions have been met and the user has been registered succefully");  
}
       
         if(checkPasswordComplexity()==false){
               System.out.println("The Password does not meet the complexity requirements");      
         }
     if(checkUsername()==false){
         System.out.println("The username is incorrectly formatted");
         
     }
      

       return("") ;

}
public boolean loginUser(){
 boolean Compare=false;
//this method wiill compare the register and login username and password if they match it will return true 
   
 if(username.equals(Username) && (password.equals(Password))){
     Compare=true;
 }
    return Compare;
}
String returnLoginStatus(){
    //this method will tell the user if they masnaged to login or not. If they managed it will succefully welcome them
         
     
if(loginUser()==true) {
    
    
    System.out.println("succeful login");
    {
    System.out.println("welcome " +" "+ First +" " +" "+ " "+Last +" " + " it is great to see you again " );
}
}
else{

     System.out.println("A failed login"); 
     System.out.println("Username or Password incorrect please try again");
            
}  
     

    return"";
} 
    public static void main(String[] args) {
        //this will allow the user to be able to respond to the compiler
            Scanner input = new Scanner(System.in);
    //this will be used to access methods and variables of the login class throughout this class

    Login method=new Login();

  //prompt the user to enter their first name
     System.out.println("Enter FirstName");
      method.First=input.next();
      //prompt the user to enter their last name
      System.out.println("Enter LastName");
      method.Last=input.next();
      //prompt the user to create a username
      System.out.println("Create Username");
      method.Username=input.next();
      //prompt the user to create the password
      System.out.println("Create  Password");
      method.Password=input.next();
      // this will tell the user if they are registered or not
     System.out.println(method.registerUser());
     //if username and password are correct this will allow the user to login 
      if(method.checkUsername()==true & (method.checkPasswordComplexity())==true){
          //prompt the user to login with information they registered with
                  System.out.println("Enter Username");
     method.username=input.next();
     //prompt the user to login with the password they registered with
       System.out.println("Enter Password");
       method.password=input.next();
      //this will tell the user if they are registered or not
      System.out.println(method.returnLoginStatus()); 
     
   
    }}}




