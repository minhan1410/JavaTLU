package Tuan3.Bai4_5_6_7_8;

public class Chung {
    public static void NhiPhan(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static String DaoChuoi(String str) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }
        String nstr = "";
        while (!stack.isEmpty()) {
            nstr += stack.pop();
            // System.out.print(nstr);
        }
        // System.out.println();
        return nstr;
    }

    public static boolean CanBang(String str) {
        // {1222}
        // stack-mo {
        // stack dong}
        // {1222]
        // stack-mo {
        // stack dong]
        // [{(<>))}]
        // stack-mo [{(<
        // <
        // (
        // {
        // [
        // stack dong >))}]
        // ]
        // }
        // )
        // )
        // >
        // ]}))>
        // {1}{2}
        Stack<Character> stack_mo = new Stack<Character>();
        Stack<Character> stack_dong = new Stack<Character>();
        int dem_mo = 0, dem_dong = 0;
        String str_dong = "";

        // luu stack
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '<') {
                dem_mo++;
                stack_mo.push(str.charAt(i));
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')' || str.charAt(i) == '>') {
                dem_dong++;
                stack_dong.push(str.charAt(i));
            }
        }

        while (!stack_dong.isEmpty()) {
            str_dong += stack_dong.pop();
        }
        int pos = 0;

        if (dem_mo == dem_dong) {
            while (!stack_mo.isEmpty()) {
                if (stack_mo.peek() == '<' && str_dong.charAt(pos) == '>'
                        || stack_mo.peek() == '(' && str_dong.charAt(pos) == ')'
                        || stack_mo.peek() == '[' && str_dong.charAt(pos) == ']'
                        || stack_mo.peek() == '{' && str_dong.charAt(pos) == '}') {
                    pos++;
                    stack_mo.pop();
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
