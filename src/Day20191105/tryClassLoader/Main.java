package Day20191105.tryClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auth:yqy
 * @Date 2019/11/5 13:04
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        MyClassLoader classLoader=new MyClassLoader("HelloWorld");
        Class helloWord=classLoader.findClass("C:\\Users\\好看小哥哥\\Desktop\\个人\\Test\\");
        Method sayHi=helloWord.getMethod("sayHi");
        sayHi.invoke(helloWord.newInstance());
    }
}
