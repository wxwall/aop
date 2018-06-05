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
        return (T)Proxy.newProxyInstance(loader,interfaces,h);
    }
}
