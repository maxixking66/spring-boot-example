package ir.maktab56.springbootexample.resource.mapper;

import ir.maktab56.springbootexample.base.mapper.BaseMapper;
import ir.maktab56.springbootexample.domain.User;
import ir.maktab56.springbootexample.service.dto.UserDTO;
import ir.maktab56.springbootexample.service.dto.extra.UserBriefDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDTO> {

    List<UserBriefDTO> convertListEntityToUserBrief(List<User> users);

    UserBriefDTO convertEntityToUserBrief(User user);

}