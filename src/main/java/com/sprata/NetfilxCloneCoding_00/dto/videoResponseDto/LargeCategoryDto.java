package com.sprata.NetfilxCloneCoding_00.dto.videoResponseDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LargeCategoryDto{
    private String largecategory;
    private List<SmallCategoryDto> datainfo;
}
