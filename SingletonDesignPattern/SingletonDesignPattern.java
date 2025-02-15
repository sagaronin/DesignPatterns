package SingletonDesignPattern;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
		System.out.println(obj.hashCode());
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj2.hashCode());
		//Nullify Singleton Instance;
		SingletonClass.tearDown();
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
		SingletonClass.tearDown();
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
    }
}
