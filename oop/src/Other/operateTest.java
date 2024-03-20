package Other;

/**
 * @author sakurasep
 * * @date 2024/1/7
 **/
public class operateTest {
    public static void main(String[] args) {
        // 短路运算符: 当左边的表达式可以得出结果，右边的表达式不会执行
        // && 左边为 false，右边不管是真是假，整个式子一定为 false
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        // || 左边为true， 右边不管是真是假，整个式子一定为 true
        a = 0;
        b = 10;
        result = ++a < 5 || ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------");
        // 三元运算符 关系表达式 ? 表达式1 : 表达式2 关系表达式为True返回表达式1，为False返回表达式2
        int max;
        a = 10;
        b = 20;
        max = a > b ? a : b;
        System.out.println(max);

        // JDK12新的case语句写法
        int number = 10;
        switch (number){
            case 1 -> {
                System.out.println("1");
            }
            case 10 -> {
                System.out.println("success");
            }
            case 100 -> {
                System.out.println("100");
            }
            default -> {
                System.out.println("None");
            }
        }



    }
}
