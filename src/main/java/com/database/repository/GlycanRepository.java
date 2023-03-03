package com.database.repository;

import com.database.model.Glycan;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GlycanRepository extends JpaRepository<Glycan, Long> {

}