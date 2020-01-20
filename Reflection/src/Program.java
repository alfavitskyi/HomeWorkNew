import java.lang.reflect.*;

public class Program {
    public static void main (String[] args) {
        String name = null;

        MyClass myClass = new MyClass();
        Class clss = myClass.getClass();
//        //System.out.println(clss.getName());
//
//        int number = myClass.getYear();
        //System.out.println(number);

//        Field [] fields = myClass.getClass().getDeclaredFields();
//        for (Field f: fields) {
//            System.out.println(f.getName());
//        }

//        try {
//            Field field = myClass.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            name = (String) field.get(myClass);
//            field.set(myClass, (String)"Sirko");
//            System.out.println(field.get(myClass));
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(name);

//        Constructor [] constructors = myClass.getClass().getDeclaredConstructors();
//        for (Constructor c: constructors) {
//            System.out.println(c.getName());
//            Parameter [] parameters = c.getParameters();
//            for (Parameter p:parameters) {
//                System.out.println(p.getName());
//                System.out.println(p.getType().getName());
//            }
//
//        }

//        Method [] methods = myClass.getClass().getDeclaredMethods();
//        for (Method m:methods) {
//            System.out.println(m.getName());
//
//        }
        try {
            Method method = myClass.getClass().getMethod("printText");
            method.setAccessible(true);
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        ///////////////////////////////////////////////////
//        try {
//            Method method = myClass.getClass().getDeclaredMethod("printText");
//            method.setAccessible(true);
//            System.out.println(method.getName());
//            //method.invoke(myClass, "Sirko");
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

////////////////////////////////////////////////
//        System.out.println(MyClass.class.getName());
//        MyClass myClass1 = null;
//        try {
//            Class clazz = Class.forName(MyClass.class.getName());
//            Class [] param = {int.class, String.class};
//            myClass1 = (MyClass) clazz.getConstructor(param).newInstance(6, "Vovk");
//           // myClass1 = (MyClass) clazz.newInstance();
//            Constructor [] constructors = clazz.getConstructors();
//            for (Constructor constructor: constructors) {
//                Class [] paramTypes = constructor.getParameterTypes();
//                for (Class paramType: paramTypes) {
//                    System.out.println(paramType.getName()+" ");
//                }
//                System.out.println();
//            }
//
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        System.out.println(myClass1);

    }

}
