package com.ermao;

import com.ermao.domain.Cy;
import com.ermao.domain.CyRepository;
import com.ermao.domain.Idiom;
import com.ermao.domain.IdiomRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ermao.domain.IdiomRepository;

@RestController
@Slf4j
public class TestController {

  @Autowired private IdiomRepository idiomRepository;
  @Autowired private CyRepository cyRepository;

  @GetMapping("/test")
  public String test() {
    List<Cy> cys = cyRepository.findAll();
    log.info("size:{}", cys.size());
    return "test_success";
  }

  @GetMapping("/migrate")
  public String migrate() {
    List<Cy> cys = cyRepository.findAll();
    for (Cy cy : cys) {
      Idiom idiom = new Idiom();
      idiom.setId(cy.getId()).setName(cy.getName()).setContent(cy.getContent());
      idiomRepository.save(idiom);
    }
    log.info("size:{}", cys.size());
    return "migrate_success";
  }

  @GetMapping("/idiom")
  public Idiom findByName(@RequestParam("name") String name) {
    return idiomRepository.findByName(name);
  }
}
