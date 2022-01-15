package Lesson16_Another_Important_Topics.Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class Example4_Calculator {
    void sum(int a, int b){
        int result = a+b;
        System.out.println("Sum of"+ a + " and " + b + " = "+ result);
    }
    void subtraction(int a, int b){
        int result = a-b;
        System.out.println("Subtraction of"+ a + " and " + b + " = "+ result);
    }
    void multiplication(int a, int b){
        int result = a*b;
        System.out.println("Multiplication of "+ a + " and " + b + " = "+ result);
    }
    void division(int a, int b){
        int result = a/b;
        System.out.println("Division of "+ a + " and " + b + " = "+ result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("test100.txt"))){
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Example4_Calculator calculator = new Example4_Calculator();
            Class cl = calculator.getClass();
            Method method = null;
            Method[] methods = cl.getDeclaredMethods();
            for(Method myMethod : methods){
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
            //We are calling to method, that is written in file test100 (just method name), then next 2 lines with digits, will parse from
            //Strings to int and will be calculated

            /*
            file test100.txt contains:
            sum
            13
            5
             */
            //Without reflection it would be impossible to read from file methods name and call this method in our calculator class

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
