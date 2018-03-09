package com.c2t.testng.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameterTest {
	@Parameters({ "optional-value" })
    @Test
    public void optionTest(@Optional("This value if not passed..") String value) {
        System.out.println("This is: " + value);
    }
}