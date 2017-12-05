package xyz.ivyxjc;


public class TestRunner {
    static int run(Expr e) {
        if (e instanceof Num) {
            return ((Num) e).value;
        }
        if (e instanceof Sum) {
            return run(((Sum) e).left) + run(((Sum) e).right);
        }
        throw new IllegalArgumentException("Unknown Expression");
    }

    public static void main(String[] args) {
        int s = run(new Sum(new Sum(new Num(1), new Num(2)), new Num(4)));
        System.out.println(s);
        String s1 = new String("sss");
    }
}

interface Expr {

}

class Sum implements Expr {
    Expr left;
    Expr right;

    public Sum(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }
}

class Num implements Expr {
    int value;

    public Num(int value) {
        this.value = value;
    }
}



