public class Main {
    public static void main(String[] args) {
        ObjX objOne = new ObjX();
        ObjX objTwo = new ObjX();
        SingletonClass singleOne = SingletonClass.getInstance("singleOne");
        SingletonClass singleTwo = SingletonClass.getInstance("singleTwo");
        SingletonClass singleThree = SingletonClass.getInstance("singleThree");

        System.out.println(singleOne);
        System.out.println(singleTwo);
        System.out.println(singleThree);
        System.out.println("\n");
    }
}