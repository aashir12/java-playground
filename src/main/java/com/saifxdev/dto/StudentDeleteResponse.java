package com.saifxdev.dto;
package com.saifxdev.dto;

import java.util.List;
import java.util.Set;

public record StudentDeleteResponse(
        String message,
        Long id,
        String name,
        String rollNumber,
        Set<String> subjects,
        List<Boolean> weeklyAttendance
) {
}
