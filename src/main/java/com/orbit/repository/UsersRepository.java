//package com.orbit.repository;
//
//import com.orbit.dto.request.SignupRequest;
//import com.orbit.models.auth.User;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Repository;
//
//@RequiredArgsConstructor
//@Repository
//public class UsersRepository implements UsersRepositoryService{
//    private final JdbcTemplate jdbcTemplate;
//    private final PasswordEncoder passwordEncoder;
//    private final ModelMapper modelMapper;
//    @Override
//    public int addNewUser(SignupRequest signUpRequest) {
//        User userInfo = modelMapper.map(signUpRequest, User.class);
//        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
//        return jdbcTemplate.update("INSERT INTO Users (username, password) VALUES(?,?)",
//            userInfo.getUserName(), userInfo.getPassword());
//    }
//
//    @Override
//    public User findByUserName(String userName) {
//
//        return (User) jdbcTemplate.query("SELECT * from users WHERE username=?",
//            BeanPropertyRowMapper.newInstance(User.class), userName);
//    }
//
//   // @Override
////    public Users findByUsername(String username) {
////        Query q = jdbcTemplate.query("SELECT * from users WHERE username=?",
////            BeanPropertyRowMapper.newInstance(Users.class), username);
////        return (Users)q.getSingleResult();
////    }
//
//
//}
