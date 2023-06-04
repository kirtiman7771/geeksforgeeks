// Reversing the equation
class Solution
{
   String reverseEqn(String S) {
        String[] str = S.split("[*+-/]");
        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            }
        }

        for (int i = str.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                reverse.append(str[i]).append(stack.pop());
            } else {
                reverse.append(str[i]);
            }
        }

        return reverse.toString();
    }
};