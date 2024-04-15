public class stringpractice
{
    /*
     * string are immutable?
     * location string ki different hogi 
     
     */
    public static void main(String[] args) {
        String s1="my name is deepankar singh";
        String s2=s1;
        System.out.println("result-----> "+(s1==s2));// addresses are same or not
        System.out.println(".equalto check string inside s1 and s2----->"+s1.equals(s2));// the string are same or not ;
        s2="my name vishal";
        System.out.println("address same :--> "+(s1==s2));
    }
}