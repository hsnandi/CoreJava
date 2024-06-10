package com.interfaces.valid;

import com.interfaces.Validator;

public class Valid implements Validator {
    @Override
    public boolean isValid(String property) {
        return (property.length() > 0);
    }
}
