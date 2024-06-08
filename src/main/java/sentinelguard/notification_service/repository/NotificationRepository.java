package sentinelguard.notification_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sentinelguard.notification_service.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
