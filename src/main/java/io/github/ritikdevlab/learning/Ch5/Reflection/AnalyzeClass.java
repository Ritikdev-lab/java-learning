package io.github.ritikdevlab.learning.Ch5.Reflection;

import java.io.IOException;
import java.lang.reflect.*;
import java.sql.SQLException;

public class AnalyzeClass {
    private String name;
    private int id;
    private int age;
    private String className;
    public String aim;

    /**
     * Constructor with parameters for AnalyzeClass
     * 
     * @param name the name of the student
     * @param id the id of the student
     * @param age the age of the student
     * @param className the class of the student
     * @param aim the aim of the student
     * @throws IOException if the file could not be read
     * @throws SQLException if there is a database error
     */
    public AnalyzeClass(String name, int id, int age, String className, String aim) throws IOException, SQLException {
        this.name = name;
        this.id = id;
        this.age = age;
        this.className = className;
        this.aim = aim;
    }
    
    /**
     * This method analyzes the class capacity by creating an instance of AnalyzeClass with the provided parameters.
     * 
     * @param Name the name of the student
     * @param ID the id of the student
     * @param Age the age of the student
     * @param className the class of the student
     * @param aim the aim of the student
     * @return an instance of AnalyzeClass
     * @throws IOException if the file could not be read
     * @throws SQLException if there is a database error
     */
    public static AnalyzeClass analyzeClassCapacity(String Name, int ID, int Age, String className, String aim) throws IOException, SQLException {
        return new AnalyzeClass(Name, ID, Age, className, aim);
    }
    
    /**
     * The method to get the name of the student
     * 
     * @return the name of the student
     */
    public String getName() {
        return name;
    }
    
    /**
     * The method to set the name of the student
     * 
     * @param name the name of the student
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The method to get the id of the student
     * 
     * @return the id of the student
     */
    public int getId() {
        return id;
    }
    
    /**
     * The method to set the id of the student
     * 
     * @param id the id of the student
     */
    protected void setId(int id) {
        this.id = id;
    }
    
    /**
     * The method to get the age of the student
     * 
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }
    
    /**
     * The method to set the age of the student
     * 
     * @param age the age of the student
     */
    protected void setAge(int age) {
        this.age = age;
    }
    
    /**
     * The method to get the class of the student
     * 
     * @return the class of the student
     */
    public String getClassName() {
        return className;
    }
    
    /**
     * The method to set the class of the student
     * 
     * @param className the class of the student
     */
    protected void setClassName(String className) {
        this.className = className;
    }
    
    /**
     * This method gets the Aim of the student 
     * 
     * @return the aim of the student
     */
    public String getAim() {
    	return aim;
    }
    
    /**
     * This method set the aim of the student
     * 
     * @param aim the aim of the student needed to set
     */
    public void setAim(String aim) {
    	this.aim = aim;
    }
    /**
     * The method to read a file
     * 
     * @throws IOException if the file could not be read
     * @throws SQLException if there is a database error
     */
    protected void readFile() throws IOException, SQLException {
        throw new IOException("File could not be read"); 
    }
    
    /**
     * Prints a headline surrounded by hyphens.
     * 
     * @param head the text to display as the headline
     */
    public static void headLine(String head) {
		IO.print("-".repeat(10));
        IO.print(head);
        IO.println("-".repeat(10));
        IO.println();
	}
    
    /**
     * The method to calculate the hash code of the student
     * 
     * @return the hash code of the student
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result + age;
        result = prime * result + ((className == null) ? 0 : className.hashCode());
        return result;
    }
    
    /**
     * The method to check if two student objects are equal
     * 
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AnalyzeClass other = (AnalyzeClass) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        if (age != other.age)
            return false;
        if (className == null) {
            if (other.className != null)
                return false;
        } else if (!className.equals(other.className))
            return false;
        return true;
    }
    
    /**
     * The method to convert the student object to a string
     * 
     * @return the string representation of the student
     */
    @Override
    public String toString() {
        return "AnalyzeClass [name=" + name + ", id=" + id + ", age=" + age + ", className=" + className + "]";
    }

    /**
     * This is a record class named InnerAnalyzeClass that represents a pair of integers (num1 and num2).
     * It has a compact constructor that ensures num1 is always less than or equal to num2 by swapping their values if necessary.
     * 
     * InnerAnalyzeClass is a nested record class within the AnalyzeClass.
     * @param num1 the first integer
     * @param num2 the second integer
     */
    public record InnerAnalyzeClass(int num1, int num2) {
        public InnerAnalyzeClass {
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
    }
    public static sealed class Animal permits Dog, Cat {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    public static final class Dog extends Animal {
        public void bark() {
            System.out.println("Dog says: Woof!");
        }
    }
    public static final class Cat extends Animal {

        public void meow() {
            System.out.println("Cat says: Meow!");
        }
    }

    interface Printable {
        void print();
    }

    interface Showable {
        void show();
    }

    class Student implements Printable, Showable {

        @Override
        public void print() {
            System.out.println("Printing Student");
        }

        @Override
        public void show() {
            System.out.println("Showing Student");
        }
    } 
       
    public static void main(String[] args) throws Exception {
        AnalyzeClass name = new AnalyzeClass("Ritik", 32109, 19, "Commerce", "Doctor");
        var analyse  = new InnerAnalyzeClass(2, 1);
        Animal ani = new Animal();
        
        // ----------------------------
        // 1. Class information
        // ----------------------------
        
        AnalyzeClass.headLine("CLASS INFORMATION(AnalyzeClass)");
        
        Class<?> convertClass = name.getClass();
        IO.println("Declaring Class:-" + convertClass.getDeclaringClass());
        IO.println();

        IO.println("Class Name:-" + convertClass.getName() + ", " + "Modifiers:-" + Modifier.toString(convertClass.getModifiers()) + ", " + "Package name:-" + convertClass.getPackageName());
        IO.println("is Interface?:-" + convertClass.isInterface());
        IO.println("is Enum?:-" + convertClass.isEnum());
        IO.println("is Record?:-" + convertClass.isRecord());
        IO.println("is it Sealed:-" + convertClass.isSealed());
        IO.println("SuperClass:-" + convertClass.getSuperclass());

        IO.println();

        
        AnalyzeClass.headLine("CLASS INFORMATION(Animal)");

        Class<?> convertSealed = ani.getClass();
        IO.println("Declaring Class:-" + convertSealed.getDeclaringClass());
        IO.println();

        IO.println("Class Name:-" + convertSealed.getName() + ", " + "Modifiers:-" + Modifier.toString(convertSealed.getModifiers()) + ", " + "Package name:-" + convertSealed.getPackageName());
        IO.println("is Interface?:-" + convertSealed.isInterface());
        IO.println("is Enum?:-" + convertSealed.isEnum());
        IO.println("is Record?:-" + convertSealed.isRecord());
        IO.println("is it Sealed:-" + convertSealed.isSealed());
        IO.println("SuperClass:-" + convertSealed.getSuperclass());

        IO.println();

        
        AnalyzeClass.headLine("CLASS INFORMATION(Student)");

        Class<?> convertInterface = Student.class;
        IO.println("Declaring Class:-" + convertInterface.getDeclaringClass());
        IO.println();

        IO.println("Class Name:-" + convertInterface.getName() + ", " + "Modifiers:-" + Modifier.toString(convertInterface.getModifiers()) + ", " + "Package name:-" + convertInterface.getPackageName());
        IO.println("is Interface?:-" + convertInterface.isInterface());
        IO.println("is Enum?:-" + convertInterface.isEnum());
        IO.println("is Record?:-" + convertInterface.isRecord());
        IO.println("is it Sealed:-" + convertInterface.isSealed());
        IO.println("SuperClass:-" + convertInterface.getSuperclass());

        IO.println();

        
        AnalyzeClass.headLine("CLASS INFORMATION(InnerAnalyzeClass)");

        Class<?> convertRecord = analyse.getClass();
        IO.println("Declaring Class:-" + convertRecord.getDeclaringClass());
        IO.println();

        IO.println("Class Name:-" + convertRecord.getName() + ", " + "Modifiers:-" + Modifier.toString(convertRecord.getModifiers()) + ", " + "Package name:-" + convertRecord.getPackageName());
        IO.println("is Interface?:-" + convertRecord.isInterface());
        IO.println("is Enum?:-" + convertRecord.isEnum());
        IO.println("is Record?:-" + convertRecord.isRecord());
        IO.println("SuperClass:-" + convertRecord.getSuperclass());

        IO.println();

        // ----------------------------
        // 2. Fields
        // ----------------------------
        
        AnalyzeClass.headLine("FIELDS(PUBLIC ONLY)");

        Field[] findField = name.getClass().getFields();
        boolean found = false;
        for (Field F : findField) {
            IO.println("Field:-" + F.getName() + ", " + "Parameter:-" + F.getType().getName() + ", " + "Access Flags:-" + F.accessFlags());
            found = true;
        }
        if (!found) {
            IO.println("No Public Field Found");
        }
        IO.println();

        
        AnalyzeClass.headLine("FIELDS(ALL)");

        Field[] findClass = name.getClass().getDeclaredFields();
        for (Field f : findClass) {
            IO.println("Field:-" + f.getName() + ", " + "Parameter:-" + f.getType().getName() + ", " + "Modifiers:-" + Modifier.toString(f.getModifiers()));
            IO.println();
        }

        IO.println();

        // ----------------------------
        // 3. Constructors
        // ----------------------------
        
        AnalyzeClass.headLine("CONSTRUCTORS(PUBLIC ONLY)");

        Constructor<?>[] findConstructor = name.getClass().getConstructors();
        Constructor<?> constructor = convertClass.getDeclaredConstructor(String.class, int.class, int.class, String.class,String.class);

        Class<?>[] exception = constructor.getExceptionTypes();

        for (Class<?> ex : exception) {
            IO.println("Constructor Exception:-" + ex.getName());
        }
        IO.println();

        for (Constructor<?> c : findConstructor) {
            IO.println("ConstructorL-" + c.getName() + ", " + "ModifiersL:-" + Modifier.toString(c.getModifiers()));

            IO.println("Parameter:-");
            Class<?>[] parameter = c.getParameterTypes();
            for (Class<?> p : parameter) {
                IO.println(" " + p.getName());
            }
            IO.println();
        } 

        
        AnalyzeClass.headLine("CONSTRUCTORS(ALL)");

        Constructor<?>[] findConstructors = name.getClass().getDeclaredConstructors();
        for (Constructor<?> c : findConstructors) {
            IO.println("Constructor:-" + c.getName() + ", " + "Access Flags:-" + c.accessFlags());

            IO.println("Parameters:-");
            Class<?>[] parameters = c.getParameterTypes();
            for (Class<?> p: parameters) {
                IO.println(" " + p.getName());
            }
            IO.println();
        }

        IO.println();

        // -----------------------------
        // 4. Methods
        // -----------------------------
        
        AnalyzeClass.headLine("METHODS(PUBLIC ONLY)");

        Method[] finMethods = name.getClass().getMethods();
        for (Method m : finMethods) {
            IO.println("Method:-" + m.getName() + ", " + "Access Flags:-" + m.accessFlags() + ", " + "Return Type:-" + m.getReturnType().getName());
        
            IO.println("Parameter:-");
            Class<?>[] parameter = m.getParameterTypes();
            boolean find = false;
            for (Class<?> p : parameter) {
                IO.println(" " + p.getName());
                find = true;
            }
            if (!find) {
                IO.println("No Parameter Found");
            }
            IO.println();
        }

        IO.println();

        
        AnalyzeClass.headLine("METHODS(ALL)");
        
        Method[] findMethod = name.getClass().getDeclaredMethods();
        Method method = name.getClass().getDeclaredMethod("readFile");

        Class<?>[] findException = method.getExceptionTypes();

        for (Class<?> e : findException) {
            IO.println("All Exception(readFile method):-" + e.getName());
        }
        IO.println();

        for (Method m : findMethod) {
            IO.println("Method:-" + m.getName() + ", " + "Modifier:-" + Modifier.toString(m.getModifiers()) + ", " + "Return Type:-" + m.getReturnType().getName()); 
            
            IO.println("Parameters:-");      
            Class<?>[] parameters = m.getParameterTypes();
            boolean finds = false;
            for (Class<?> p : parameters) {
                IO.println(" " + p.getName());
                finds = true;
            }
            if (!finds) {
                IO.println("No Parameter Found");
            }
            IO.println();
        }

        IO.println();

        // ------------------------------
        // 5. Records
        // ------------------------------
        
        AnalyzeClass.headLine("RECORD(InnerAnalyzeClass)");

        Class<?> classInfo = analyse.getClass();
        IO.println("Class:-" + classInfo.getName());
        IO.println("is Record:-" + classInfo.isRecord());
        if (classInfo.isRecord()) {
            RecordComponent[] record = classInfo.getRecordComponents();
            for (RecordComponent r : record) {
                IO.println("Component:-" + r.getName() + ", " + "Type:-" + r.getType().getName() + ", " + "Accessor:-" + r.getAccessor());
            }
        }
        
        IO.println();

        // -----------------------------
        // 6. Sealed
        // -----------------------------
        
        AnalyzeClass.headLine("SEALED(Animal)");

        Class<?> sealedClass = ani.getClass();
        IO.println("Class:-" + sealedClass.getName());
        IO.println("Is Sealed:-" + sealedClass.isSealed());

        if (sealedClass.isSealed()) {
            IO.println("Permitted Subclasses:-");

            for (Class<?> c : sealedClass.getPermittedSubclasses()) {
                IO.println(" " + c.getName());
            }
        }

        IO.println();

        // ------------------------------
        // 7. Interface
        // ------------------------------
        
        AnalyzeClass.headLine("INTERFACE(Student)");

        Class<?> clazz = Student.class;
        IO.println("Class:-" + clazz.getName());
        IO.println("Is Interface:-" + clazz.isInterface());
        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }

        IO.println();

        // ------------------------------
        // 8. Checking modifiers
        // ------------------------------
        
        AnalyzeClass.headLine("CHECKING MODIFIERS");

        for (Method m : findMethod) {
            IO.println("Method:-" + m.getName());
            IO.println("is it Public?:-" + Modifier.isPublic(m.getModifiers()));
            IO.println("is it Private?:-" + Modifier.isPrivate(m.getModifiers()));
            IO.println("is it Static?:-" + Modifier.isStatic(m.getModifiers()));
            IO.println("is it Abstract?:-" + Modifier.isAbstract(m.getModifiers()));
            IO.println("is it Final?:-" + Modifier.isFinal(m.getModifiers()));
            IO.println("is it Interface?:-" + Modifier.isInterface(m.getModifiers()));
            IO.println("is it Native?:-" + Modifier.isNative(m.getModifiers()));
            IO.println("is it Protected?:-" + Modifier.isProtected(m.getModifiers()));
            IO.println("is it Strict?:-" + Modifier.isStrict(m.getModifiers()));
            IO.println("is it Volatile?:-" + Modifier.isVolatile(m.getModifiers()));
            IO.println();
        }

        IO.println();
    }
}