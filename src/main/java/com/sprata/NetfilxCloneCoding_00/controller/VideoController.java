package com.sprata.NetfilxCloneCoding_00.controller;


import com.sprata.NetfilxCloneCoding_00.dto.ResponseDto;
import com.sprata.NetfilxCloneCoding_00.dto.genredto.MovieDto;
import com.sprata.NetfilxCloneCoding_00.dto.genredto.TVDto;
import com.sprata.NetfilxCloneCoding_00.dto.videoResponseDto.LargeCategoryDto;
import com.sprata.NetfilxCloneCoding_00.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @GetMapping("/video/movie")
    public ResponseDto getMovie(){
        LargeCategoryDto result = videoService.getMovie();


        return new ResponseDto(200L, "성공", result);
    }

    @GetMapping("/video/tv_show")
    public ResponseDto getTvShow(){
        LargeCategoryDto result = videoService.getTvShow();

        return new ResponseDto(200L, "성공", result);
    }

    @GetMapping("/video/random")
    public ResponseDto getRandomShow(){
        LargeCategoryDto result = videoService.getRandomShow();

        return new ResponseDto(200L, "성공", result);
    }


    @GetMapping("/videoCategory")
    public ResponseDto videoSmallCategory(@RequestParam String largeCategory , @RequestParam String smallCategory) {
        LargeCategoryDto result = videoService.findMovieToSmallCategory(largeCategory, smallCategory);

        return new ResponseDto(200L, "성공", result);
    }

    @GetMapping("/videomovie")
    public ResponseDto findAllMovieGenre() {
        MovieDto result = videoService.findmoviegenre();
        return new ResponseDto(200L, "성공", result);
    }

    @GetMapping("/videoTV")
    public ResponseDto findAllTVGenre() {
        TVDto result = videoService.findTVgenre();
        return new ResponseDto(200L, "성공", result);
    }


}
