package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();
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
