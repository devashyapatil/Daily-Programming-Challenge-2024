class Day20 {
    public void insertTop(Stack<Integer> stack, int topElement) {

        if (stack.empty() || topElement >= stack.peek()) {
            stack.push(topElement);
            return;
        }

        int temp = stack.pop();
        insertTop(stack, topElement);
        stack.push(temp);
    }

    public void sortStack(Stack<Integer> stack) {
        if (!stack.empty()) {
            int topElement = stack.pop();
            sortStack(stack);
            insertTop(stack, topElement);
        }
    }
}
