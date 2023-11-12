package maven;

public class Calculadora {
    public int somaInt(int a, int b) {
        return a + b;
    }
        public int subtraInt(int a, int b) {
            return a - b;
        }

        public int multiplicaInt(int a, int b) {
            return a * b;
        }
       
        public int divideInt(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return a / b;
        
       
        
    
    
}
}