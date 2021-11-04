package ir.maktab56.springbootexample.service.dto.extra;

import ir.maktab56.springbootexample.base.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserBriefDTO extends BaseDTO<Long> {

    private String firstName;

    private String lastName;

}
