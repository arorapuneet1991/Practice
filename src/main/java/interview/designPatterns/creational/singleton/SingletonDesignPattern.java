package interview.designPatterns.creational.singleton;

// allows user to create only one instance of the class
// some people call it code smell -  as there is no certainty that you won't need another instance later
public class SingletonDesignPattern {
    // this is the variable that needs to be private and static
    // private because it should not be accessible from outside
    // static because the static method is using it
    private static SingletonDesignPattern instance;

    // private constructor
    // because we don't want to allow calling new Singleton() from outside
    private SingletonDesignPattern() {
    }

    // this method creates/returns the object
    // static method because if non-static, object would be required to use it
    // from outside, we can call this method
    public static SingletonDesignPattern getInstance() {
        if (instance == null)
            instance = new SingletonDesignPattern();
        return instance;
    }
}
