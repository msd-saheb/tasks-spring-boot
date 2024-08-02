package com.amdee.io.homeworks.homework3.respositories;

import com.amdee.io.homeworks.homework3.entities.AdmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRecordRepository extends JpaRepository<AdmissionRecord, Long> {
}
