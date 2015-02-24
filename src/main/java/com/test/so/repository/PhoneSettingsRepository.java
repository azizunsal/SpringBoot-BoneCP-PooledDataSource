package com.test.so.repository;

import com.test.so.domain.PhoneSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by azizunsal on 24/02/15.
 */

@Repository
public interface PhoneSettingsRepository extends JpaRepository<PhoneSettings, Long> {

}