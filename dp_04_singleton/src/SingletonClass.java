public class SingletonClass {
    //    private static SingletonClass uniqueInstance = new SingletonClass(); // new ... : eager creation
    private volatile static SingletonClass uniqueInstance;
    static String name;

    private SingletonClass(String name) {
        this.name = name;
        System.out.println(this+" : "+this.name);
    }

    public static SingletonClass getInstance(String n) {
        //Double checker if it's still null to synchronize
        if (uniqueInstance == null) synchronized ((SingletonClass.class)) {
            if (uniqueInstance == null) {
                uniqueInstance = new SingletonClass(n);
            }
        }
        System.out.println("n: "+n);
        //Eager simple returns
        return uniqueInstance;
    }
}
