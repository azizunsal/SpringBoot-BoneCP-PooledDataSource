package com.test.so.service.impl;

import com.test.so.domain.PhoneSettings;
import com.test.so.repository.PhoneSettingsRepository;
import com.test.so.service.PhoneSettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by azizunsal on 24/02/15.
 */
@Service
public class PhoneSettingsServiceImpl implements PhoneSettingsService {
    
    private static final Logger logger = LoggerFactory.getLogger(PhoneSettingsServiceImpl.class);
    
    @Autowired
    private PhoneSettingsRepository phoneSettingsRepository;
    
    @Override
    public PhoneSettings findById(Long id) {
        logger.info("Find by id {}", id);
        return phoneSettingsRepository.findOne(id);
    }
}
