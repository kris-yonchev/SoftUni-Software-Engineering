package reflectionsAndAnnotations.reflection;

import java.lang.reflect.InvocationTargetException;



public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflection = Reflection.class;

        System.out.println(reflection);
        System.out.println(reflection.getSuperclass());
        Class[] interfaces = reflection.getInterfaces();
        for (Class inter : interfaces) {
            System.out.println(inter);
        }

        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);

    }

}
