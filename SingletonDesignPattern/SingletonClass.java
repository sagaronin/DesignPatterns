package SingletonDesignPattern;

public class SingletonClass {
    //Create constructor with private scope - this will limit the object creation from outside using new keyword
    private SingletonClass(){

    }

    //Since we have made constructor private we want to limit object creation from outside
    // and we dont want direct access to instance of this class,
    // create instance variable inside this class itself

    private static SingletonClass obj;
    //creating private member variable as instance variable limits scope and making it static will create only one copy.

    public static synchronized SingletonClass getInstance(){
        if(obj==null){
            obj = new SingletonClass();
        }
        return obj;
    }

    public static synchronized void tearDown(){
        obj=null;
    }

}
