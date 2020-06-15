package de.kontextwork.virginspring.foo;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Foo
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
}
