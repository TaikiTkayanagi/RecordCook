package com.local.cookrecord.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dish_kinds {
  @Id
  @Column(name="id", nullable=false)
  private int id;
  @Column(name="kindName", nullable=false)
  private String kindName;
}
