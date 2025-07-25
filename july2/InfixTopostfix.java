package july2;
import java.util.*;

public class InfixTopostfix {
  static int Prec(char ch) {
    switch (ch) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
      default:
        return -1; 
    }
  }

  static String InfixTopostfix(String exp) {
    String result = "";
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);

      if (Character.isLetterOrDigit(c)) {
        result += c;
      }
      else if (c == '(') {
        stack.push(c);
      }
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          result += stack.pop();
        }
        if (!stack.isEmpty() && stack.peek() == '(') {
          stack.pop(); 
        } else {
          return "Invalid";
        }
      }
      else {
        while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
          result += stack.pop();
        }
        stack.push(c); 
      }
    }

    while (!stack.isEmpty()) {
      if (stack.peek() == '(') {
        return "Invalid";
      }
      result += stack.pop();
    }

    return result;
  }

  public static void main(String[] args) {
    String exp = "(p+q)*(m-n)";
    System.out.println("Postfix: " + InfixTopostfix(exp));
  }
}
