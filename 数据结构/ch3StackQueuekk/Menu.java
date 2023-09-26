package ch3StackQueuekk;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    String data;

    public void mainMenu()//主菜单
    {
        int select;
        do {
            System.out.print("\n\n");
            System.out.print("\t\t☆★☆ 栈和队  操作主菜单☆★☆\n");
            System.out.print("\n");
            System.out.print("\t【 1-栈的顺序存储结构】");
            System.out.print("\t【 2-栈的链式存储结构】\n");
            System.out.print("\t【 3-队的顺序存储结构】");
            System.out.print("\t【 4-队的链式存储结构】\n");
            System.out.print("\t\t\t    【5-退出】\n");
            System.out.print("\n");
            System.out.print("\t请选择：");
            select = input.nextInt();
            switch (select) {
                case 1:
                    seqstackMenu();
                    break;
                case 2:
                    linkStackMenu();
                    break;
                case 3:
                    seqqueueMenu();
                    break;
                case 4:
                    linkqueueMenu();
                    break;
                case 5:
                    System.out.println("\t ^_^ 感谢您的使用^_^\n");
                    System.out.print("\t   欢迎下次使用\n");
                    System.out.print("\t     再    ★    見\n");
                    System.exit(0);
                    break;
                default:
                    continue;
            }
        } while (true);
    }

    public void seqstackMenu()//栈的顺序存储结构操作菜单
    {
        SeqStack<String> seqstack = new SeqStack<String>();
        int select = 0;
        do {
            System.out.print("\n");
            System.out.print("\t\t☆★☆栈的顺序存储结构的操作菜单☆★☆\n");
            System.out.print("\n");
            System.out.print("\t【 1-判断栈】   【 2-进栈】");
            System.out.print("\t【 3-出栈  】   【 4-取栈顶数据】");
            System.out.print("\t【 5-显示栈所有数据】\n");
            System.out.print("\t【 6-返回上一级菜单】\n");
            System.out.print("\n 请选择: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    if (seqstack.isEmpty() == true) {
                        System.out.println("\t栈为空！");
                    } else {
                        System.out.println("\t栈中有数据!");
                    }
                    break;
                case 2:
                    System.out.print("\t输入要进栈的数据：");
                    data = input.next();
                    seqstack.push(data);
                    System.out.print("\t进栈数据为： " + data + "\n");
                    break;
                case 3:
                    System.out.println("\t出栈数据为： " + seqstack.pop());
                    break;
                case 4:
                    System.out.println("\t栈顶数据为： " + seqstack.getTop());
                    break;
                case 5:
                    System.out.println("\t栈顶" + seqstack.toString() + "栈底");
                    break;
                case 6:
                    mainMenu();
                    break;
                default:
                    continue;
            }
        } while (true);
    }//栈的顺序存储操作菜单结束

    public void linkStackMenu()//栈的链式存储结构操作菜单
    {
        LinkStack<String> linkstack = new LinkStack<String>();
        int select;
        do {
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\t\t☆★☆栈的链式存储结构的操作菜单☆★☆\n");
            System.out.print("\n");
            System.out.print("\t【 1-判断栈】       【  2-进栈】");
            System.out.print("\t【 3-出栈  】       【 4-取栈顶数据】");
            System.out.print("\t【 5-显示栈所有数据】\n");
            System.out.print("\t【 6-返回上一级菜单】\n");
            System.out.print("\n\n\t 请选择: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    if (linkstack.isEmpty() == true) {
                        System.out.println("\t栈为空！");
                    } else {
                        System.out.println("\t栈中有数据!");
                    }
                    break;
                case 2:
                    System.out.print("\t输入要进栈的数据：");
                    data = input.next();
                    linkstack.push(data);
                    System.out.print("\t进栈数据为： " + data + "\n");
                    break;
                case 3:
                    System.out.println("\t出栈数据为： " + linkstack.pop());
                    break;
                case 4:
                    System.out.println("\t栈顶数据为： " + linkstack.getTop());
                    break;
                case 5:
                    System.out.println("\t栈顶" + linkstack.toString() + "栈底");
                    break;
                case 6:
                    mainMenu();
                    break;
                default:
                    continue;
            }
        } while (true);
    }//栈的链式存储操作菜单结束

    public void seqqueueMenu()//队的顺序存储结构操作菜单
    {
        SeqQueue<String> seqqueue = new SeqQueue<String>(5);
        int select;
        do {
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\t\t☆★☆队的顺序存储结构的操作菜单☆★☆\n");
            System.out.print("\n");
            System.out.print("\t【 1-判断队空】  【 2-进队】");
            System.out.print("\t【 3-出队  】   【 4-显示队头数据】");
            System.out.print("\t【 5-显示队所有数据】 \n");
            System.out.print("\t【 6-返回上一级菜单】\n");
            System.out.print("\n 请选择: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    if (seqqueue.isEmpty()) {
                        System.out.println("\t队为空！");
                    } else {
                        System.out.println("\t队中有数据！");
                    }
                    break;
                case 2:
                    System.out.print("\t输入要进队的数据：");
                    data = input.next();
                    seqqueue.enQueue(data);
                    System.out.print("\t进队数据为： " + data + "\n");
                    break;
                case 3:
                    System.out.println("\t出队数据为： " + seqqueue.deQueue());
                    break;
                case 4:
                    System.out.println("\t队头为：" + seqqueue.value[seqqueue.front]);
                    break;
                case 5:
                    System.out.println("\t队头" + seqqueue.toString() + "队尾");
                    break;
                case 6:
                    mainMenu();
                    break;
                default:
                    continue;
            }
        } while (true);
    }//队的顺序存储操作菜单结束

    public void linkqueueMenu()//队的链式存储结构操作菜单
    {
        //队的链式存储功能菜单的显示及选择
        LinkQueue<String> linkqueue = new LinkQueue<String>();
        //       SeqQueue<String> que = new SeqQueue<String>(5);
        int select;
        do {
            System.out.print("\n");
            System.out.print("\t\t☆★☆队的链式存储结构的操作菜单☆★☆\n");
            System.out.print("\n");
            System.out.print("\t【 1-判断队空】     【  2-进队】");
            System.out.print("\t【 3-出队】         【4-显示队头数据】");
            System.out.print("\t    【 5-显示队所有数据】\n");
            System.out.print("\t【 6-返回上一级菜单】\n");
            System.out.print("\n 请选择: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    if (linkqueue.isEmpty() == true) {
                        System.out.println("\t队为空！");
                    } else {
                        System.out.println("\t队中有数据！");
                    }
                    break;
                case 2:
                    System.out.print("\t输入要进队的数据：");
                    data = input.next();
                    linkqueue.enQueue(data);
                    System.out.print("\t进队数据为： " + data + "\n");
                    break;
                case 3:
                    System.out.println("\t出队数据为： " + linkqueue.deQueue());
                    break;
                case 4:
                    System.out.println("\t队头为：" + linkqueue.getFront());
                    break;
                case 5:
                    System.out.println("\t队头" + linkqueue.toString() + "队尾");
                    break;
                case 6:
                    mainMenu();
                    break;
                default:
                    continue;
            }
        } while (true);
    }//队的链式存储操作菜单结束
}
