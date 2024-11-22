package Problem7;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> m = new MyList<>();
        m.add(3);
        m.add(2);
        System.out.println(m.largest());
        System.out.println(m.smallest());
    }
}
