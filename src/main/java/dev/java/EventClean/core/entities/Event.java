package dev.java.EventClean.core.entities;

import dev.java.EventClean.core.enums.TypeEvent;
import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String identify,
        String local,
        String capacity,
        String organizer,
        TypeEvent typeEvent
) {
}
