package aop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Animals dogImpl = new DogImpl();
        AOPHandle aop = new AOPHandle(dogImpl);
        ClassLoader classLoader = dogImpl.getClass().getClassLoader();
        Animals dog = AnimalsFactory.getAnimals(classLoader,dogImpl.getClass().getInterfaces(),aop);
        dog.getName();


    }
}
