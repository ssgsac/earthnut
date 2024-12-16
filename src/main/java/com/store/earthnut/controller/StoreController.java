package com.store.earthnut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping(value = "/store")
public class StoreController {

  @GetMapping("/health")
  public String healthCheck() {
    return "good";
  }
}
