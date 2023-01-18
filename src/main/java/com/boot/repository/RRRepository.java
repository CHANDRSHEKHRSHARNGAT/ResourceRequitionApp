package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.ResourceRequesitEntity;

public interface RRRepository extends JpaRepository<ResourceRequesitEntity, Integer> {

}
