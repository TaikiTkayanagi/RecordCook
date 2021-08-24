package com.local.cookrecord.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="records", schema="")
public class Records {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  private Dishes dish;

  @ManyToOne
  private User_infos userInfo;
}
