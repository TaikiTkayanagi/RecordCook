package com.local.cookrecord.controller;

import com.local.cookrecord.model.DishesRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class recordController {
  private final DishesRepository rep;

  @GetMapping("/")
  public String first(){
    return "redirect:/record";
  }

  @GetMapping("/record")
  public String top(Model model){
    model.addAttribute("title", "料理日記");
    model.addAttribute("header_title", "料理日記");
    model.addAttribute("dishes", rep.findAll());
    model.addAttribute("main", "component/table");

    return "common/headerLayout";
  }
}
