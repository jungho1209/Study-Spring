package com.example.crud.user.controller;

import com.example.crud.user.domain.dto.request.UserRequest;
import com.example.crud.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;


    // todo 회원가입 기능
    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public void signUp(@RequestBody @Valid UserRequest userRequest){
        userService.signUp(userRequest);
    }


    // todo 회원 삭제 기능
    @DeleteMapping("/{account-id}")
    public void delete(@PathVariable ("account-id") String accountId){
        userService.delete(accountId);
    }

}
