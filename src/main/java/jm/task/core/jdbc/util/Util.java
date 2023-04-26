package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String HOST = "jdbc:mysql://localhost:3306/base";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "27153131Bg";
    private static Connection connection;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return connection;
    }


}


//                try {
//                    connection = DriverManager.getConnection(/*здесь стринг адреса вашей базы данных: jdbc:mysql... и так далее*/, /*здесь имя юзера*/, /*здесь пароль*/);
//                } catch (SQLException e) {
//                    System.err.println(e.getMessage());
//                }
//                return connection;


//            if (!connection.isClosed()) {
//                System.out.println("OK");
//            }
//            connection.close();
//            if (connection.isClosed()) {
//                System.out.println("Соединение закрыто");
//            }


//        finally {
//            connection.close();
//        }

