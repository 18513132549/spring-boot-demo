package com.ermao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ermao.domain.IdiomRepository;

@RestController
public class TestController {

  @Autowired private IdiomRepository idiomRepository;

  @GetMapping("/test")
  public String test() {
    return "rest_success";
  }
}
