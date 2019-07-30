package com.employee.crud.service;

import com.employee.crud.data.UserData;
import com.employee.crud.entity.User;
import com.employee.crud.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private List<User> userData = UserData.userData();

    public List<User> getAllUser() {
        return userData;
    }

    public void addUser(User user) {

        userData.add(user);
    }

    public void updateUserById(int userId, User user) throws BusinessException {
        User userInfo = getUserById(userId);
        userInfo.setName(user.getName());
        userInfo.setAge(user.getAge());
        userInfo.setGender(user.getGender());
        save(userInfo);
    }

    public void deleteUserById(int userId) throws BusinessException {
        deleteById(userId);
    }

    private User getUserById(int userId) throws BusinessException {
        return userData.stream()
                .filter(item -> item.getId() == userId)
                .findFirst()
                .orElseThrow(() -> new BusinessException(
                        String.format("Unknown User with id: %s", userId)
                ));
    }

    private void save(User userInfo) {
        int index = 0;
        for(int i = 0; i<userData.size(); i++){
            if(userData.get(i).getId() == userInfo.getId()){
                index = i;
            }
        }
        userData.set(index, userInfo);
    }

    private void deleteById(int userId) throws BusinessException {
        User user = getUserById(userId);
        userData.remove(user);
    }
}
