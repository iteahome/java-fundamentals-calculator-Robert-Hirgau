public class Main {

        public static void main(String[] args) {
            int x = 8;
            int y = 6;
            calculate(x, y,'+');
            calculate(x, y,'-');
            calculate(x, y,'*');
            calculate(x, y,'/');
            calculate(x, y,'%');
        }
        public static void calculate(int x, int y, char c){
            int result;
            switch (c){
                case '+':
                    result = x + y;
                    System.out.println(x +" + " + y +" = " + result );
                    break;
                case '-':
                    result = x - y;
                    System.out.println(x + " - " + y + " = " + result);
                    break;
                case '*':
                    result = x * y;
                    System.out.println(x + " * " + y + " = " + result);
                    break;
                case '/':
                    result = x / y;
                    System.out.println(x + " / " + y + " = " + result);
                    break;
                case '%':
                    result = x % y;
                    System.out.println(x + " % " + y + " = " + result);
                    break;
            }
        }
    }

