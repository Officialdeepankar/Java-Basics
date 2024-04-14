// i can Add final key word with 5 things;
// final keyword once intiated cannot be changes;

//4) final class
// final class A{

// }
// class B extends A{  final classes cannnot get extended or "we can not make any children of these final classes!"
//     /
// }

public class finStaticVarable{
    // 1) final instance variable

    final private int age;
    // here age is a blank variable i.e it doesn't contain any value inside it till now and can be intiated by and initiation black
    {
        age=5;
    }
    void giveage()
    {
        System.out.println (age);
    }
    // 2) Static instance member variable;

    final static int rollno;
  
    // this static final instance variable can only be intialized by static initializing block 
    static 
    {
    rollno =10;
    }

    // 3) final instance member function 
    // by making this function as final , it will not get override if the same function is made by its children class, because it is final;
    final public void  getage()
    {
       System.out.println("Instance member function is working!");
    }
    


    //5) final local variable
    
    int f1()
    {
        final int weight;//
        weight=75;// This is local final variable ;
        return weight;
    }


    public static void main (String[]args)
    {
         finStaticVarable f2=new finStaticVarable();
         f2.giveage();
         f2.f1();
        System.out.println (finStaticVarable.rollno) ;
    }

}