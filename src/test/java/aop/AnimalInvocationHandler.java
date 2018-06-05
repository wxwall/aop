package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wuxiaowei on 2018/6/5
 */
public class AnimalInvocationHandler implements InvocationHandler {

    Object object ;

    public AnimalInvocationHandler(Object object) {
        this.object = object;
    }

    void before(){
        System.out.println("before。。。");
    }

    void end(){
        System.out.println("end...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(object, args);
        end();
        return invoke;

    }
}
