package stack;

public final class Stack {

    private Node top;

    private class Node {

        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        Object aux = null;

        if (!isEmpty()) {
            aux = top.data;
            top = top.next;
        }

        return aux;
    }

    public Object peek() {
        return top.data;
    }

    public void clear() {
        top = null;
    }

    @Override
    public String toString() {
        Node aux = top;
        String str = "";

        while (aux != null) {
            str += aux.data.toString() + "\n";
            aux = aux.next;
        }

        return str;
    }

}
