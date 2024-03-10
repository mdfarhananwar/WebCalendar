package webCalendarSpring.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webCalendarSpring.models.Event;
import webCalendarSpring.models.EventDTO;

import java.util.Collections;

@RestController
public class EventController {

    @GetMapping("/event/today")
    public ResponseEntity<?> getEvent() {
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }

    @PostMapping("/event")
    public ResponseEntity<?> postEvent(@RequestBody Event event) {
        if (event.getEvent() == null || event.getDate() == null || event.getEvent().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        String message = "The event has been added!";
        EventDTO eventDTO = new EventDTO(event, message);
        return ResponseEntity.ok(eventDTO);
    }
}
