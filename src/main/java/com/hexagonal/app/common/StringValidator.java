package com.hexagonal.app.common;

import java.util.Arrays;
import java.util.Iterator;
import org.springframework.util.ObjectUtils;

public class StringValidator {
    public static void stringBlankCheck(String...args) {
        Iterator<String> iterator = Arrays.stream(args).iterator();
        while(iterator.hasNext()) {
            String value = iterator.next();
            if(ObjectUtils.isEmpty(value)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
