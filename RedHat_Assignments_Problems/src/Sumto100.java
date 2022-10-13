
import java.io.PrintStream;


public class Sumto100 {
	
	static void print(int givenSum) {
        Expression expression = new Expression();
        int counter = 0;
        for (int i = 0; i < Expression.NUMBER_OF_EXPRESSIONS; i++, expression.next()) {
            if (expression.toInt() == givenSum) {
         
                
                if (counter==1) {
                 expression.print();
                break;
                }
                counter++;
            }
        }
    }
    public static void main(String[] args) {
     
          print(100);
    }

    
    private static class Expression {

        private final static int number_of_digits = 9;
        private final static byte add = 0;
        private final static byte sub = 1;
        private final static byte join = 2;

        final byte[] code = new byte[number_of_digits];
        final static int NUMBER_OF_EXPRESSIONS = 2 * 3 * 3 * 3 * 3 * 3 * 3 * 3 * 3;

        Expression next() {
            for (int i = 0; i < number_of_digits; i++) {
                if (++code[i] > join) {
                    code[i] = add;
                } else {
                    break;
                }
            }
            return this;
        }

        int toInt() {
            int value = 0;
            int number = 0;
            int sign = (+1);
            for (int digit = 1; digit <= 9; digit++) {
                switch (code[number_of_digits - digit]) {
                    case add:
                        value += sign * number;
                        number = digit;
                        sign = (+1);
                        break;
                    case sub:
                        value += sign * number;
                        number = digit;
                        sign = (-1);
                        break;
                    case join:
                        number = 10 * number + digit;
                        break;
                }
            }
            return value + sign * number;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder(2 * number_of_digits + 1);
            for (int digit = 1; digit <= number_of_digits; digit++) {
                switch (code[number_of_digits - digit]) {
                    case add:
                        if (digit > 1) {
                            s.append('+');
                        }
                        break;
                    case sub:
                        s.append('-');
                        break;
                }
                s.append(digit);
            }
            return s.toString();
        }

       void print() {
            print(System.out);
        }

      void print(PrintStream printStream) {
            printStream.format("%9d", this.toInt());
            printStream.println(" = " + this);
        } 
    }

}