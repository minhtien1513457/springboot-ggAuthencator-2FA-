package com.vladm.googleauthdemo.repository;

import com.vladm.googleauthdemo.entity.User;
import com.warrenstrange.googleauth.ICredentialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class CredentialRepository implements ICredentialRepository {
    private final UserRepository userRepository;

    @Override
    public String getSecretKey(String email) {
        return userRepository.findByUserName(email).getSecret();
    }

    @Override
    public void saveUserCredentials(String email,
                                    String secretKey,
                                    int validationCode,
                                    List<Integer> scratchCodes) {
        User user = User.builder()
                .userName(email)
                .secret(secretKey)
                .build();
        userRepository.save(user);
    }

    public User getUser(String userName) {
        return userRepository.findByUserName(userName);
    }
}
