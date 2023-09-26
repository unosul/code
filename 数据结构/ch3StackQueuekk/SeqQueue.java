package ch3StackQueuekk;

public class SeqQueue<E> implements Queue<E> //顺序循环队列类
{

    public Object[] value;    //存储队列的数据
    public int front, rear;   //front、rear为队列头尾下标

    public SeqQueue(int capacity) //构造指定容量的空队列
    {
        this.value = new Object[capacity];
        this.front = this.rear = 0;
    }

    public SeqQueue() //构造默认容量的空队列
    {
        this(100);
    }

    public boolean isEmpty() //判断队列是否空，若空返回true
    {
    	//待补充
    			return true;
    }

    public boolean enQueue(E data)//数据data进队，若操作成功返回true
    {
    	//待补充
		return true;
    }

    public E deQueue() //出队，返回当前队头数据，若队列空返回null
    {
    	//待补充
		return null;
    }

    public E getFront()
   {
    	//待补充
		return null;
    }

    @Override
    public String toString() //返回队列中各数据的字符串描述
    {
    	//待补充
		return null;
    }
}
