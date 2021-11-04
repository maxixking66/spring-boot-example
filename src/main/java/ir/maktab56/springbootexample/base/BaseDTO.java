package ir.maktab56.springbootexample.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseDTO<PK extends Serializable> implements Serializable {

    private PK id;

}
