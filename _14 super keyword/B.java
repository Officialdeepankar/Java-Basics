public class B extends classA {
    int z;
    

    public void   f2()
    {
        // "super" and "This " resolves the naming convention between parent and child class;
        int z;
        z=2;// function k "z" k andar 2, class B(child class) k "z" k andar 4 and class A(superclass) k andar 5;
        this.z=4;// class B ke z ke andar 4 dalwa do;  // by using this we can access element of the child class or "current " class;
        super.z=5;// class A k3 z ke andar 5 dalwa do; // by super key word we can access parent class instance member method and variables ;
        System.out.println ("f2 function z="+z);
        
    }

    public static void main(String Args[])
    {
       B obj=new B();
       
       obj.f2();
       obj.f1();
      
       
    }
}
