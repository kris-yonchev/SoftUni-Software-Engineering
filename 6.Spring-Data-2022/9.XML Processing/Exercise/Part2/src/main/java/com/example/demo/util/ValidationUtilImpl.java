package com.example.demo.util;

import org.springframework.stereotype.Component;

import javax.validation.Validator;

@Component
public class ValidationUtilImpl implements ValidationUtil {

    private final Validator validator;

    public ValidationUtilImpl(Validator validator) {
        this.validator = validator;
    }

    @Override
    public <E> boolean validate(E entity) {
        return validator.validate(entity).isEmpty();
    }
}
