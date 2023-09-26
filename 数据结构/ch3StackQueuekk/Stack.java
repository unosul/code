package ch3StackQueuekk;

public interface Stack<E> //栈接口
{

    boolean isEmpty();    //判断是否空栈，若空栈返回true

    boolean push(E data);//数据data进栈，若操作成功返回true

    E pop();            //出栈，返回当前栈顶数据，若栈空返回null

    E getTop();       //取栈顶数据值，未出栈，若栈空返回null
}
