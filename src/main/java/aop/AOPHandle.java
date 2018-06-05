package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wuxiaowei on 2018/6/5
 */
public class AOPHandle implements InvocationHandler {

    Object obj = null;

    public AOPHandle(Object obj) {
        this.obj = obj;
    }

    public void before(){
        System.out.println("before输出...");
    }

    public void end(){
        System.out.println("end 输出...");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(obj, args);
        end();
        return invoke;
    }
}
