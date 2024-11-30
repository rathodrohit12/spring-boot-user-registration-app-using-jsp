package com.rohit.springbootdemo.service;

import com.rohit.springbootdemo.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.springbootdemo.model.User;
import com.rohit.springbootdemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }



    public UserEntity convertToEntity(User user) {

        return modelMapper.map(user, UserEntity.class);
    }





    public void registerService(User user) {
        UserEntity userEntity = convertToEntity(user);
        userRepository.save(userEntity);
        //userRepository.save(user);
    }

    @Override
    public boolean loginService(String email, String pass) {
        UserEntity userEntity = userRepository.findByEmail(email);
        if (userEntity == null) {
            return false;
        }
        return pass.equals(userEntity.getPass());
    }


    public User convertToDto(UserEntity userEntity) {
        return modelMapper.map(userEntity, User.class);
    }
}
