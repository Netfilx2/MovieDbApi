package com.sprata.NetfilxCloneCoding_00.repository;


import com.sprata.NetfilxCloneCoding_00.domain.LargeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LargeCategoryRepository extends JpaRepository<LargeCategory, Long> {
    public LargeCategory findByLargeCategoryName(String largeCategoryName);
}
