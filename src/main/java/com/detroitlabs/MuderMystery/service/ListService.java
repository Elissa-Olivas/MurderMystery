package com.detroitlabs.MuderMystery.service;

import com.detroitlabs.MuderMystery.data.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class ListService {
    public static List fetchListData() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer ebf8092265231231f2636dd680f2208b45d561c9" );
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity responseEntity = restTemplate.exchange("https://api.todoist.com/rest/v1/projects/2289156017", HttpMethod.GET, httpEntity,
                String.class);
        return new ObjectMapper().readValue(responseEntity.getBody().toString(), List.class);
    }
}
