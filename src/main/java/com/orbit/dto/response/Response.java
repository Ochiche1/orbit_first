package com.orbit.dto.response;

import com.orbit.models.auth.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    public String token;
    public String responseMessage;
    public User user;

    public Response(String jwt, String username, String password, List<String> roles) {
    }
}
