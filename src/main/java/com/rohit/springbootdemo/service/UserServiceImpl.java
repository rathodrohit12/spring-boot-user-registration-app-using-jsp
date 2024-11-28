package com.rohit.springbootdemo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.springbootdemo.model.UserDto;
import com.rohit.springbootdemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final ModelMapper modelMapper;

    public UserServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDto convertToDto(UserDto user) {
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto convertToEntity(UserDto userDto) {
        return modelMapper.map(userDto, UserDto.class);
    }





    public void registerService(UserDto user) {
        userRepository.save(user);
    }

    @Override
    public boolean loginService(String email, String pass) {
        UserDto user = userRepository.findByEmail(email);
        if (user == null) {
            return false;
        }
        return pass.equals(user.getPass());
    }
}
