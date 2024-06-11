package sentinelguard.notification_service.message.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import sentinelguard.notification_service.dto.CustomerNotificationRequest;
import sentinelguard.notification_service.service.NotificationService;

@Component
@Slf4j
@RequiredArgsConstructor
public class NotificationConsumer {
    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(CustomerNotificationRequest notificationRequest) {
        log.info("Consumed {} from queue", notificationRequest);
        notificationService.saveNotification(notificationRequest);
    }
}
