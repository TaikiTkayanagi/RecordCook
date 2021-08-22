package com.local.cookrecord.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Materials {
  @Id
  @Column(name="id", nullable=true)
  private String id;

  @Column(name="name", nullable=true)
  private String name;

  @ManyToMany(mappedBy="materials")
  private List<Dishes> dishes;
}
