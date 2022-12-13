package dev.fmagallanes97.backendportfolio.dto;

import java.time.LocalDate;

public record EducationResponse(
        Long id,
        String degree,
        String school,
        String academicField,
        LocalDate startDate,
        LocalDate endDate
) {
}