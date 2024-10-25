import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String originalString = "Hello";
        Stack<Character> stack = new Stack<>();

        for (char ch : originalString.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString.toString());
    }
}

class StackPushExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);
    }
}

class StackPopExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack before pop: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
    }
}

class StackPeekExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        int topElement = stack.peek();
        System.out.println("Top Element after peek: " + topElement);
        System.out.println("Stack after peek: " + stack);
    }
}

class BuiltInStackIsEmptyExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        }

        stack.push(50);
        stack.push(100);

        if (!stack.isEmpty()) {
            System.out.println("Top Element: " + stack.peek());
        }

        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty after popping all elements.");
        }
    }
}

class CustomStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot add more elements.");
        } else {
            stackArray[++top] = value;
            System.out.println("Added " + value + " to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

class CustomStackIsEmptyExample {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        }

        stack.push(10);
        stack.push(20);

        System.out.println("Top Element: " + stack.peek());

        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty after popping all elements.");
        }
    }
}

class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peeked value: " + stack.peek());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("Stack is empty now.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedStack {
    private Node top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " to stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peeked value: " + stack.peek());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("Stack is empty now.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
}
