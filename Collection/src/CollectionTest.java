import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * @author sakurasep
 * * @date 2024/3/20
 **/
public class CollectionTest {


    @Test
    public void test1() {
        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();
        collection.add("test");
        collection.add("测试");
        Person person = new Person(10, "xiaohua");
        collection.add(person);
        collection1.addAll(collection);
        collection1.add("123");
        // 方法
        System.out.println(collection);
        System.out.println(collection1);
    }

    @Test
    public void test5() {
        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();
        collection.add("test");
        collection.add("测试");
        Person person = new Person(10, "xiaohua");
        collection.add(person);
        collection1.addAll(collection);
        collection1.add("123");
        // 方法
        collection1.clear();
        System.out.println(collection1.isEmpty());
        System.out.println(collection1.size());
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();
        collection.add("test");
        collection.add("测试");
        Person person = new Person(10, "xiaohua");
        collection.add(person);
        collection1.addAll(collection);
        collection1.add("123");
        // 没有重写 equals 方法 对于对象的比较相当于 ==
        // 注意，String 已经默认重写了 equals
        System.out.println(collection);
        System.out.println(collection1);
        System.out.println(collection.contains(person)); // true
        System.out.println(collection.contains(new Person(10, "xiaohua")));// false
        System.out.println(collection.contains("test")); // true
        // 集合之间的包含关系
        System.out.println(collection.containsAll(collection1)); // false
        System.out.println(collection1.containsAll(collection)); // true

    }
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();
        collection.add("test");
        collection.add("测试");
        Person person = new Person(10, "xiaohua");
        collection.add(person);
        collection1.addAll(collection);
        collection1.add("123");

        System.out.println(collection);
        System.out.println(collection1);
        collection1.removeAll(collection);
        System.out.println(collection1);

        System.out.println("******************");

        collection1.add("test");
        collection1.add("1234");
        System.out.println(collection);
        System.out.println(collection1);
        collection1.retainAll(collection);
        System.out.println(collection1);



    }


    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add("test");
        collection.add("测试");
        collection.add(new Person(10, "xiaohua"));
        //  其他方法
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    @Test
    public void test6() {
        String[] strings = new String[]{"a", "b", "c"};
        Collection collection = Arrays.asList(strings);
        System.out.println(collection);
    }

    @Test
    public void test7() {

    }
}

