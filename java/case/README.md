# 说明
这是极客时间课程 <<Java 业务开发常见错误100例>> 的学习笔记  
项目地址: https://time.geekbang.org/column/intro/294

# 正文
## 关于线程安全
### 知识点
- tomcat 工作线程基于线程池, 线程池会重用固定的几个线程
- ThreadLocal
- ForkJoinPool
- ConcurrentHashMap 
- CopyOnWrite & CopyOnWriteArrayList

### 代码模拟
com.example.javademo.threadsafe

### 总结
1. 多线程共享变量的使用需要格外小心, 如果要避免使用其他线程存储的结果, 需要在逻辑执行完毕后对共享变量执行清理工作
2. 像 ConcurrentHashMap 也不是线程安全的, 执行多线程操作时需要加锁
3. 需要熟悉工具类库的特性, 类库有自己的使用限制和场景, 正确的使用才能发挥类库的优势.


## 需要补充的知识点
- java 并发编程