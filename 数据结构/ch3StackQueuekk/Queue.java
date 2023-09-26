package ch3StackQueuekk;

public interface Queue<E> //队列接口
{

    boolean isEmpty(); //判断队列是否为空，若空返回true

    boolean enQueue(E element); //数据element入队，若操作成功返回true

    E deQueue();  //出队，返回当前队头数据，若队列空返回null

    E getFront();  //取队头数据值，未出队，若队空返回null
}
