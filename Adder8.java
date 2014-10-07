package chaos;

public class Adder8 {
    private boolean[] bool1 = new boolean[8];
    private boolean[] bool2 = new boolean[8]; 
    private boolean[] boolsum = new boolean[8];
    public Adder8 (int one, int two) {
        add(correct(one), correct(two));
    }
    
    private void add(int one, int two) {
        this.bool1 = binToBool(one);
        this.bool2 = binToBool(two);
        FullAdder fulladder = new FullAdder(bool1[0], bool2[0], false);
        this.boolsum[0] = fulladder.s();
        for (int x = 1; x < 8; x++) {
            boolean ci = fulladder.co();
            fulladder.add(bool1[x], bool2[x], ci);
            this.boolsum[x] = fulladder.s();
        }    
    }
    private int correct(int one) {
        String temp = Integer.toString(one); 
        if (temp.length() < 8) {
            int add = 8 - temp.length();
            for (int x = 0; x < add; x++){
                temp = "0" + temp;
            }
            return Integer.parseInt(temp, 10);    
        }
        else {
            return one; 
        }
    }
    public String boolToBin(boolean[] bool) {
        String str = ""; 
        int x = 0;
        for (boolean i : bool) {
            if (i) {
                str += "1";
            }
            else {
                str += "0";
            }
            x++;
        }
        String output = new StringBuffer(str).reverse().toString();
        return output; 
    }
    
    public void output() {
        String output = boolToBin(this.boolsum);
        System.out.println(output);
    }
   
    public boolean[] binToBool(int binary) {
        boolean[] bool = new boolean[8];
        String bin = Integer.toString(binary);
        int x = 0;
        for (char chr : bin.toCharArray()) {
            if (Character.toString(chr).equals("1")) {
                bool[x] = true;
               
            }
            else {
                bool[x] = false;
            }
            x++;
        }
        
        return bool;
    }
}
