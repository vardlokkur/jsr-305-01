package com.blogspot.vardlokkur.test;

import org.junit.Before;
import org.junit.Test;

import com.blogspot.vardlokkur.services.EmployerService;
import com.blogspot.vardlokkur.services.impl.DefaultEmployerService;

/**
 * Employer service test.
 *
 * @author Warlock
 * @since 1.0
 */
public class EmployerServiceTest {

    private EmployerService employers;

    @Before
    public void before() {
        employers = new DefaultEmployerService();
    }

    @Test
    public void test01() {
        Long identifier = null;
        employers.withId(identifier);
    }

    @Test
    public void test02() {
        employers.withId(Long.valueOf(1L)).getBusinessName();
    }

    @Test
    public void test03() {
        employers.thatAre(null);
    }
}
