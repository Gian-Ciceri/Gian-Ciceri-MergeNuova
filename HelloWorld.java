// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld_backup {
    public enum Roman{
        I(1),
        Z(4),
        V(5),
        O(9),
        X(10),
        T(40),
        L(50),
        P(90),
        C(100),
        R(400),
        D(500),
        E(900),
        M(1000);
        
        private int numVal;

        Roman(int numVal) {
            this.numVal = numVal;
        }
    
        public int getNumVal() {
            return numVal;
        }
    }
    public static void main(String[] args) {
        String[] s = "MCMXCIV".replace("IV", "Z")
        .replace("IX", "O")
        .replace("XL", "T")
        .replace("XC", "P")
        .replace("CD", "R")
        .replace("CM", "E").split("");
        int a = Roman.valueOf(s[0]).getNumVal();
        for (int i = 1; i < s.length; i++) {
            int v = Roman.valueOf(s[i]).getNumVal();
            int vmenouno = Roman.valueOf(s[i-1]).getNumVal();
            if (v<=vmenouno){
                a += v;
            }
            else{
                a -= v;
            }
        }
        
        System.out.println("Il numero " + String.join("", s)+ " equivale a " + a);
        
    }
}