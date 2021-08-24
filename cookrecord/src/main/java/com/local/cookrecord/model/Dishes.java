package com.local.cookrecord.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="dishes",schema="cookrecord")
public class Dishes {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;

  @Column(name="dish_name", nullable=false)
  private String dishName;

  @Column(name="calorie", nullable=true)
  private Integer calorie;

  @Column(name="cook_date", nullable=true)
  private Date cookDate;

  @ManyToOne
  @JoinColumn(name="id",insertable=false,updatable=false)
  private Dish_kinds category_id;

  @OneToMany(mappedBy="dish")
  private List<Records> records;
}
