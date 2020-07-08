# java集合概述
- java集合类存放在java5.util包中，是一个用来存放对象的容器。
1. 集合只能存放对象，比如你存一个int型数据1放入集合中，其实它是自动转换成integer 类后存入的，java中
每一种基本类型都有对应的引用类型。
2. 集合存放的是多个对象的引用，对象本身还是存放在堆内存中。
3. 集合可以存放不同类型，不限数量的数据类型。
- Java集合可分为Set, List,和Map三种大体系
1. Set: 无序， 不可重复的集合
2. List: 有序，可重复的集合
3. Map: 具有映射关系的集合
**在JDK5之后，增加了泛型，Java集合可以记住容器中对象的数据类型**
## HashSet
- HashSet是Set 接口的典型实现，大多数时候使用Set集合时都使用这个实现类，我们大多数时候说的Set集合指的都是HashSet
- HashSet 按Hash算法来存储集合中的元素，因此具有很好的存取和查找性能。
- HashSet 具有以下特点：
1. 不能保证元素的排列顺序
2. **不可重复**  - hashCode 不同
3. **HashSet不是线程安全的**
4. 集合元素可以使null

- 当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，然后根据hashCode值决定该对象在HashSet中的存储位置
- 如果两个元素的equals()方法返回true，但它们的hashCode()返回值不相等，hashSet将会把它们存储在不同的位置，但依然可以添加成功。

- HashSet类实现了Set接口继承了Collection接口

## 自然排序
1. 排序： TreeSet 会调用集合元素的compareTo(Object obj)方法来比较元素之间的大小关系，
然后将集合元素按升序排列
- 如果this>obj, 返回正数1
- 如果this<obj, 返回负数-1
- 如果this = obj, 返回0, 则认为这两个对象相等
2. **必须放入同样类的对象(默认会进行排序)否则可能会发生类型转换异常，我们可以使用泛型来
进行限制**

## List与ArrayList
- List代表一个有序，且可重复的集合，集合中的每个元素都有其对应的顺序索引
- **List允许使用重复元素，可以通过索引来访问指定位置的集合元素** 类似数组
- List默认按元素的添加顺序设置元素的索引
- List集合里添加了一些根据索引来操作集合元素的方法

- Arraylist类实现List接口继承Collection接口
- Arraylist线程不安全，Vector 线程安全

## Map集合
- Map 用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组值用于保存Map里的Key
，另外一组用于保存Map里的Value。
- Map中的key和value都可以是任何引用类型的数据
- **Map中的key不允许重复，即同一个Map对象的任何两个Key通过equals方法比较中返回false**
- Key和value之间存在单向一对一关系，即通过指定的Key总能找到唯一的，确定的Value.

## 操作集合的工具类:Collections
- Collections 是一个操作Set,List和Map等集合的工具类
- Collections 中提供了大量的方法对集合元素进行排序,查询和修改等操作,还提供了对集合对象设置不可变,对集合对象实现同步控制等方法. 

## 同步控制
- **Collections 类中提供了多个synchronizedXxx()方法,该方法可使将指定集合包装成线程同步的集合,从而可以解决多线程并发访问集合时的线程安全问题**