package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@Builder
@EqualsAndHashCode
@ToString
public class LoginModel {

    private String email;
    private String password;
}
