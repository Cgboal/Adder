package chaos;

public class FullAdder {
    private HalfAdder halfadder_1;
    private HalfAdder halfadder_2; 
    private boolean a;
    private boolean b;
    private boolean ci;
    private boolean co;
    private boolean s;
    public FullAdder(boolean a, boolean b, boolean ci) {
        add(a, b, ci);
    }
    public void output() {
        System.out.printf("s = %b, co = %b %n", this.s, this.co);
    }
    
    public void add(boolean a, boolean b, boolean ci) {
        this.a = a;
        this.b = b;
        this.ci = ci;
        halfadder_1 = new HalfAdder(this.a, this.b);
        halfadder_2 = new HalfAdder(this.ci, halfadder_1.s());
        this.s = halfadder_2.s();
        this.co = halfadder_1.c() | halfadder_2.c();
    }
    public boolean s() {
        return this.s;
    }
    public boolean co() {
        return this.co;
    }
}
