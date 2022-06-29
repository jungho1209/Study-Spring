package com.example.crud.user.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {

    private final String accountId;
    private final String password;
    private final Long studentId;

}
