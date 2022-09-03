package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


    @Data
    @Builder
    @EqualsAndHashCode
    @ToString
    public class RegistrationModel {

        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String phoneNumber;
    }
