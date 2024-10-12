package com.sst.bookmyshowsst.repositories;

import com.sst.bookmyshowsst.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Select * from users where email = email;
    // optional used to avoid null pointer exception.
    Optional<User> findByEmail(String email);

    @Override
    User save(User user);
}
