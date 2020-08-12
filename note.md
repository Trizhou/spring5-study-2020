##常用依赖
```xml
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.7.RELEASE</version>
    </dependency>
```

##注解说明
- @Autowired : 自动装配。通过类型、名字
- @Resource : 自动装配。通过名字，类型


- @Component : 放在类上，说明这个类被spring管理了，就是bean