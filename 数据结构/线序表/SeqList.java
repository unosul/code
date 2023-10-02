import java.util.Scanner;

/**
 * @author yyz
 * @create 2023-09-12 10:46
 */
public class SeqList {
    private Scanner s = new Scanner(System.in);
    private int size = -1;//未初始化为-1
    private int max = 100;//线性表长度最大为100
    private Object[] data;//数据类型
    private static final String UNINITIALIZED = "未初始化";
    private static final String NODATA = "没有数据";
    private static final String INIT_SUCCESSFUL = "初始化成功";
    private static final String LINEAR_LIST_FULL = "线性表已满";
    private static final String SUCCESS = "成功";
    private static final String INDEX_NOT_FOUND = "没有该索引";

    /**
     * 初始化
     */
    public void init() {
        size = 0;
        data = new Object[max];
        System.out.println(INIT_SUCCESSFUL);
    }

    /**
     * 显示线性表中数据
     */
    public void display() {
        for (int i = 1; i <= size; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    /**
     * 显示表中个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 追加数据
     */
    public void add() {
        if (size >= 100) {
            System.out.println(LINEAR_LIST_FULL);
            return;
        }

        System.out.print("请输入要追加的数据：");
        String o = s.nextLine();

        data[size + 1] = o;
        size++;

        System.out.println(SUCCESS);
    }

    /**
     * 追加数据
     *
     * @param o 数据
     */
    public void add(Object o) {
        if (size >= 100) {
            System.out.println(LINEAR_LIST_FULL);
            return;
        }
        data[size + 1] = o;
        size++;
    }

    /**
     * 插入数据
     */
    public void insert() {
        if (size >= 100) {
            System.out.println(LINEAR_LIST_FULL);
            return;
        }

        System.out.print("请输入要插入的位置：");
        int index = s.nextInt();

        s.nextLine();

        System.out.print("请输入要插入的数据：");
        String o = s.nextLine();

        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return;
        }

        for (int i = size; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = o;
        size++;

        System.out.println(SUCCESS);
    }

    /**
     * 删除数据
     */
    public void delete() {
        System.out.print("请输入要删除的索引：");
        int index = s.nextInt();

        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return;
        }

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        System.out.println(SUCCESS);
    }

    /**
     * 删除数据
     *
     * @param index 索引
     */
    public void delete(int index) {
        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return;
        }

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    /**
     * 获取数据
     *
     * @return
     */
    public Object getData() {
        System.out.print("请输入要查找的索引：");
        int index = s.nextInt();

        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return null;
        }

        return data[index];
    }

    /**
     * 获取数据
     *
     * @param index 索引
     * @return
     */
    public Object getData(int index) {
        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return null;
        }

        return data[index];
    }

    /**
     * 修改数据
     */
    public void update() {
        System.out.print("请输入要修改的索引：");
        int index = s.nextInt();

        s.nextLine();

        System.out.print("请输入要修改的数据：");
        String o = s.nextLine();

        if (index > size || index < 1) {
            System.out.println(INDEX_NOT_FOUND);
            return;
        }

        data[index] = o;

        System.out.println(SUCCESS);
    }

    /**
     * 是否初始化
     *
     * @return
     */
    public boolean decideInit() {
        if (size == -1) {
            System.out.println(UNINITIALIZED);
            return false;
        }
        return true;
    }

    /**
     * 是否有数据
     *
     * @return
     */
    public boolean decideData() {
        if (size == 0) {
            System.out.println(NODATA);
            return false;
        }
        return true;
    }
}
