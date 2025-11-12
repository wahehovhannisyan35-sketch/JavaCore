package tnayin.pordz;

import java.lang.reflect.Method;

public class MetaDemo {
    static void main() {
        Class<?> aClass =AnotetionDemo.class;
        try {
            Method m= aClass.getMethod("meth");
            MyAnotetion annotation = m.getAnnotation(MyAnotetion.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
