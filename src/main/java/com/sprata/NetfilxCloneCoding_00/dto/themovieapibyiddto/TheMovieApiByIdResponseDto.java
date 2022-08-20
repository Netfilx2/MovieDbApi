package com.sprata.NetfilxCloneCoding_00.dto.themovieapibyiddto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheMovieApiByIdResponseDto {
    private String homepage;

    private VideoListDto videos;
}

