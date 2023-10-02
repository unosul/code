import java.util.Scanner;

/**
 * @author yyz
 * @create 2023-09-13 8:24
 */
public class SelectMoneyMain {
    public static void main(String[] args) {
        boolean isFlag = true;
        Scanner s = new Scanner(System.in);
        SeqList seqList = new SeqList();

        while (isFlag) {
            System.out.println("\n======猴子选大王操作菜单======");
            System.out.println("1.使用顺序存储线性表自动建立猴子编码ABC...");
            System.out.println("2.开始选大王(顺序存储)");
            System.out.println("3.使用链式存储线性表自动建立猴子编码ABC...");
            System.out.println("4.开始选大王(链式存储)");
            System.out.println("5.退出");
            System.out.print("请输入(1-5):");

            int select = s.nextInt();
            //判断输入的数字是否合理
            if (select > 5 || select < 1) {
                System.out.println("请输入1-5");
                continue;
            }

            switch (select) {
                case 1://使用顺序存储线性表自动建立猴子编码ABC...
                    seqList.init();//初始化表
                    System.out.print("请输入猴子个数(最高26)：");
                    int num = s.nextInt();

                    if (num > 26) {
                        System.out.println("最高26只");
                        num = 26;
                    }

                    for (int i = 0; i < num; i++) {
                        seqList.add((char) ('A' + i));
                    }

                    System.out.print("当前数据为：");
                    seqList.display();
                    System.out.println();
                    break;
                case 2://开始选大王(顺序存储)
                    System.out.print("请输入开始的序号：");
                    int start = s.nextInt();
                    System.out.print("请输入间隔数：");
                    int interval = s.nextInt();
                    for (int i = start + interval - 1; seqList.getSize() > 1; i += interval - 1) {
                        i = getIndex(seqList, i);
                        System.out.print("删除：" + seqList.getData(i) + "\t");
                        seqList.delete(i);
                        System.out.print("删除后的数据：");
                        seqList.display();
                        System.out.println();
                    }
                    break;
                case 3://使用链式存储线性表自动建立猴子编码ABC...
                    System.out.println("未开发...");
                    break;
                case 4://开始选大王(链式存储)
                    System.out.println("未开发...");
                    break;
                case 5://退出
                    System.out.println("退出");
                    isFlag = false;
            }
        }


    }

    private static int getIndex(SeqList seqList, int i) {
        int index = i;
        if (i > seqList.getSize()) {
            index = i - seqList.getSize();
            index = getIndex(seqList, index);
        }

        return index;
    }
}
