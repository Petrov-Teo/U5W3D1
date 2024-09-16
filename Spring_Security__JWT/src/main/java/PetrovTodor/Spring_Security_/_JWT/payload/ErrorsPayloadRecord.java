package PetrovTodor.Spring_Security_._JWT.payload;

import java.time.LocalDateTime;

public record ErrorsPayloadRecord(String message, LocalDateTime timeStamp) {
}
