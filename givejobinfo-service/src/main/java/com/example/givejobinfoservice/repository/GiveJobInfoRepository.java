package com.example.givejobinfoservice.repository;

import com.example.givejobinfoservice.entity.GiveJobInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiveJobInfoRepository extends JpaRepository<GiveJobInfo,Long> {
}
