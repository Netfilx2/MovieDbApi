package com.sprata.NetfilxCloneCoding_00.repository;


import com.sprata.NetfilxCloneCoding_00.domain.VideoSmallCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoSmallCategoryRepository
        extends JpaRepository<VideoSmallCategory, Long> {
    List<VideoSmallCategory> findAllByVideoId(Long videoid);
}
