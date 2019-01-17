https://www.cnblogs.com/fingerboy/p/6424248.html
http://www.cnblogs.com/fingerboy/p/6427753.html

1. vim hello.thrift
2. thrift -r --gen java hello.thrift
    生成 gen-java 目录及代码
3. idea 创建pom工程
   vim pom.xml
   cp -r gen-java/tian  src/
   vim src/main/java/tian/pusen/HelloServiceImpl.java
   vim src/main/java/tian/pusen/HelloServerStartup.java
   vim src/main/java/tian/pusen/HelloClientStartup.java
mvn 导入IDE可以正常使用

1. vim hello.thrift  同上
2. thrift -r --gen cpp hello.thrift
3. 编译未通过,需要追踪
