package pack2;


public class student{

   private  int rollno;// child class bana k bhi access nahi ho payega 
   private String name;
 protected  void setname(String nm)
   {
    name=nm;
   }

   public void setRoll(int n)
   {
    rollno=n;
   }

   public String getname()
   {
     return name;
   }
   
   public int getRoll()
   {
    return rollno;
   }

 


}