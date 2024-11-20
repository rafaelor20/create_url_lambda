package com.rocketseat.shorturl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
