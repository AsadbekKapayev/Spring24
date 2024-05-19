package org.example.event_listener.service;

import org.example.event_listener.model.dto.CompanyDto;
import org.example.event_listener.model.listener.AccessType;
import org.example.event_listener.model.listener.EntityEvent;
import org.example.event_listener.repository.CompanyRepo;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepo companyRepo;
    private final ApplicationEventPublisher applicationEventPublisher;

    public CompanyService(CompanyRepo companyRepo,
                          ApplicationEventPublisher applicationEventPublisher) {
        this.companyRepo = companyRepo;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Optional<CompanyDto> findById(String id) {
        return companyRepo.findById(id)
                .map(entity -> {
                    applicationEventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyDto(entity.getId());
                });
    }

}
