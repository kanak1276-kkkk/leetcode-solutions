class Solution {
    public boolean isValid(String s) {
        

        StringBuilder st = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.append(ch);
            }
            else {
                if (st.length() == 0) {
                    return false;
                }

                char last = st.charAt(st.length() - 1);

                if (ch == ')' && last != '(' ||
                    ch == '}' && last != '{' ||
                    ch == ']' && last != '[') {
                    return false;
                }

                st.deleteCharAt(st.length() - 1);
            }
        }

        return st.length() == 0;
    }
}
