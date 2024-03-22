import org.junit.Test;

import java.util.*;

/**
 * @author sakurasep
 * * @date 2024/3/22
 **/
public class SetTest {
    @Test
    public void test() {
        // HashSet 是主要实现类
        Set set = new HashSet();
        Person person = new Person(10,"xiaohua");
        set.add("test");
        set.add(123);
        set.add(person);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1() {
        // LinkedHashSet 实现了记录添加元素的顺序，方便进行遍历
        Set set = new LinkedHashSet();
        Person person = new Person(10,"xiaohua");
        set.add("test");
        set.add(123);
        set.add(person);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Set set = new HashSet();
        set.add("test");
        set.add(123);
        set.add(new Person(10,"xiaohua"));
        set.add(new Person(10,"xiaohua"));

        System.out.println(set);
    }

    @Test
    public void test3() {
        Set set = new TreeSet();

        set.add("BB");
        set.add("AA");
        set.add("GG");
        set.add("ZZ");
        set.add("YY");

        System.out.println(set);


    }

    @Test
    public void test4() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    int value = p1.getName().compareTo(p2.getName());
                    if (value != 0) {
                        return value;
                    }
                    else {
                        return p1.getAge() - p2.getAge();
                    }
                }
            throw new RuntimeException("数据类型不匹配");
            }
        };


        Set set = new TreeSet(comparator);

        Person p1 = new Person(10,"A1");
        Person p2 = new Person(13,"A1");
        Person p3 = new Person(10,"B");
        Person p4 = new Person(13,"C");
        Person p5 = new Person(13,"D");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (Object o : set) {
            System.out.println(o);
        }


    }

    @Test
    public void test5() {
        List list = new ArrayList();

        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);

        System.out.println(list);

        System.out.println(duplicateList(list));


    }

    public static List duplicateList(List list){
        Set set = new LinkedHashSet(list);
        List new_list = new ArrayList(set);
        return new_list;
    }

    @Test
    public void test7() {
        Set set = new HashSet();
        while (set.size() < 10) {
            int randomNumber = (int)(Math.random() * 20) + 1;
            set.add(randomNumber);
        }
        System.out.println(set);
    }

}
