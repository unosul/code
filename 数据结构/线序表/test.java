import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner se = new Scanner(System.in);
        testList testList=new testList();
        while (true) {
            System.out.println("猴子选大王线性表");
            System.out.println("1.建立顺序表猴子编码");
            System.out.println("2.开始选大王（顺序）");
            System.out.println("3.建立链表猴子编码");
            System.out.println("4.开始选大王（链表）");
            System.out.println("5.退出");
            System.out.println("请输入选项（1-5）");

            int num = se.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            switch (num) {
                case 1:
                    testList.csh();
                    System.out.println("请输入猴子个数：");
                    int x=se.nextInt();
                    if (x>26||x<0){
                        System.out.println("输入错误，请重新输入！");
                    }
                    for (int i=0;i<x;i++){
                        testList.zjsj((char)('A'+i));
                    }
                    System.out.println("猴子数据为：");
                    testList.xssj();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("请输入起始序号：");
                    int start=se.nextInt();
                    System.out.println("请输入间隔数：");
                    int space=se.nextInt();
                    for (int i = start + space ; testList.sjgs() > 1; i += space - 1) {
                        i = getIndex(testList, i);
                        System.out.print("删除"+testList.czsj(i)+" ");
                        testList.scsj(i);
                        System.out.print("删除后数据：");
                        testList.xssj();
                        System.out.println();
                    }
                    break;
                case 3:
                    testList.csh();
                    System.out.println("请输入猴子个数：");
                    int d=se.nextInt();
                    if (d>26||d<0){
                        System.out.println("输入错误，请重新输入！");
                    }

                    break;
                case 4:
                    
                    break;
                case 5:
                    return;

            }
        }
    }
    private static int getIndex(testList testList, int i) {
        int index = i;
        if (i > testList.sjgs()) {
            index = i - testList.sjgs();
            index = getIndex(testList, index);
        }

        return index;
    }

}
