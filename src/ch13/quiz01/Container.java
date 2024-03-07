package ch13.quiz01;

public class Container<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }
    public T get() {
        return content;
    }
}
