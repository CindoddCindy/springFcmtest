package com.sprinfcm.springfcmtest.repository;

import com.sprinfcm.springfcmtest.model.PushNotificationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PNRRepository extends JpaRepository<PushNotificationRequest, Long> {
}
