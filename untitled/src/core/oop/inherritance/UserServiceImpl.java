package core.oop.inherritance;

import core.oop.User;

// 1 class co the implement nhien interface
public class UserServiceImpl implements UserService,BaseService {
    @Override
    public int addUser(User user)
    {
        System.out.println("------[addUser]--------");
        return 0;
    }

    @Override
    public void updateUser(User userId) {
        System.out.println("update");
    }

    @Override
    public void deleteUser(Long userId) {

        System.out.println("deleteUser");
    }

    @Override
    public void saveLog() {

        System.out.println("saveLog");
    }

    @Override
    public void printLog() {

        System.out.println("In log");
    }
}
