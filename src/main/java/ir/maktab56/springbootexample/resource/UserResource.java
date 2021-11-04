package ir.maktab56.springbootexample.resource;

import ir.maktab56.springbootexample.base.web.rest.BaseRestFul;
import ir.maktab56.springbootexample.domain.User;
import ir.maktab56.springbootexample.resource.mapper.UserMapper;
import ir.maktab56.springbootexample.service.UserService;
import ir.maktab56.springbootexample.service.dto.UserDTO;
import ir.maktab56.springbootexample.service.dto.extra.CustomUserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource extends BaseRestFul<User, UserDTO, Long, UserService,
        UserMapper> {

    public UserResource(UserService service, UserMapper mapper) {
        super(service, mapper);
    }

    @PostMapping("/batch")
    public ResponseEntity<Void> batch(@RequestBody List<UserDTO> stringList) {

        System.out.println(stringList.size());

        return ResponseEntity.ok().build();

    }

    @PostMapping("/custom")
    public ResponseEntity<Void> saveCustom(@RequestBody @Valid CustomUserDTO userDTO) {

        return ResponseEntity.ok().build();

    }


}
