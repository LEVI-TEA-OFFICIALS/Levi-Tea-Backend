package com.levitea.backend.dto;


import lombok.Data;

public class UserDto {
    @Data
    public class PostDto {

        private Long id;
        private String username;
        private String password;
        private String name;
        private String email;
        private String phoneNo;
        private Integer rank;
        private String address;
        private String city;
        private String userDiscount;
        private String type;
    }
}
