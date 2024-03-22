import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author sakurasep
 * * @date 2024/3/21
 **/
public class IteratorTest {

    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("test");
        collection.add("测试");
        Person person = new Person(10, "xiaohua");
        collection.add(person);

        // 获取迭代器对象
        System.out.println(collection);
        Iterator iterator = collection.iterator();
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//        }

        // hasNext
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("*************************************************");

        // 增强 for 循环
        for (Object obj : collection) {
            System.out.println(obj);
        }

    }

    @Test
    public void test2() {

    }
}
