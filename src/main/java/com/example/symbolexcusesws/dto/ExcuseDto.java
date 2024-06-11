package com.example.symbolexcusesws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExcuseDto {


    private String id;

    @NotNull
    private int httpCode;
    @NotBlank
    private String tag;
    @NotBlank
    private String message;

}
