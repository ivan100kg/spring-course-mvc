package io.github.ivan100kg.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }
    @Override
    public boolean isValid(String entered, ConstraintValidatorContext constraintValidatorContext) {
        return entered.endsWith(endOfEmail);
    }
}
