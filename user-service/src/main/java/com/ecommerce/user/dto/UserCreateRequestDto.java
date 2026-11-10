package com.ecommerce.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequestDto {

    @NotBlank(message = "Name Required")
    private String name;
    @NotBlank(message = "Valid Email Required")
    private String email;
    @NotBlank(message = "Password Required")
    @Size(min = 6, message = "password must be atleast 6 characters")
    private String password;
    private String Phone;

}
