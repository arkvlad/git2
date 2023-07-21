package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.List;

public class UserServiceImpl implements UserService {


    @Override
    public void createUsersTable() {
        new UserDaoHibernateImpl().createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        new UserDaoHibernateImpl().dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        new UserDaoHibernateImpl().saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        new UserDaoHibernateImpl().removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new UserDaoHibernateImpl().getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        new UserDaoHibernateImpl().cleanUsersTable();
    }
}


/*
    public void createUsersTable() {
        new UserDaoJDBCaaaaaaaaaaaaaaaaaaaaImpl().createUsersTable();
    }

    public void dropUsersTable() {
        new UserDaoJDBCImpl().dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        new UserDaoJDBCImpl().saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        new UserDaoJDBCImpl().removeUserById(id);
    }

    public List<User> getAllUsers() {
        return new UserDaoJDBCImpl().getAllUsers();
    }

    public void cleanUsersTable() {
        new UserDaoJDBCImpl().cleanUsersTable();
    }
}

 */
