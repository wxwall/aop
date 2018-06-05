package aop;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //Animals animals = new DogImpl();
        Class clazz = DogImpl.class;
        AnimalInvocationHandler animalsHandler = null;
        try {
            animalsHandler = new AnimalInvocationHandler(clazz.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Animals o = (Animals)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),animalsHandler);
        o.getName();
    }
}
