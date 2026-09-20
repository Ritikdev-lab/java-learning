package io.github.ritikdevlab.learning.ch5.reflection;

import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.*;

public class AnalyzeObjects {
    /**
     * Gets the value of a field from an object using reflection.
     * 
     * @param obj The object from which to get the field value
     * @param fieldName The name of the field to get
     * @param lookup The lookup object for accessing the field
     * @return The value of the field
     * @throws NoSuchFieldException If the field is not found
     * @throws IllegalAccessException If the field is not accessible
     */
    static Object getFieldValue(Object obj, String fieldName, Lookup lookup)
            throws NoSuchFieldException, IllegalAccessException {
        Class<?> cl = obj.getClass();
        Field field = cl.getDeclaredField(fieldName);
        VarHandle handle = MethodHandles.privateLookupIn(cl, lookup).unreflectVarHandle(field);
        return handle.get(obj);
    }

    public static void main(String[] args) throws Exception {
        var e1 = new AnalyzeClass("Ritik", 91452, 20, "+3", "Doctor");
        var e2 = new AnalyzeClass("Rabin", 34562, 16, "+2", "Scientist");
        var e3 = new AnalyzeClass("Rama", 46789, 60, "6th", "Police");

        AnalyzeClass[] arr = {e1, e2, e3};

        Class<?> cl = e1.getClass();
        
        // -----------------------
        // Using Reflection
        // -----------------------
        
        // Read names from array.
        Field f = cl.getDeclaredField("name");
        IO.println("Can it access:-"+ f.canAccess(e1));
        
        if (f.trySetAccessible()) {
	        for (AnalyzeClass a : arr) {
	            IO.println("Names = " + f.get(a));
	        }
        } else {
			IO.println("Access Denied");
		}    
        
        // Change the name of e1
        f.set(e1, "King");
        IO.println("Name of e1(Changed) = " + e1.getName());
        
        // Read the age from array.
        Field g = cl.getDeclaredField("age");
        IO.println("Can it access it:-" + g.canAccess(e2));
        g.setAccessible(true);
        
        for (AnalyzeClass b : arr) {
            IO.println("Age = " + g.get(b));
        }
        
        // Change the age of e2.
        g.set(e2, 70);
        IO.println("Age e2(Changed) = " + e2.getAge());
        
        // Read the className from the array.
        Field k = cl.getDeclaredField("className");
        IO.println("Can it access it:-" + k.canAccess(e3));
        k.setAccessible(true);

        for (AnalyzeClass a : arr) {
            IO.println("Class Name = " + k.get(a));
        }
        
        // Change the className of e3.
        k.set(e3, "12th");
        IO.println("Class Name e3(Changed) = " + e3.getClassName());
        
        Field pu = cl.getField("aim");
        
        for (AnalyzeClass p : arr) {
        	IO.println("Aim = " + pu.get(p));
        }
        
        pu.set(e1, "Soldier");
        IO.println("Aim e1(Changed)" + e1.getAge());
        
        IO.println("After Changes:-");
        AccessibleObject[] fieldsAccessibleObjects = {f, g, k , pu};
        AccessibleObject.setAccessible(fieldsAccessibleObjects, true);
        for (AccessibleObject a: fieldsAccessibleObjects) {
        	Field field = (Field)a;
        	for (AnalyzeClass an : arr) {
        		IO.println(field.getName() + " = " + field.get(an));
        	}
        }
        
        // --------------------
        // Using VarHandle
        // -------------------
        
        Lookup lookup = MethodHandles.lookup();
        
        for (AnalyzeClass a : arr) {
        	IO.println("Name = " + getFieldValue(a, "name", lookup));
        }
        
        VarHandle nameHandle = MethodHandles.privateLookupIn(cl, lookup).unreflectVarHandle(f);
        nameHandle.set(e1, "King");
        
        IO.println("Name e1 (VarHandle Changed) = " + nameHandle.get(e1));
        
        // Other can be done likewise.
    }
}