public interface IStack <V>{
    void push(V value);
    V pop();
    V peek();
    int size();
    boolean isEmpty();
}
