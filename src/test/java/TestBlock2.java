import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class TestBlock2 {
    @Test
    public void Test1() {
        List<String> testList = new LinkedList<String>();
        testList.add("aaa");
        testList.add("baa");
        testList.add("caa");
        testList.add("daa");
        testList.add("kaa");
        testList.add("arr");
        testList.add("aad");
        testList.add("ala");
        char a = 'a';
        CollectionsDemo c = new CollectionsDemo();

        int i = c.firstLiteral(testList, a);


        assertEquals(4, i);
    }

    @Test
    public void Test2() {
        Human a1 = new Human("Асаевич", "Оксана", "Владимировна", 50);
        Human a2 = new Human("Раховецкий", "Андрей", "???", 19);
        Human a3 = new Human("Асаевич", "Никита", "Сергеевич", 19);
        Human a4 = new Human("Кутина", "Ирина", "Андреевна", 47);

        List<Human> a = new LinkedList<Human>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        Human b = new Human("Асаевич", "Оксана", "Владимировна", 50);

        List<Human> c = new LinkedList<Human>();

        c.add(a1);
        c.add(a3);
        CollectionsDemo s = new CollectionsDemo();
        assertEquals(c.equals(s.equalsFirstName(a, b)), true);
    }

    @Test
    public void Test3() {
        Human a1 = new Human("Асаевич", "Оксана", "Владимировна", 50);
        Human a2 = new Human("Раховецкий", "Андрей", "???", 19);
        Human a3 = new Human("Асаевич", "Никита", "Сергеевич", 19);
        Human a4 = new Human("Кутина", "Ирина", "Андреевна", 47);

        List<Human> a = new LinkedList<Human>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        Human b = new Human("Асаевич", "Оксана", "Владимировна", 50);

        List<Human> c = new LinkedList<Human>();

        c.add(a2);
        c.add(a3);
        c.add(a4);
        CollectionsDemo s = new CollectionsDemo();

        assertEquals(c.equals(s.deleteHuman(c, b)), true);
    }

    @Test
    public void Test4()
    {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        //set.add(4);
        //set.add(5);
        //set.add(6);
        //set.add(7);
        LinkedList<Set<Integer>> list = new LinkedList<Set<Integer>>();
        Set<Integer> set1 = new TreeSet<>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        //set1.add(44);
        //set1.add(55);
        //set1.add(66);
        //set1.add(77);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(22);
        set2.add(33);
       // set2.add(4);
        //set2.add(55);
        //set2.add(66);
       // set2.add(7);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(2);
        set3.add(22);
        set3.add(5);
        //set3.add(44);
        //set3.add(55);
        //set3.add(66);
       // set3.add(77);

        list.add(set1);
        list.add(set2);
        list.add(set3);

        LinkedList<Set<Integer>> list1 = new LinkedList<Set<Integer>>();
        list1.add(set1);

        CollectionsDemo c = new CollectionsDemo();

        assertEquals(true, list1.equals(c.setList(list, set)));
    }

    @Test
    public void Test5()
    {
        Student student1 = new Student("Абобус", "Иван", "Степанович", "Имит", 39);
        Student student2 = new Student("Амогус", "Василий", "Натальевич", "Фмит", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Student student4 = new Student("Валет", "Король", "Туз", "Теологии", 84);

        CollectionsDemo s = new CollectionsDemo();

        List<Human> a = new LinkedList<Human>();
        a.add(student1);
        a.add(student2);
        a.add(student3);
        a.add(student4);

        Set<Human> set = new HashSet<Human>();
        set.add(student2);
        set.add(student4);

        assertEquals(set.equals(s.maxAgeSet(a)), true);
    }

    @Test
    public void Test6() {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 39);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  84);
        Map<Integer, Human> a1 = new HashMap<Integer, Human>();
        a1.put(1, student1);
        a1.put(2, student2);
        a1.put(3, student3);
        a1.put(4, student4);
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        Set<Human> d = new HashSet<Human>();

        d.add(a1.get(1));
        d.add(a1.get(3));

        CollectionsDemo f = new CollectionsDemo();
        assertEquals(true, f.mapSearchHumans(a1, set).equals(d));
    }

    @Test
    public void Test7() {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 39);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  84);
        Map<Integer, Human> a1 = new HashMap<Integer, Human>();
        a1.put(1, student1);
        a1.put(2, student2);
        a1.put(3, student3);
        a1.put(4, student4);
        Set<Integer> d = new HashSet<Integer>();

        d.add(1);
        d.add(2);
        d.add(4);
        CollectionsDemo f = new CollectionsDemo();
        assertEquals(true, f.List18(a1).equals(d));
    }
    @Test
    public void Test8()
    {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 39);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  84);
        Map<Integer, Human> a1 = new HashMap<Integer, Human>();
        a1.put(1, student1);
        a1.put(2, student2);
        a1.put(3, student3);
        a1.put(4, student4);
        Set<Integer> d = new HashSet<Integer>();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, student1.getAge());
        map.put(2, student2.getAge());
        map.put(3, student3.getAge());
        map.put(4, student4.getAge());

        CollectionsDemo<Human> f = new CollectionsDemo<Human>();

        assertEquals(true, f.listAge(a1).equals(map));
    }

    @Test
    public void Test9()
    {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 39);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  84);
        Set<Human> a = new HashSet<Human>();
        a.add(student1);
        a.add(student2);
        a.add(student3);
        a.add(student4);

        Map<Integer, List<Human>> list = new HashMap<Integer, List<Human>>();
        List<Human> l = new LinkedList<Human>();
        l.add(student2);
        l.add(student4);
        int age = 84;
        list.put(age, l);
        CollectionsDemo<Human> f = new CollectionsDemo<Human>();


        assertEquals(true, f.mapList(a, age).equals(list));
    }
    @Test
    public void Test10()
    {
        Human a1 = new Human("Асаевич", "Оксана", "Владимировна", 50);
        Human a2 = new Human("Асаевич", "Андрей", "???", 19);
        Human a3 = new Human("Асаевич", "Никита", "Сергеевич", 19);
        Human a4 = new Human("Асаевич", "Ирина", "Андреевна", 47);

        List<Human> a = new LinkedList<Human>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        Human b = new Human("Асаевич", "Оксана", "Владимировна", 50);

        List<Human> c = new LinkedList<Human>();

        CollectionsDemo s = new CollectionsDemo();

        assertEquals(c.equals(s.deleteHuman(c, b)), true);
    }

    @Test
    public void Test11() {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 3);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 8);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  8);
        Map<Integer, Human> a1 = new HashMap<Integer, Human>();
        a1.put(1, student1);
        a1.put(2, student2);
        a1.put(3, student3);
        a1.put(4, student4);
        Set<Integer> d = new HashSet<Integer>();
        CollectionsDemo f = new CollectionsDemo();
        assertEquals(true, f.List18(a1).equals(d));
    }

    @Test
    public void Test12()
    {
        Human student1 = new Human("Абобус", "Иван", "Степанович", 39);
        Human student2 = new Human("Амогус", "Василий", "Натальевич", 84);
        Human student3 = new Human("Вольский", "Наталья", "Сергеевич", 3);
        Human student4 = new Human("Валет", "Король", "Туз",  84);
        Set<Human> a = new HashSet<Human>();
        a.add(student1);
        a.add(student2);
        a.add(student3);
        a.add(student4);

        Map<Integer, List<Human>> list = new HashMap<Integer, List<Human>>();
        List<Human> l = new LinkedList<Human>();
        int age = 83;
        list.put(age, l);
        CollectionsDemo<Human> f = new CollectionsDemo<Human>();


        assertEquals(true, f.mapList(a, age).equals(list));
    }
}
