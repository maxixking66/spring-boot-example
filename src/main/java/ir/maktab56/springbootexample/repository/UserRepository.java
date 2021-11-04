package ir.maktab56.springbootexample.repository;

import ir.maktab56.springbootexample.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    Optional<User> getUserByUsername(String username);

    <P> P getUserByUsername(String username, Class<P> clazz);

}
