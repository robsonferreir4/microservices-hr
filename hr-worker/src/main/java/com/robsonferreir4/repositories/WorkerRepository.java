package com.robsonferreir4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robsonferreir4.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
