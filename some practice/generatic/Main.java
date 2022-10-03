package generatic;

public class Main {
    public static void main(String[] args) {
        MyGen<Integer> i = new MyGen<>(10);
        System.out.println(i.getData());
        MyGen<Double> s = new MyGen<>(10.22);
        System.out.println(s.getData());
    }
}
