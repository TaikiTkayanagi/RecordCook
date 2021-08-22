package com.local.cookrecord.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User_infos {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;

  @Column(name="userName", nullable=false)
  private String userName;

  @Column(name="password")
  private String password;

  @OneToMany(mappedBy="userInfos")
  private List<User_infos> userInfos;
}
