package chaos;

public class HalfAdder {
    private boolean a;
    private boolean b;
    protected boolean s;
    protected boolean c;
    public HalfAdder(boolean a, boolean b) {
        add(a, b);
    }
    public void add(boolean a, boolean b) {
        this.a = a;
        this.b = b;
        this.s = this.a ^ this.b;
        this.c = this.a & this.b;
    }
    public void output() {
        System.out.printf("a = %b, b = %b, c = %b, s = %b %n", this.a, this.b, this.c, this.s);
    }
    public boolean a() {
        return this.a;
    }
    public boolean b() {
        return this.b;
    }
    public boolean c() {
        return this.c;
    }
    public boolean s() {
        return this.s;
    }
}
