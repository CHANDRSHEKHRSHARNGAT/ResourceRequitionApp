package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.TimeZone;

public interface TimeZoneRepository extends JpaRepository<TimeZone, Integer> {

}
