package ch3StackQueuekk;

public class LinkStack<E> implements Stack<E>//链式栈类
{
    private Node<E> top;
    
    public LinkStack()//构造空栈
    {
        this.top=null;  //栈顶结点
    }
    public boolean isEmpty()  //判断是否空栈
    {
    	return this.top==null;
        	
    }

    public boolean push(E data)  //数据data入栈，若操作成功返回true
    {
    	//待补充
    			return true;
    } 

    public E pop()//出栈，返回当前栈顶数据，若栈空返回null
    {
    	//待补充
    			return null;
    }

    public E getTop()//取栈顶数据值，未出栈，若栈空返回null
    {//待补充
		return null;

    }

    @Override
    public String toString()//返回栈中各数据的字符串描述
    {
    	//待补充
    			return null;
    }    
}

