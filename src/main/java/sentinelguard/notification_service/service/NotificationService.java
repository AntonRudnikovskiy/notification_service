package sentinelguard.notification_service.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sentinelguard.notification_service.dto.CustomerNotificationRequest;
import sentinelguard.notification_service.entity.Notification;
import sentinelguard.notification_service.repository.NotificationRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {
    private final NotificationRepository notificationRepository;
    public void saveNotification(CustomerNotificationRequest request) {
        Notification notification = Notification.builder()
                .message(request.message())
                .sender(request.sender())
                .sendAt(request.sendAt())
                .customerEmail(request.customerEmail())
                .customerId(request.customerId())
                .build();
        notificationRepository.save(notification);
        log.info("new notification was saved {}", notification);
    }
}
