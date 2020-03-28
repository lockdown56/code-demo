# 说明
这是极客时间课程 <<Java 业务开发常见错误100例>> 的学习笔记  
项目地址: https://time.geekbang.org/column/intro/294

# 正文
## 关于线程安全
### 知识点
- tomcat 工作线程基于线程池, 线程池会重用固定的几个线程
- ThreadLocal
- ConcurrentHashMap 
- CopyOnWrite & CopyOnWriteArrayList

### 代码模拟
com.example.javademo.threadsafe