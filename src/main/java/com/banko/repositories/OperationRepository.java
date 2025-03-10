package com.banko.repositories;

import com.banko.entities.Operation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OperationRepository extends JpaRepository<Operation, Long> {
}
