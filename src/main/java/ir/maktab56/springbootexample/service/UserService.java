package ir.maktab56.springbootexample.service;

import ir.maktab56.springbootexample.base.service.BaseService;
import ir.maktab56.springbootexample.domain.User;

import java.util.Optional;

public interface UserService extends BaseService<User, Long> {

    Optional<User> getUserByUsername(String username);

}
