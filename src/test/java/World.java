public class World implements Runnable, Comparable<Object> {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(Test.Inner.class);
    }

    @Override
    public void run() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
