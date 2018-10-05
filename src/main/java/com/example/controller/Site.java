package com.example.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Site {
  API("API", "/api", false),
  SCREEN("画面", "", true);

  private String label;
  private String baseUrl;
  private boolean protectCsrf;

  public static Site of(String url) {
    if (url == null) {
      return SCREEN;
    }

    for (Site location : values()) {
      if (url.startsWith(location.baseUrl)) {
        return location;
      }
    }

    return SCREEN;
  }
}