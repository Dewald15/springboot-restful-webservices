package net.javaguides.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "User first name should not be empty")
    private String firstName;
    @NotEmpty(message = "User last name should not be empty")
    private String lastName;
    @NotEmpty(message = "User email should not be empty")
    @Email(message = "Email address should be valid")
    private String email;
}
