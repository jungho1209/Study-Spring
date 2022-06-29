package com.example.crud.user.service;

import com.example.crud.user.domain.User;
import com.example.crud.user.domain.dto.request.UserRequest;
import com.example.crud.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    // todo 회원가입 기능
    @Transactional
    public void signUp(UserRequest userRequest) {

        if (userRepository.findByAccountId(userRequest.getAccountId()).isPresent()) {
            throw new RuntimeException("이미 존재하는 id 입니다.");
        }

        User user = User.builder()
                .accountId(userRequest.getAccountId())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .studentId(userRequest.getStudentId())
                .build();
        userRepository.save(user);

    }
}
