package t;
import java.lang.reflect.Field; 

public class ModifyngPrivateFields 
{
    public static void main(String[] args) throws Exception 
    {
        Reflect pf = new Reflect(); 

        Field f = pf.getClass().getDeclaredField("result"); 
        f.setAccessible(true); 
        f.setInt(pf, 47); 
        System.out.println("1. " + pf); 

        f = pf.getClass().getDeclaredField("error"); 
        f.setAccessible(true); 
        f.set(pf, "MODIFY S"); 
        System.out.println("2. " + pf); 

        f = pf.getClass().getDeclaredField("result"); 
        f.setAccessible(true); 
        f.setInt(pf, 35);
        System.out.println("3. " + pf); 
    }
}
