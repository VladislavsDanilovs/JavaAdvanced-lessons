package Lesson16_Another_Important_Topics.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2_Reflection2_Objects {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("Lesson16_Another_Important_Topics.Reflection.Employee");

//       Employee e = (Employee)employeeClass.newInstance(); //Java 8 version of creating object, but today is deprecated

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Vlad", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 1200);
        System.out.println(obj2);
    }
}
