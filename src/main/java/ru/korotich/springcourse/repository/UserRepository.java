package ru.korotich.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.korotich.springcourse.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
