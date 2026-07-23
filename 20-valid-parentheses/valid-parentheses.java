class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        // SIRF EK LOOP: Shuru se aakhiri tak (0 se arr.length)
        for (int i = 0; i < arr.length; i++) {
            
            // Agar opening bracket hai, toh chupchaap stack mein daal do
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            } 
            // Agar closing bracket hai, toh usi waqt check aur pop karo
            else {
                // Agar bina kisi opening bracket ke seedhe closing aa gaya (e.g., "]")
                if (stack.isEmpty()) {
                    return false; 
                }
                
                char top = stack.peek(); // Top element ko check karo
                
                // Agar sahi joda mila toh pop karo, varna turant false!
                if ((arr[i] == ')' && top == '(') || 
                    (arr[i] == '}' && top == '{') || 
                    (arr[i] == ']' && top == '[')) {
                    stack.pop(); // Sahi match mila, stack se hatao
                } else {
                    return false; // Galat joda mila (e.g., "( ]"), seedhe FAIL!
                }
            }
        }

        // Agar saare brackets sahi se match hokar pop ho gaye, toh stack khali hoga
        return stack.isEmpty();
    }
}
