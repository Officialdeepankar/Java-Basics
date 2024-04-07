public  class wrapper
{
    /* basically java is not 100% object oriented it is 99 % percent object oreineted , because of primitive data types , like for example if 
     int i=1;
     so here we can access the value of i , from anwhere because it is primitive data type , and not an object, but in java we know that every thing needs to be and object;
     To handle this issue wrapper class is assigned to each primitive datatype
     for eg 
             primitive data type |  wrapper class 
             1) int                  Integer
             2) char                 Character
             3) float                Flaot
             4) long                 Long 
             5) double              Double 

     */


     public static void main (String args[])
     {

        // method 1) 
        Integer i1=Integer.valueOf("123");// her  .valueOf("string as parmeter") is a static member fuction and it assign value to i1 by coverting "123" to int further asssining 
        // it to i1;

        Double d1=Double.valueOf("31.34");

        /*
         * method -2) use of .parseXxx()// it coverts string into integer , double ,float etc .parseDouble(), .parseFloat() etc;
         */
         Integer i2= Integer.parseInt("123");

         /*
          * method-3) .xxxValue()// it is a instance member function , that is it can be used only once the object is made of the class

          */
       
        System.out.println(i1.intValue());
        System.out.println(d1.doubleValue());
        System.out.println(i2.intValue());
                 

     }
}