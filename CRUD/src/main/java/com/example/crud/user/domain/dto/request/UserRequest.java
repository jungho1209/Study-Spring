package com.example.crud.user.domain.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "id 에는 공백이 없어야 합니다.")
    private String accountId;

    @NotBlank(message = "password 에는 공백이 없어야 합니다.")
    private String password;

    private Long studentId;

}
