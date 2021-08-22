package com.local.cookrecord.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dishes {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;

  @Column(name="dishName", nullable=false)
  private String dishName;

  @ManyToMany
  private List<Materials> materials;

  @Column(name="calorie", nullable=true)
  private int calorie;

  @ManyToOne
  private Dish_kinds categoryId;

  @OneToMany(mappedBy="dish")
  private List<Records> records;
}
