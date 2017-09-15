package com.service;

import com.domain.eneity.User;
import javax.servlet.http.HttpServletRequest;

public interface UserService {
    public User findUserByAccount(String acc);

    public int registerAccount(User user);

    public int loginCheck(User user,HttpServletRequest request);

    public int signInCheck(User user);
}
