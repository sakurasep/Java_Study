import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author sakurasep
 * * @date 2024/3/21
 **/
public class StringTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int max = 122 - 97 + 1;
            int number = (int) (Math.random() * max + 97);
            list.add((char)number + "");
        }
        System.out.println(list);
        int aCount = listTest1(list, "a");
        int bCount = listTest1(list, "b");
        int cCount = listTest1(list, "c");
        int xCount = listTest1(list, "x");
        System.out.printf("%d %d %d %d\n", aCount, bCount, cCount, xCount);

    }
    // 迭代器
    public static int listTest2(Collection list,  String s) {
        int count = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String c = String.valueOf(iterator.next());
            if(c.equals(s)){
                count++;
            }
        }
        return count;
    }

    // 增强 for 循环
    public static int listTest1(Collection list, String s) {
        int count = 0;
        for (Object obj : list) {
            String c = String.valueOf(obj);
            if (c.equals(s)) {
                count++;
            }
        }
        return count;
    }
}
