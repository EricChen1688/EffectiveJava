package com.eric.example.example1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Chen 2018/2/23
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        ServiceManager.registerProvider(new CardProvider());
//        ServiceManager.registerProvider("niubi",new PhoneProvider());
//        Service service1 = ServiceManager.getService();
//        Service service = ServiceManager.getService("niubi");
//        service.in();
//        service.out();
//        service1.in();
//        service1.out();
//        Class.forName("com.eric.example.example1.PhoneProvider"); //静态方法去注册
//        Service phone = ServiceManager.getService("phone");
//        phone.in();
//        phone.out();
        /**
         * Mysql中的服务注册就是用的服务提供者框架
         */
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
    }
}
