//I use DCP5 instead of "Pair" because it makes it easier to organize for me.
public class DCP5 {

    /*
    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the
    first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
     */

    int car;
    int cdr;

    DCP5(int a, int b) {
        this.car = a;
        this.cdr = b;
    }


    public static DCP5 cons(int a, int b) {
        return new DCP5(a, b);
    }

    public static int car(DCP5 p) {
        return p.car;
    }

    public static int cdr(DCP5 p) {
        return p.cdr;
    }

    public static void main(String[] args) {
        DCP5 p1 = new DCP5(3,4);
        System.out.println(cdr(cons(3, 4)));

    }
}