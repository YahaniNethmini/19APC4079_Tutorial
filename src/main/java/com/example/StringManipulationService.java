package com.example;

import jakarta.jws.WebService;

@WebService(
        serviceName = "StringManipulationService",
        targetNamespace = "http://example.com/" // Match the SOAP request namespace
)

public class StringManipulationService {
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public int countCharacters(String text) {
        return text.length();
    }
}