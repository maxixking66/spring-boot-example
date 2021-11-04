package ir.maktab56.springbootexample.service.impl;

import ir.maktab56.springbootexample.base.service.impl.BaseServiceImpl;
import ir.maktab56.springbootexample.domain.User;
import ir.maktab56.springbootexample.exception.AccessDeniedRunTimeException;
import ir.maktab56.springbootexample.repository.UserRepository;
import ir.maktab56.springbootexample.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements
        UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    @Transactional
    public User saveNotSecure(User user) {
        return super.saveNotSecure(user);
    }

    @Override
    @Transactional
    public List<User> saveAllNotSecure(Collection<User> collection) {
        return super.saveAllNotSecure(collection);
    }

    @Override
    public void deleteByIdNotSecure(Long id) {
        throw new AccessDeniedRunTimeException(
                "can't delete entity with id: " + id
        );
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return repository.getUserByUsername(username);
    }
}
