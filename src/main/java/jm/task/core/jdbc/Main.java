package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;



public class Main {
    public static void main(String[] args) {
        UserService usi = new UserServiceImpl();
        usi.createUsersTable();
        usi.saveUser("Malik", "Tregulovjunior", (byte) 25);
        usi.saveUser("Erik", "Tregulovsenior", (byte) 31);
        usi.saveUser("Oly", "Vredina", (byte) 28);
        usi.saveUser("Ivan", "Milfochka", (byte) 25);

        System.out.println(usi.getAllUsers());

        usi.cleanUsersTable();
        usi.dropUsersTable();
    }
}
