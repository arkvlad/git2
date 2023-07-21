package jm.task.core.jdbc;

import com.mysql.cj.jdbc.Driver;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

         final String testName = "Ivan";
         final String testLastName = "Ivanov";
         final byte testAge = 5;


        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);
        userService.saveUser(testName, testLastName, testAge);

        userService.cleanUsersTable();

        userService.getAllUsers().forEach(System.out::println);
        if (userService.getAllUsers().size() != 0) {
            System.out.println("Метод очищения таблицы пользователей реализован не корректно");
        }

    }
}


        /*
//        Создание таблицы User(ов)
        userService.createUsersTable();

//        Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
        userService.saveUser("Egor", "Ivanov", (byte) 30);
        userService.saveUser("Sidor", "Rodionov", (byte) 28);
        userService.saveUser("Pidor", "Orehov", (byte) 29);
        userService.saveUser("Larion", "Jukov", (byte) 17);

//        Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        userService.getAllUsers().forEach(System.out::println);

//        Очистка таблицы User(ов)
        userService.cleanUsersTable();

//        Удаление таблицы
        userService.dropUsersTable();

    }
}


         */