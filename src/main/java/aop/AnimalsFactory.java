package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wuxiaowei on 2018/6/5
 */
public class AnimalsFactory {

    public static <T> T getAnimals(ClassLoader loader,
                             Class<?>[] interfaces,
                             InvocationHandler h){
        System.out.println("");
        System.out.println("test");
        System.out.println("test");
        System.out.println("hello");


        System.out.print("我干了一件事");
        System.out.print("我干了一件事");
        System.out.print("我干了一件事");
        System.out.print("我干了一件事");


        return (T)Proxy.newProxyInstance(loader,interfaces,h);
    }
}
