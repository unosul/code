package ch3StackQueuekk;

public class LinkQueue<E> implements Queue<E> //链式队列类
{
    private Node<E> front, rear;  //front和rear分别指向队头和队尾节点

    public LinkQueue() //构造空队列
    {
        this.front = this.rear = null;
    }

    public boolean isEmpty()//判断队列是否空，若空返回true
    {
        return this.front == null && this.rear == null;
    }

    public boolean enQueue(E data)//数据data入队，若操作成功返回true
    {
    	//待补充
    		return true;
    }

    public E deQueue() //出队，返回当前队头数据，若队列空返回null
    {
    	//待补充
		return null;
    }

    public E getFront() {
    	//待补充
    			return null;
    }

    @Override
    public String toString()//返回栈中各数据的字符串描述
    {
    	//待补充
    			return null;
    }
}
