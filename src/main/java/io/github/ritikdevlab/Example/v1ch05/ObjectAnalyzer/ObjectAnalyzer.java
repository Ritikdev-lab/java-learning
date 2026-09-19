package io.github.ritikdevlab.Example.v1ch05.ObjectAnalyzer;

import module java.base;

public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    /**
     * Converts an object to a string representation that lists all fields.
     * 
     * @param obj an Object
     * @return a string with the object's class name and all field names and values.
     * @throws Exception if an error occurs while accessing the object's fields
     *                   using reflection
     */
    public String toString(Object obj) throws Exception {
        if (obj == null) {
            return "null";
        }

        if (visited.contains(obj)) {
            return "...";
        }

        visited.add(obj);
        Class<?> cl = obj.getClass();

        if (cl == String.class) {
            return (String) obj;
        }

        if (cl.isArray()) {

            String r = cl.getComponentType() + "[]{";

            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    r += ",";
                }

                Object val = Array.get(obj, i);

                if (cl.getComponentType().isPrimitive()) {
                    r += val;
                } else {
                    r += toString(val);
                }
            }
            return r + "}";
        }

        String r = cl.getName();

        // inspect the fields of this class and all superClasses
        do {
            r += "[";

            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);

            // get the names and values of all fields
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) {
                        r += ",";
                    }

                    r += f.getName() + "=";

                    Class<?> t = f.getType();
                    Object val = f.get(obj);

                    if (t.isPrimitive()) {
                        r += val;
                    } else {
                        r += toString(val);
                    }
                }
            }

            r += "]";
            cl = cl.getSuperclass();

        } while (cl != null);

        return r;
    }
}
