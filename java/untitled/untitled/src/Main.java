package fang;

import java.util.Scanner;

public class RedCowForm {


    public static void main(string[] args) throws Exception {
        int select, number, n, m, index;
        seqList seqlist = new SeqList();
        singleLinkList singlelinklist = new singleLinkList();
        selectMonkeyMain selectmonkey = new selectMonkeyMain();
        do {
            system.out.println(" \n==========猴子选大王操作菜单==========");
            System.out.println("\t1.使用顺序存储线性表自动建立猴子编码ABc...");
            system.out.print1n("lt2.开始选大王(顺序存储)");
            System.out.println("\t 3.使用链式存储线性表自动建立猴子编码ABC...");
            system.out.println("\t 4.开始选大王（链式存储)");
            system.out.print1n("lt 5.退出\n");
            System.out.println("请输入您的选择项:");
            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();
            switch (select) {
                case 1:
                    seqlist.initiate();//初始化表system.out.print("请输入猴子个数: ");number = scan.nextInt();
                    for (int i = 0; i < number; i++) {
                        try {//从A开始自动创建n个字符代表猴子
                            seqlist.add(new String((char) ('A' + i) + "")
                        } catch (Exception e) {
                            system.out.print(e.tostring());
                        }
                    }
                    system.out.println("已经完成建立，数据是:");
                    seqlist.displayData();
                    system.out.println("");
                    break;
                case 2:
                    system.out.print("请输入开始的序号:");
                    n = scan.nextInt(o);//n开始的序号system.out.print("请输入间隔数:");m = scan.nextInt(); //m间隔的距离数
                    selectmonkey.selectMonkey(seqlist, n, m);
                    break;
                case 3:
                    singlelinklist.initiate();
                    1 / 初始化表


            }
        }

    }
}






