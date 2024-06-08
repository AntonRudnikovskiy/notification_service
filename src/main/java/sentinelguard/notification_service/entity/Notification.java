package sentinelguard.notification_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "notification")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {
    @Id
    private long id;

    @Column(name = "message")
    private String message;

    @Column(name = "sender")
    private String sender;

    @Column(name = "sent_at")
    private LocalDateTime sendAt;

    @Column(name = "to_customer_email")
    private String customerEmail;

    @Column(name = "to_customer_id")
    private long customerId;
}
