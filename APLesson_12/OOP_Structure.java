public class OOP_Structure
{
   //default values for instance vars
   private String userName, firstName, lastName;


   public OOP_Structure()
   {
       //default values for instance vars
       userName = "";
       firstName = "";
       lastName = "";
       //in case no params are entered
   }


   public OOP_Structure(String uName, String fName, String lName)
   {
       //param values for instance vars
       userName = uName;
       firstName = fName;
       lastName = lName;
       //overloaded...
   }


   public void setUserName(String uName)
   {
       userName = uName;
   }


   public String getUserName()
   {
       return userName;
   }


   public String getFirstName()
   {
       return firstName;
   }


   public String getLastName()
   {
       return lastName;
   }


   public static void main(String[]args)
   {
       //instantiate an object without params...
       OOP_Structure object = new OOP_Structure();


       System.out.println("<<<<<<< USER INFO >>>>>>>>");
       System.out.print("Name: " + object.getFirstName() + "\t" + object.getLastName() + "\n" +
               "User Name: " + object.getUserName() + "\n\n");


       //again with params...
       OOP_Structure object2 = new OOP_Structure("Professor", "Handsome", "pHandsome");


       System.out.println("<<<<<<< USER INFO >>>>>>>>");
       System.out.print("Name: " + object2.getFirstName() + "\t" + object2.getLastName() + "\n" +
               "User Name: " + object2.getUserName() + "\n\n");


       //change username and print again...
       object2.setUserName("profHansizzle");


       System.out.println("<<<<<<< USER INFO >>>>>>>>");
       System.out.print("Name: " + object2.getFirstName() + "\t" + object2.getLastName() + "\n" +
               "User Name: " + object2.getUserName() + "\n\n");


   }
}
