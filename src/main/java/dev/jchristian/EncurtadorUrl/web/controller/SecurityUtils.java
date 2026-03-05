package dev.jchristian.EncurtadorUrl.web.controller;

import dev.jchristian.EncurtadorUrl.domain.Repository.UserRepository;
import dev.jchristian.EncurtadorUrl.domain.entity.UserEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityUtils {

    private final UserRepository userRepository;

    public SecurityUtils(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String email = authentication.getName();
            return userRepository.findByEmail(email).orElse(null);
        }
        return null;
    }

    public Long getCurrentUserId() {
        UserEntity user = getCurrentUser();
        return user != null ? user.getId() : null;
    }
}