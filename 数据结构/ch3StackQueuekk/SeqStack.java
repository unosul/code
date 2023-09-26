package ch3StackQueuekk;

public class SeqStack<E> implements Stack<E> {
    // 存储栈的数据值的数组
    private Object[] value;
    // 栈顶数据的下标
    private int top;

    // 带参构造方法，创建指定容量的空栈
    public SeqStack(int capacity) {
        // 初始化存储栈数据的数组为指定容量的新数组
        this.value = new Object[capacity];
        // 初始化栈顶下标为-1，表示栈为空
        this.top = -1;
    }

    // 默认构造方法，创建容量为100的空栈
    public SeqStack() {
        // 调用带参数构造方法，传入默认容量100
        this(100);
    }

    // 判断是否为空栈，若空栈返回true
    public boolean isEmpty() {
        return top == -1;
    }

    // 数据data入栈，若操作成功返回true
    public boolean push(E data) {
        if (top == value.length - 1) {
            // 栈已满，无法入栈
            return false;
        }
        // 将data存储在数组的下一个位置，然后栈顶下标增加1
        value[++top] = data;
        return true;
    }

    // 出栈，返回当前栈顶数据，若栈空返回null
    public E pop() {
        if (isEmpty()) {
            // 栈为空，无法出栈
            return null;
        }
        // 取出栈顶数据，栈顶下标减少1
        E data = (E) value[top];
        top--;
        return data;
    }

    // 取栈顶数据值，未出栈，栈顶数据未改变
    public E getTop() {
        if (isEmpty()) {
            // 栈为空，无栈顶数据
            return null;
        }
        // 返回栈顶数据的值
        return (E) value[top];
    }

    // 返回栈中各数据的字符串表示
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(value[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
