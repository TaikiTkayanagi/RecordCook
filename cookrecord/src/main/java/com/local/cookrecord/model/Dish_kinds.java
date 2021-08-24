package com.local.cookrecord.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="dish_kinds", schema="cookrecord")
public class Dish_kinds {
  @Id
  @Column(name="id", nullable=false)
  private int id;

  @Column(name="kind_name", nullable=false)
  private String kindName;

  @OneToMany(mappedBy="category_id")
  private List<Dishes> dishes;
}
