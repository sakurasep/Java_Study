import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sakurasep
 * * @date 2024/3/21
 **/
public class ListTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add("test");
        list.add(123);
        Person person = new Person(10, "xiaohu");
        list.add(person);
        System.out.println(list);

        // add 插入指定索引的元素
        list.add(2, "321");
        System.out.println(list);

        // addAll 插入指定索引的集合
        List list1 = new ArrayList();
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.addAll(1, list);
        System.out.println(list1);

        // remove 元素删除的指定索引的元素
        list1.remove(0);
        list1.remove(0);
        System.out.println(list1);

        // 使用Integer创建对象来删除指定元素
        list1.remove(Integer.valueOf(123));
        System.out.println(list1);

        // get，set 方法
        list.set(0, person);
        System.out.println(list.get(0));


    }

    @Test
    public void test2() {
        List list = new ArrayList();
        for (int i = 0; i < 10; i ++){
            list.add(i);
            list.add(i+1);
        }
        System.out.println(list);
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        System.out.println(list.subList(0, 10));
    }


    
}
