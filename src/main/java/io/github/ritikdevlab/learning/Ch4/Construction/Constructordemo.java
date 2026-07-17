package io.github.ritikdevlab.learning.Ch4.Construction;
public class Constructordemo {
    public static void main(String[] args) {
        Components[] n = new Components[3];
        n[0] = new Components("Ritik" , 12);
        n[1] = new Components("Rabin" , 14);
        n[2] = new Components("Ranjit" , 15);
        for (int i = 0; i < n.length;i++) {
            IO.println("Name = " + n[i].getName() +
             ", Roll no = " + n[i].rollNo() + ", Mark = " + n[i].getMark());
        }
        Components arr[] = new Components[2];
        arr[0] = Components.CreateComponents("Ritik", 12);
        arr[1] = Components.CreateComponents(null, 0);
        for (Components e : arr) {
            IO.println("Name = " + e.getName() 
                + ", Roll no = " + e.rollNo() + ", Mark = " + e.getMark());
        }
        Components ar[] = new Components[2];
        for(int i = 0;i < 2;i++) {
            int r = 12;
            ar[i] = Components.crComponents(r);
            r++;
        }
        for(int i = 0;i < ar.length;i++) {
            IO.println("Name = " + ar[i].getName() + " ,Roll No = " + 
                ar[i].rollNo() + " ,Mark = " + ar[i].getMark());
        }
        Components ap[] = {Components.NewComponents("Ritik"),
                           Components.NewComponents("Rabin"),
                           Components.NewComponents("Kuni")
                          };
        for (int i = 0;i < ap.length;i++) {
            IO.println("Name = " + ap[i].getName() + " ,Roll No = "
                    + ap[i].rollNo() + " ,Mark " + ap[i].getMark());  
        }                 
        Components al[] = {Components.NuaComponents() ,
                            Components.NuaComponents()
                            };
        for (Components j : al) {
            IO.println("Name = " + j.getName() 
            + " ,Roll No = " + j.rollNo() + " Mark = " + j.getMark());
        }
    }   
}
class Components {
    private String name;
    private int rollNo;
    private double no;
    private static int No = 1;
    private static double mark;
    private static int count = 1;
    static {
        //int No = 1;
        mark = No;
    }
    {
        no = mark++;
    }
    public Components (String Name , int rollNo) {
        name = Name;
        this.rollNo = rollNo;
    }
    public static Components CreateComponents(String n , int r) {
        return new Components(n, r);
    }
    public Components(int rollNo) {
        this("Components#" + count , rollNo);
        count++;
    }
    public static Components crComponents(int roll) {
        return new Components(roll);
    }
    public Components(String n) {
        this(n , 12);
    }
    public static Components NewComponents(String N) {
        return new Components(N);
    }
    public Components() {
        //Here everything is empty
    }
    public static Components NuaComponents() {
        return new Components();
    }
    public String getName() {
        return name;
    }
    public int rollNo() {
        return rollNo;
    }
    public double getMark() {
        return no;
    }
}