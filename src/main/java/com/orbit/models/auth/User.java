package com.orbit.models.auth;


import lombok.*;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private Integer id;

    private String userName;

    private String password;
   private String roles;


}
