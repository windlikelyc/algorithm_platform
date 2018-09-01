package utils;


import javafx.beans.binding.ObjectExpression;
import problems.easy.TwoSum;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public abstract class ClassUtil {


    /**
     * 获取同一路径下所有子类或接口实现类
     *
     * @param intf
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getAllAssignedClass(Class<?> cls) throws IOException,
            ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (Class<?> c : getClasses(cls)) {
            if (cls.isAssignableFrom(c) && !cls.equals(c)) {
                classes.add(c);
            }
        }
        return classes;
    }

    /**
     * 取得当前类路径下的所有类
     *
     * @param cls
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getClasses(Class<?> cls) throws IOException,
            ClassNotFoundException {
//        String pk = cls.getPackage().getName();
        String path = "answers";
//        path = path.replace("problems", "answers");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL url = classloader.getResource(path);
        return getClasses(new File(url.getFile()), path);
    }

    /**
     * 迭代查找类
     * @param dir
     * @param pk
     * @return
     * @throws ClassNotFoundException
     */
    private static List<Class<?>> getClasses(File dir, String pk) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        if (!dir.exists()) {
            return classes;
        }
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                classes.addAll(getClasses(f, pk + "." + f.getName()));
            }
            String name = f.getName();
            if (name.endsWith(".class")) {
                classes.add(Class.forName(pk + "." + name.substring(0, name.length() - 6)));
            }
        }
        return classes;
    }


    public static void main(String[] args) {
    }


    // 注意，这个必须要只有一个方法才行
    // para 方法的实际入参
    public void runAllMethod(Object... para) {
        try {
            System.out.println("获取所有子类和实现类：");
            for (Class<?> c : getAllAssignedClass(TwoSum.class)) {
                System.out.println(c.getName());
                Method[] methods = c.getDeclaredMethods();
                Object ans = methods[0].invoke(c.newInstance(), para);
                check(ans);
            }
//            System.out.println("获取所有类：");
//            for (Class<?> c : getClasses(TwoSum.class)) {
//                System.out.println(c.getName());
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public abstract void check(Object ans);


}
