package aop;

/**
 * Created by wuxiaowei on 2018/6/5
 */
public class DogImpl implements Animals {
    @Override
    public void getName() {
        System.out.println("这是一条狗");
    }

    @Override
    public void getSex() {
        System.out.println("公狗");
    }
}
