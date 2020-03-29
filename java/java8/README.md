# Lambda 
## 参考地址
https://objcoding.com/2019/03/04/lambda/#remove
## 概念
lambda 是函数式接口的实现
## 省略写法
1. 小括号内参数的类型可以省略
2. 如果只有一个参数, 小括号可以省略
3. 如果函数体只有一个语句, 则无论是否有返回值, 都可以省略大括号, return 关键字及语句分号

# Stream
## 继承关系
BaseStream -> (IntStream, LongStream, DoubleStream, Stream)
## 特性
- 无存储. stream 不是一种数据结构, 他只是某种数据源的一个视图
- 为函数式编程而生. 对 stream 的任何修改都不会修改背后的数据源.
- 惰式执行. stream 上吃操作并不会立即执行, 只有等到用户真正需要结果的时候才执行
- 可消费性. stream 只能被消费一次, 一旦遍历过就会失效, 就像容器的迭代器一样, 想要再次遍历必须重新生成

## reduce
### 定义
- Optional<T> reduce(BinaryOperator<T> accumulator)
- T reduce(T identity, BinaryOperator<T> accumulator)
- \<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator\<U> combiner)

## collect
### 定义
- \<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
- \<R, A> R collect(Collector<? sukper T, A, R> collector)
