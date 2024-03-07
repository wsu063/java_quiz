package ch13.quiz02;

public class Container<K, M> {
    private K key;
    private M value;

    public K getKey() {
        return key;
    }

    public M getValue() {
        return value;
    }
    public void set(K key, M value) {
        this.key = key;
        this.value = value;
    }
}
