package org.example.scheduleproject1.repository;

import org.example.scheduleproject1.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}