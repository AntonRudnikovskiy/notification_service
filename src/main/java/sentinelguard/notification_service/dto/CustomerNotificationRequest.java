package sentinelguard.notification_service.dto;

import java.time.LocalDateTime;

public record CustomerNotificationRequest(
        String message,
        String sender,
        LocalDateTime sendAt,
        String customerEmail,
        long customerId) {
}
