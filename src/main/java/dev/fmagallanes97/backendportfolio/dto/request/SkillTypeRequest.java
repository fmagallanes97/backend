package dev.fmagallanes97.backendportfolio.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public record SkillTypeRequest(
        @Size(min = 4, max = 45, message = "this value must be between 4 and 45 characters")
        @NotEmpty(message = "this attribute is mandatory")
        String name
) {
}
