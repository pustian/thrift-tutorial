https://www.cnblogs.com/fingerboy/p/6424248.html
http://www.cnblogs.com/fingerboy/p/6427753.html
https://www.jianshu.com/p/0f4113d6ec4b

1. vim helloworld.thrift
2. thrift -r -gen java helloworld.thrift
    生成 gen-java 目录及代码
3. idea 创建pom工程
   vim pom.xml
   cp -r gen-java/tian  src/
   vim src/main/java/tian/pusen/HelloServiceImpl.java
   vim src/main/java/tian/pusen/HelloServerStartup.java
   vim src/main/java/tian/pusen/HelloClientStartup.java
正常使用

 g++ -g -Ithrift -L -lthrif Hello_server.skeleton.cpp
