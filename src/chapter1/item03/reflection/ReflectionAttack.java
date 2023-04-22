package chapter1.item03.reflection;

import java.lang.reflect.Constructor;

public class ReflectionAttack {
    public static void main(String[] args) throws Exception {
        Constructor<ElvisReflection> constructor = ElvisReflection.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ElvisReflection elvis1 = constructor.newInstance();
        ElvisReflection elvis2 = ElvisReflection.getInstance();
        System.out.println(elvis1 == elvis2); // false
    }
}