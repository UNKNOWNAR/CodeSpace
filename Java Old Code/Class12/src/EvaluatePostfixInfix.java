import java.util.*;
public class EvaluatePostfixInfix {
    double stack[] = new double[50];
    int sp;

    EvaluatePostfixInfix() {
        sp = -1;
    }

    void push(double ele) {
        if (sp == 49)
            System.out.println("Stack Overflows");
        else {
            sp++;
            stack[sp] = ele; // Pushing operand into the stack
        }
    }

    double pop() {
        double val;
        if (sp == -1) {
            System.out.println("Stack Underflows");
            return (-999);
        } else {
            val = stack[sp]; // Popping an operand from the stack
            sp--;
            return (val);
        }
    }
    void operate() {
        Scanner in = new Scanner(System.in);
        String str;
        int l;
        char c;
        double a, b, res = 0, t;
        System.out.println("Enter a postfix expression");
        str = in.next();
        l = str.length();
        for (int i = 0; i < l; i++) {
            c = str.charAt(i);
            t = (int) c - 48;
            if (t >= 0.0 && t < 10.0)
                push(t);
            else {
                // Popping out two operands simultaneously
                b = pop();
                a = pop();
                // Carrying suitable operation
                switch (c) {
                    case '+':
                        res = a + b;
                        break;
                    case '-':
                        res = a - b;
                        break;
                    case '*':
                        res = a * b;
                        break;
                    case '/':
                        res = a / b;
                        break;
                    case '^':
                        res = Math.pow(a, b);
                        break;
                }
                push(res);
            }
        }
        System.out.println("Result=\t" + pop());
    }

    public static void main(String[] args) {
        EvaluatePostfixInfix control = new EvaluatePostfixInfix();
        control.operate();
    }
}