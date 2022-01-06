package com.robsonferreir4.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robsonferreir4.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
