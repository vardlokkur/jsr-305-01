package com.blogspot.vardlokkur.services.impl;

import java.util.List;

import com.blogspot.vardlokkur.entities.domain.Employer;
import com.blogspot.vardlokkur.services.EmployerService;
import com.blogspot.vardlokkur.services.Specification;

/**
 * Default implementation of {@link EmployerService}.
 *
 * @author Warlock
 * @since 1.0
 */
public class DefaultEmployerService implements EmployerService {

    /**
     * {@inheritDoc}
     */
    public Employer withId(Long identifier) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public List<Employer> thatAre(Specification specification) {
        return null;
    }

}
