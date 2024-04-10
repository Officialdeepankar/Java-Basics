 class student extends person{// within the same package we dont need to import  student , it know that person exists, 

   // "MULTIPLE INHERITANCE IS NOT POSSIBLE" i.e one child can have one parent 
   private int rollno;
   
   public void setrollno(int roll)
   {
    rollno=roll;

   }

   public int getrollno()
   {
    return rollno;
   }
}
