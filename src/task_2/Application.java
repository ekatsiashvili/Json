package task_2;

import java.util.Scanner;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {

//	public static void main(String[] args) {
		static Json reflect;
	    public Application() {
	    	
	    	getClassFields (reflect.getClass());
	        getClassMethods(reflect.getClass());
	    
			
	    	Class<?> jc = reflect.getClass();
	    	try {
	    		
	    		 Method method = jc.getMethod("toString");
	             System.out.println(method.invoke(reflect));
	    	
	    		Class<?>[] paramTypes;
	            Object  [] args;

	            paramTypes = new Class[] {int.class, String.class, boolean.class,long.class};
	            method = jc.getMethod("setData", paramTypes);
	            args = new Object[]{(int)1,new String("String"), true, -1};
	            method.invoke(reflect, args);
	            
	            method = jc.getMethod("toString");
	            System.out.println(method.invoke(reflect));
	            
	            System.out.println("Class fields to Json"); 
	            
	    	} catch (NoSuchMethodException e) {
	        } catch (SecurityException e) {
	        } catch (IllegalAccessException e) {
	        } catch (IllegalArgumentException e) {
	        } catch (InvocationTargetException e) {
	        } 
	    }
		
//	    Scan = new Scan();
//		Scanner sc = new Scanner(System.in);
//
//		while (true) {
//			menu();
//
//			switch (sc.next()) {
//			case "1": {
//				club.addMember();
//				break;
//			}
//			case "2": {
//				club.addPet();
//				break;
//			}
//		System.out.println("\"result\": "+;
		
		
//		    Class<?> jc = Json.class;
//			
			
//			Class<?>[] parameterTypes = jc.getParameterTypes();
//			for (int i = 0; i < parameterTypes.length; i++) {
//				Class<?> jc = parameterTypes[i]; {
//						
//			
//			System.out.println("{" +"\""+jc.getFields()+
//					"\""+":"+"\""+jc.arrayType()+"\"" + "}");
//			
//			}
	
	    		
	    

	    private void getClassFields(Class<?> jc)
	    {
	        Field[] fields = jc.getDeclaredFields(); 
	        System.out.println("Class fields"); 
	        for (Field field : fields) { 
	            Class<?> fld = field.getType(); 
	            System.out.println("Class name : " + field.getName()); 
	            System.out.println("Class type : " + fld.getName()); 
	            
	            System.out.println("Class fields to Json"); 
	            System.out.println("{" +"\""+field.getName()+"\":"+reflect); 
	            System.out.println("Class type : " + fld.getName()); 
	        }
	    }
	    private void getClassMethods(Class<?> jc)
	    {
	        Method[] methods = jc.getDeclaredMethods(); 
	        System.out.println("Class methods"); 
	        for (Method method : methods) { 
	            System.out.println("Method name : " + method.getName()); 
	            System.out.println("Return type : " + 
	                                method.getReturnType().getName());
	            Class<?>[] params = method.getParameterTypes(); 
	            System.out.print("Parameters : "); 
	            for (Class<?> param : params)
	                System.out.print(" " + param.getName()); 
	            System.out.println(); 
	        }
	    }
		public static void main(String[] args) 
	    {
	        reflect = new Json();
	        new Application();
	        System.exit(0);
	    }
	    	}

	    
	    

