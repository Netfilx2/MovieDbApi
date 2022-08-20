package com.sprata.NetfilxCloneCoding_00.dto.themovieapibygenredto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheDramaApiGenreResponseDto {
    private Float page;
    private List<TheDramaApiResponseResultList> results = new ArrayList<>();
}
