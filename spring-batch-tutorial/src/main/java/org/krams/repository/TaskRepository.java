package org.krams.repository;

import org.krams.domain.Role;
import org.krams.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
