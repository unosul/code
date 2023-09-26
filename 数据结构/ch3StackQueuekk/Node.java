//单链表节点类
package ch3StackQueuekk;

public class Node<E>           //单链表节点类
{
    private E data;             //数据域，保存数据
    private Node<E> next;       //地址域，引用后继节点

    public Node(E data, Node<E> next)//构造节点，指定数据和后继节点
    {
        this.data = data;
        this.next = next;
    }

    public Node(E data)  //构造节点，指定数据，后继节点为空
    {
        this(data, null);
    }

    public Node()//构造节点，数据和后继节点均为空
    {
        this(null, null);
    }

    public String toString()   //返回节点数据值对应的字符串
    {
        return this.getData().toString();
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
