package ir.maktab56.springbootexample.service.dto.extra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomUserDTO implements Serializable {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

}
