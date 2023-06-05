package seminar4;

public class Node<V> {
    public Node<V> parent;
    public Node<V> left;
    public Node<V> right;
    public V value;
    public Color color;

    public Node() {
    }

    public Node(V value) {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.value = value;
        this.color = Color.RED;
    }


    @Override
    public String toString() {
        return "Node{this=" + this.hashCode() +
                ", parent=" + (parent != null ? parent.hashCode() : "null") +
                ", left=" + (left != null ? left.hashCode() : "null") +
                ", right=" + (right != null ? right.hashCode() : "null") +
                ", value=" + value +
                ", color=" + color +
                '}';
    }
}
