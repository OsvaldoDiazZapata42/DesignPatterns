package Singleton;

/*
 * This class is a Singleton
 * * The constructor is private
 * * The constructor has no parameters
 * * There is another private class which is used for lazy load and threat safe
 * * The unique public method return the instance that was already created
 */
public class DbSingletonConnection{

    private DbSingletonConnection(){}

    private static class LazyHolder{
        static final DbSingletonConnection INSTANCE = new DbSingletonConnection();
    }

    public static DbSingletonConnection getInstance(){
        return LazyHolder.INSTANCE;
    }
}