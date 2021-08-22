package com.local.cookrecord.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

  @OneToMany(mappedBy="categoryId")
  private List<Dishes> dishes;
}
