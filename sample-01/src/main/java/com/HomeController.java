/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sseyha
 * @created date Dec 20, 2022
 *
 */
@RestController
public class HomeController {
  @GetMapping("/")
  public String getString(){
    return "";
  }

}
