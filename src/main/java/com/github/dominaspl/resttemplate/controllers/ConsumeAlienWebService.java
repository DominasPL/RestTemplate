package com.github.dominaspl.resttemplate.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/template/aliens")
public class ConsumeAlienWebService {

    private RestTemplate restTemplate;

    public ConsumeAlienWebService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String getAliens() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        return restTemplate.exchange("http://localhost:8090/aliens", HttpMethod.GET, entity, String.class).getBody();
    }

}
