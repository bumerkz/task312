package ru.korotich.springcourse.service;

import ru.korotich.springcourse.model.User;

import java.util.List;

public interface UserService {
User findById(Long id);
List<User> findAll();
User saveUser(User user);
void deleteById(Long id);
}
