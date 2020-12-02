package com.greencity.datamodel;


public class RegisterModel {
    private String firstName;
    private String email;
    private String password;
    private String repeatPassword;

    RegisterModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public static RegisterModel.Builder getBuilder() {
        return new RegisterModel().new Builder();
    }

    public class Builder {
        public RegisterModel.Builder email(String value) {
            email = value;
            return this;
        }

        public RegisterModel.Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public RegisterModel.Builder password(String value) {
            password = value;
            return this;
        }

        public RegisterModel.Builder repeatPassword(String value) {
            repeatPassword = value;
            return this;
        }

        public RegisterModel build() {
            return RegisterModel.this;
        }
    }
}
