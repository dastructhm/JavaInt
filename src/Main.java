/*
学习目标：基本数据类型(整数 int)
实际应用：常应用于循环控制、数组索引、执行常规的整数数学运算
概念定义：- 属于整数数据类型的数据，可表示数学上整数的范围
        - 由一组二进制位表示
另请参阅：- https://en.wikipedia.org/wiki/Integer_(computer_science)
        - https://en.wikipedia.org/wiki/Field_(computer_science)
调用API: - https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
        - https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        - https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
*/

// 导入Scanner类
import java.util.Scanner;

public class Main {
    // 创建变量myInteger，但不初始化它77
    static int myInteger;

    public static void main(String[] args) {
        // 打印myInteger的默认值:0
        System.out.println("The default value of int is: " + myInteger);

        // 实例化一个Scanner类的对象(UserInput)
        // 获取用户的键盘输入值作为参数,赋值给对象UserInput，注意值是字符串，不是整数
        Scanner UserInput = new Scanner(System.in);
        // 调用nextInt()方法把用户的字符串输入值转换为整数值，赋予给myInteger
        myInteger = UserInput.nextInt();
        System.out.println("The integer you entered was: " + myInteger);

        // 打印封装在Integer类中的成员变量(常量)SIZE: int的二进制位数(32位)
        // "位"由集成电路(内存)中晶体管的开关状态(0或1)表示
        System.out.println("The number of bits to represent int: " + Integer.SIZE);

        // 打印封装在Integer类中的成员变量(常量)MAX_VALUE，即最大值：2^31 - 1
        // 减1是因为0被归入正数，0占用了一个位，导致最大值减1
        System.out.println("The maximum number of int is: " + Integer.MAX_VALUE);

        // 打印封装在Integer类中的成员变量(常量)MIN_VALUE，即最小值：-2^31
        System.out.println("The minimum number of int is: " + Integer.MIN_VALUE);

        // 试误：报错(整数太大)
        // int myInteger = 2147483648;
        // System.out.println(myInteger);
        // int myInteger = -2147483649;
        // System.out.println(myInteger);
    }
}