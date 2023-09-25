public class Stack <V> implements IStack<V>{
    private StackNode<V> top;
    private int size;
    public Stack() {
        top = null;
        size = 0;
    }
    public void push(V value) {
        StackNode<V> newNode = new StackNode<V>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    public V pop() {
        if (top == null) {
            return null;
        }
        V value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    public V peek() {
        if (top == null) {
            return null;
        }
        return top.getValue();
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

}