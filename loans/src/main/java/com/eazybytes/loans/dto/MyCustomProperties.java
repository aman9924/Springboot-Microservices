package com.eazybytes.loans.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
@Component
@Getter
@Setter
@ToString
public class MyCustomProperties {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
