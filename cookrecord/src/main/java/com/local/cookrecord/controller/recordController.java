package com.local.cookrecord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class recordController {
  @GetMapping("/")
  public String first(){
    return "redirect:/record";
  }

  @GetMapping("/record")
  public String top(Model model){
    model.addAttribute("title", "料理日記");
    model.addAttribute("header_title", "料理日記");

    return "common/headerLayout";
  }
}
