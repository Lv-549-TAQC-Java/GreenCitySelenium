package com.greencity.repository;

import com.greencity.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterModelRepository {
    private RegisterModelRepository() {
    }

    public static RegisterModel getRegisterModel() {
        String password = "1Aaq@3455";
        return RegisterModel.getBuilder()
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .firstName("Yvldol")
                .password(password)
                .repeatPassword(password)
                .build();
    }
}
