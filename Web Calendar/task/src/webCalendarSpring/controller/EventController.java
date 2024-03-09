package webCalendarSpring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class EventController {

    @GetMapping("/event/today")
    public ResponseEntity<?> getEvent() {
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }
}
