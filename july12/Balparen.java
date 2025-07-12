package july12;

import java.util.Stack;

public class Balparen {
  public static void main(String[] args) {
    Balparen obj = new Balparen();
    String s = "{[()]}";
    System.out.println(obj.isValid(s)); // true
  }

  public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        st.push(ch);
      } else {
        if (st.isEmpty()) return false;
        char top = st.pop();
        if ((ch == ')' && top != '(') ||
            (ch == '}' && top != '{') ||
            (ch == ']' && top != '[')) {
          return false;
        }
      }
    }
    return st.isEmpty();
  }
}
