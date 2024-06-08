CREATE TABLE IF NOT EXISTS notification
(
    id                bigint primary key,
    message           varchar(255),
    sender            varchar(255),
    sent_at           timestamp,
    to_customer_email varchar(255),
    to_customer_id    bigint
);