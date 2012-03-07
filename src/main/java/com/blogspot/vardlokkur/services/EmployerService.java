package com.blogspot.vardlokkur.services;

import java.util.List;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import com.blogspot.vardlokkur.entities.domain.Employer;

/**
 * Defines the API contract for the employer service.
 *
 * @author Warlock
 * @since 1.0
 */
public interface EmployerService {

    /**
     * @param identifier the employer's identifier
     * @return the employer having specified {@code identifier}, {@code null} if not found
     */
    @CheckForNull Employer withId(@Nonnull Long identifier);

    /**
     * @param specification defines which employers should be returned
     * @return the list of employers matching specification
     */
    @Nonnull List<Employer> thatAre(@Nonnull Specification specification);

}
