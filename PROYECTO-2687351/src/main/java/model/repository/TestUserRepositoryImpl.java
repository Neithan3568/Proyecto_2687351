package model.repository;

import model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {

        public static void main(String[] args) throws SQLException {
            Repository<User> repository = new UserRepositoryImpl();

            System.out.println("============= save Obj Insert ============");
            User userInsert = new User();
            userInsert.setUser_firstname("carlos");
            userInsert.setUser_lastname("rojas");
            userInsert.setUser_email("carlos@LoQueSea.com");
            userInsert.setUser_password("asdfg12345");
            repository.saveObj(userInsert);
            userInsert.setUser_firstname("pEpE");
            userInsert.setUser_lastname("perez");
            userInsert.setUser_email("PEPE@correo.com");
            userInsert.setUser_password("67890qwerty");
            repository.saveObj(userInsert);

            System.out.println("============= listAllObj ============");
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("============= byIdObj ============");
            System.out.println(repository.byIdObj(1));
            System.out.println();

            System.out.println("============= saveObj ============");
            User userUpdate = new User();
            userInsert.setUser_id(2);
            userInsert.setUser_firstname("jorge");
            userInsert.setUser_lastname("palacios");
            userInsert.setUser_email("jorge@example.com");
            userInsert.setUser_password("12345asdfg");
            repository.saveObj(userInsert);
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("============= deleteObj ============");
            repository.deleteObj(2);
            repository.listAllObj().forEach(System.out::println);
        }
    }
    
