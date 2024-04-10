public class Example {

    /*
     * multiple inheritance is not possible in java, because on child can have one parent only
     * private member varibale inheret from superclass to subclass , but are not accessible by sublcass in other package;
     * Private member variable in heret form superclass to sublclass, but are accessible by subclass in other package 
     * "MULTIPLE INHERITANCE IS NOT POSSIBLE"
     */
   
    public static void main (String args[])
    {
        student s1=new student();
        s1.setage(12);
        s1.setname("Deepankar singh");
        s1.setrollno(22);


        System.out.println(s1.getage());

        System.out.println(s1.getname());

        System.out.println(s1.getrollno());
    }
}
