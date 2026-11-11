
import java.beans.*;

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Q8 {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Student.class);

        System.out.println("Student Properties:");

        for (PropertyDescriptor p :
             info.getPropertyDescriptors()) {
            System.out.println(p.getName());
        }

        System.out.println("\nStudent Methods:");

        for (java.lang.reflect.Method m :
             info.getMethodDescriptors().length > 0
             ? java.util.Arrays.stream(info.getMethodDescriptors())
                 .map(MethodDescriptor::getMethod)
                 .toArray(java.lang.reflect.Method[]::new)
             : new java.lang.reflect.Method[0]) {
            System.out.println(m.getName());
        }
    }
}
