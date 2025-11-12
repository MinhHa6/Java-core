package core.oop.inherritance;

import core.oop.User;

// 1interface co the extends nhieu interface khac
public interface UserService extends BaseService,LogService{
    int addUser(User user);
    void updateUser( User userId);
    void deleteUser(Long userId);
}
