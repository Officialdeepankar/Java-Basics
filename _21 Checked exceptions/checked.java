import java.io.IOException;

/*
 * checked exception are exception during compile time
 * By looking at the code compiler interpret that this line might give error and it 
 * give error during compile time itself;
 * IN checked exception , unlike unchecked exception there is no formulation of 
 * .class file 
 */
public class checked{
    public static void main(String[] args) {
        
    
        try{
            throw new IOException();
        }catch(IOException e)
        {
         System.out.println("Exception: "+ e.getMessage());
        }
        
        //System.out.println("After exception");
    }
}