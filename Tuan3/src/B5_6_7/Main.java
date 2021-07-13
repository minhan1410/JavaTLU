package B5_6_7;

import B4.Stack;

public class Main {
    public static void chuyenNhiPhan(int n) {
        Stack<Integer> stack = new Stack();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        for (int i : stack.getStack()) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void daoNgc(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i) + "");
        }
        for (String i : stack.getStack()) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static boolean canBangNgoac(String s) {
        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> mo = new Stack<>();
        Stack<Character> dong = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                mo.push(s.charAt(i));
            }
            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                dong.push(s.charAt(i));
            }
        }

        for(int j=0;j<mo.getStack().size();j++){
            for(int i=0;i<s.length();i++){
                if(mo.isEmpty()){
                    break;
                }
                if (mo.peek() == '{' && s.charAt(i) == '}' || mo.peek() == '[' && s.charAt(i) == ']' || mo.peek() == '(' && s.charAt(i) == ')') {
                    mo.pop();
                }
            }
        }

        for(int j=0;j<dong.getStack().size();j++){
            for(int i=0;i<s.length();i++){
                if(dong.isEmpty()){
                    break;
                }
                if (dong.peek() == '}' && s.charAt(i) == '{' || dong.peek() == ']' && s.charAt(i) == '[' || dong.peek() == ')' && s.charAt(i) == '(') {
                    dong.pop();
                }
            }
        }

        if(mo.isEmpty()==true && dong.isEmpty()==true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        chuyenNhiPhan(10);
        daoNgc("A34732-Nguyen Minh An");
        System.out.println(canBangNgoac("{[1]]}"));
        System.out.println(canBangNgoac("{1{2{3}4}5}6"));
        System.out.println(canBangNgoac("{1{ 2[3 }} 4]"));//đóng mở không đối xứng
        System.out.println(canBangNgoac("{[))"));
        System.out.println(canBangNgoac("{1[ 2{3 } }4]"));
    }
}
