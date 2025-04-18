package org.example.monitorsensors.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Range {
    @Min(0)
    private Integer from_value;

    @Min(0)
    private Integer to_value;

    @AssertTrue(message = "The 'to' value must be greater than 'from' value.")
    public boolean isValidRange() {
        return from_value != null && to_value != null && to_value > from_value;
    }
}
