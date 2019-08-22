package com.github.dominaspl.resttemplate.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Alien {

    private Long id;
    private String name;
    private String tech;

}
