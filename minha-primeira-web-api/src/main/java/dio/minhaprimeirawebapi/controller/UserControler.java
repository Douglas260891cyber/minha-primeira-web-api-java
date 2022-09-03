package dio.minhaprimeirawebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.minhaprimeirawebapi.model.User;
import dio.minhaprimeirawebapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserControler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable(name = "username", required = false) String username) {
        return userRepository.findUserName(username);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable(name = "id", required = false) Integer id) {
        return userRepository.findById(id);
    }

    //RequestBody converte o JSON para o objeto conforme o contrato
    @PostMapping()
    public void postUser(@RequestBody User user) {
        userRepository.save(user);
    }

}