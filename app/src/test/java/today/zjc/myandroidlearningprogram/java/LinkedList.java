package today.zjc.myandroidlearningprogram.java;

public class LinkedList<E> {
    private int size = 0;
    private int modCount = 0;
    private Node<E> first;
    private Node<E> last;

    /**
     * 在尾部添加
     *
     * @param e
     */
    public void linkLast(E e) {
        //尾部暂存
        final Node<E> temp = last;
        //新节点添加到维护
        Node<E> node = new Node<E>(temp, e, null);
        last = node;
        if (first == null) {
            first = node;
        } else {
            temp.next = node;
        }
        size++;
        modCount++;
    }

    /**
     * 在头添加数据
     *
     * @param e
     */
    public void linkFirst(E e) {
        final Node<E> temp = first;
        Node<E> newNode = new Node<>(null, e, temp);
        first = newNode;
        if (temp == null) {
            last = newNode;
        } else {
            temp.prev = newNode;
        }
        size++;
        modCount++;

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "size=" + size +
                ", modCount=" + modCount + "\n" +
                ", first=" + first + "\n" +
                ", last=" + last +
                '}';
    }
}

/**
 * 链表元素
 */
class Node<E> {

    E item; //节点本身
    Node<E> prev;  //前一个节点
    Node<E> next;  //下一个节点


    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node:[" + item.toString() + (next != null ? "," + next.toString() : "") + "]";

//        return "Node{" +
//                "item=" + item +
//                ", prev=" + prev +
//                ", next=" + next +
//                '}';
    }
}
