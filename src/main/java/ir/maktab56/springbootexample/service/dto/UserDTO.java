package ir.maktab56.springbootexample.service.dto;

import ir.maktab56.springbootexample.base.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseDTO<Long> {

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private Boolean isActive;
}
