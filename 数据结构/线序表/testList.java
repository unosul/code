import java.util.Scanner;

public class testList {
    private Scanner se = new Scanner(System.in);
    private int maxn=100;   //数组最大容量
    private int n=-1;   //未存储任何数据
    private Object[] date; //声明数组类型

    public void csh(){  //初始化
        date = new Object[maxn];    //新建数组
        n=0;
        System.out.println("初始化成功");
    }

    public  void xssj(){    //显示数组数据
        if (n<=0){  //判断数组内是否有数据
            System.out.println("数组中未存在任何数组");
        }
        else {
            for (int i=1;i<=n;i++){ //按顺序输出数据
                System.out.print(date[i]+"  ");
            }
        }
    }
    public int sjgs(){ //显示数据个数
        return n; //返回数据个数
    }

    public void zjsj(Object l) throws Exception { //增加数据

        if (n==-1){     //判断数组是否初始化
            throw new Exception("未初始化");
        }
        if (n>=100){    //判断数组是否存满
            throw new Exception("线性表已满，无法插入");
        }
        date[n+1]=l;    //数据新增
        n++;    //数据个数增加
    }

    public void crsj()throws  Exception{
        if (n>=100){    //判断数组是否存满
            throw new Exception("线性表已满，无法插入");
        }
        System.out.println("请输入要插入的位置");
        int index = se.nextInt();
        se.nextLine();
        System.out.print("请输入要插入的数据：");
        String x = se.nextLine();
        if (index>n||index<1){
            throw new Exception("找不到位置插入");
        }
        for (int i=n;i >=index;i--){
            date[i+1]=date[i];
        }
        date[index]=x;
        n++;


    }
    public void scsj()throws Exception{
        int index=se.nextInt();
        if(index>n){
            throw new Exception("查找不到数据");
        }
        for (int i=index;i<n;i++){
            date[i]=date[i+1];
        }
        n--;
    }
    public void scsj(int index)throws Exception{

        if(index>n){
            throw new Exception("查找不到数据");
        }
        for (int i=index;i<n;i++){
            date[i]=date[i+1];
        }
        n--;
    }
    public Object czsj(int index){
        if(index>n){
            System.out.println("查找不到数据");
        }
        return date[index];
    }

    public void xgsj()throws Exception{
        System.out.println("请输入要修改的位置");
        int index = se.nextInt();
        se.nextLine();
        System.out.print("请输入要修改的数据：");
        String x = se.nextLine();
        if (index>n||index<1){
            throw new Exception("找不到位置插入");
        }
        date[index]=x;
    }

}
