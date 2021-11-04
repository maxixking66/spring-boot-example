package ir.maktab56.springbootexample.domain;

import ir.maktab56.springbootexample.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = User.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity<Long> {

    public static final String TABLE_NAME = "user_table";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String FIRSTNAME = "firstname";
    public static final String LASTNAME = "lastname";
    public static final String IS_ACTIVE = "is_active";

    @Column(name = USERNAME)
    private String username;

    @Column(name = PASSWORD)
    private String password;

    @Column(name = FIRSTNAME)
    private String firstName;

    @Column(name = LASTNAME)
    private String lastName;

    @Column(name = IS_ACTIVE)
    private Boolean isActive;
}
