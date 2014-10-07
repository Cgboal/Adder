package chaos;

public class Chaos {

    public static void main(String[] args) {
        //Replace initial values with desired values for calculation ensuring the f is intact. 
        Adder8 adder8 = new Adder8((int)00000011f, (int)00000001f);
        adder8.output();
    }    
}