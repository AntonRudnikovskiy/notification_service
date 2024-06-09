package sentinelguard.notification_service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sentinelguard.notification_service.dto.CustomerNotificationRequest;
import sentinelguard.notification_service.service.NotificationService;

@RestController
@RequestMapping("api/v1/notification")
@Slf4j
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping("/")
    public void saveNotification(@RequestBody CustomerNotificationRequest notificationRequest)  {
        log.info("new notification was received {}", notificationRequest);
        notificationService.saveNotification(notificationRequest);
    }
}
