package Lesson16_Another_Important_Topics.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1_Reflection1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("Lesson16_Another_Important_Topics.Reflection.Employee"); //in method forName we should write with which class we want to work

//        Class employeeClass2 = Employee.class; //second option of creating class Class
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass(); //third option of creating class Class

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = "+someField.getType());
        System.out.println("****************");

        Field []fields = employeeClass.getFields();
        Arrays.stream(fields).forEach(e-> System.out.println("Type of "+e.getName()+" = "+e.getType()));

        System.out.println("****************");
        Field [] allFields = employeeClass.getDeclaredFields(); //We will see also private fields
        Arrays.stream(allFields).forEach(e-> System.out.println("Type of "+e.getName()+" = "+e.getType()));

        System.out.println("-------------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = "
        + someMethod1.getReturnType() + ", parameter types "+Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("-------------------------------------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method increaseSalary = "
                + someMethod2.getReturnType() + ", parameter types "+Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("-------------------------------------------");

        Method []methods = employeeClass.getMethods(); //All employee class methods
        Arrays.stream(methods).forEach(e-> System.out.println("Name of method = "+e.getName()+", return type = "+e.getReturnType()
        + ", parameter types "+Arrays.toString(e.getParameterTypes())));

        System.out.println("-------------------------------------------");

        Method []allMethods = employeeClass.getDeclaredMethods(); //All declared methods, without inherited methods
        Arrays.stream(allMethods).forEach(e-> System.out.println("Name of method = "+e.getName()+", return type = "+e.getReturnType()
                + ", parameter types "+Arrays.toString(e.getParameterTypes())));


        System.out.println("-------------------------------------------");

        Method []allMethods2 = employeeClass.getDeclaredMethods(); //All declared methods, without private methods. Class Modifier and method isPublic())
        //allowing us to check modifiers, and if modifier is public, we will see info about it
        Arrays.stream(allMethods2).filter(e -> Modifier.isPublic(e.getModifiers())).forEach(e->
                System.out.println("Name of method = "+e.getName()+", return type = "+e.getReturnType()
                + ", parameter types "+Arrays.toString(e.getParameterTypes())));

        System.out.println("-------------------------------------------");

        Constructor constructor1  = employeeClass.getConstructor();
        System.out.println("Constructor has "+constructor1.getParameterCount() + " parameters, their types are: " +Arrays.toString(constructor1.getParameterTypes()));


        System.out.println("-------------------------------------------");

        Constructor constructor2  = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has "+constructor2.getParameterCount() + " parameters, their types are: " +Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("-------------------------------------------");

        Constructor[] constructors  = employeeClass.getConstructors();
        Arrays.stream(constructors).forEach(e-> System.out.println(
                "Constructor "+ e.getName() +
                "has "+e.getParameterCount() + " parameters, their types are: " +Arrays.toString(e.getParameterTypes())));
    }
}
