package dio.minhaprimeirawebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.minhaprimeirawebapi.model.User;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user == null)
            System.out.println("Save - Recebendo o usuário na camada Repository.");
        else
            System.out.println("Update - Recebendo o usuário na camada Repository.");

        System.out.println(user);
    }

    public void delete(Integer id) {
        System.out.println("DELETE/id - Recebendo o id: " + id + " para excluir um usuário.");
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<User> users = new ArrayList<>();
        users.add(new User("Douglas", "123"));
        users.add(new User("Maria", "123"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println("FIND/id - Recebendo o id: " + id + " para localizar um usuário.");
        return new User("Douglas", "123");
    }

    public User findUserName(String username) {
        System.out.println("FIND/username - Recebendo o nomedo usuário: " + username + " para localizar um usuário.");
        return new User("Maria", "123");
    }

}