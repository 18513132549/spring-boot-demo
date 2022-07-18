package com.ermao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "cy")
@Data
@Accessors(chain = true)
public class Cy {

  @Id
  private Long id;
  private String name;
  private String content;
}
