package com.sprata.NetfilxCloneCoding_00.service;


import com.sprata.NetfilxCloneCoding_00.dto.genredto.MovieDto;
import com.sprata.NetfilxCloneCoding_00.dto.genredto.TVDto;
import com.sprata.NetfilxCloneCoding_00.dto.videoResponseDto.LargeCategoryDto;
import org.springframework.stereotype.Service;

@Service
public interface VideoService {
    public LargeCategoryDto getTvShow();

    public LargeCategoryDto findMovieToSmallCategory(String movie, String smallcategory);

    public LargeCategoryDto getMovie();

    LargeCategoryDto getRandomShow();

    public MovieDto findmoviegenre();

    public TVDto findTVgenre();


}
