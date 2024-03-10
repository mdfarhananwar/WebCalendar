package webCalendarSpring.models;


import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class EventDTO {

    private String message;
    private String event;
    private LocalDate date;

    public EventDTO() {
    }

    public EventDTO(Event events, String message) {
        this.message = message;
        event = events.getEvent();
        date = events.getDate();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "message='" + message + '\'' +
                ", event='" + event + '\'' +
                ", date=" + date +
                '}';
    }
}
