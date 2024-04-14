public class B extends A{
   int b;
   public B()
   {
    // here the first line will be super() , this "super key word will help in calling the parent consturctor first: "
    // super(10);
    this(255);// either "super " will be written here or " this "  ,both cannot be written here 
    System.out.println("B");
   }
   
   // 2nd  consturctor 
   public B(int p)
   {
    // from here parent constructor will also get called , because first line of each constructor calls parent consturctor; 
    System.out.println("class B 2nd constructor is running : "+ p);
   }
}
