package Practice;

public class aToA {

    public char convert(char name){
        char ans = (char)(name - 'a' + 'A');
        return ans;
    }

    public static void main(String[] args) {
        aToA obj = new aToA();
        char name = 'r'; 
        char converted = obj.convert(name);
        System.out.println("Converted: " + converted);  // Output: R
    }
}
