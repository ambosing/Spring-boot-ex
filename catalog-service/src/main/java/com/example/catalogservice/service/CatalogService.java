package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import com.netflix.eventbus.spi.CatchAllSubscriber;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
