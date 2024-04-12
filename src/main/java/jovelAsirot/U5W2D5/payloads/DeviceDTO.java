package jovelAsirot.U5W2D5.payloads;

import jakarta.validation.constraints.NotEmpty;


public record DeviceDTO(@NotEmpty(message = "The type is required")
                        String type,
                        String status,
                        Long employeeId
) {
}
