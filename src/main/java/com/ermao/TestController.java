package com.ermao;

import com.ermao.domain.Cy;
import com.ermao.domain.CyRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.ermao.domain.IdiomRepository;

@RestController
@Slf4j
public class TestController {

//  @Autowired private IdiomRepository idiomRepository;
  @Autowired private CyRepository cyRepository;

  @GetMapping("/test")
  public String test() {
    List<Cy> cys = cyRepository.findAll();
    log.info("size:{}", cys.size());
    return "rest_success";
  }
}
