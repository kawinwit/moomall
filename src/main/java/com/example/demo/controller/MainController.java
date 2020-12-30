package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String Main(){
        return "index";
    }

    @GetMapping("/detail/product")
    public String productDetail(ModelMap modelMap,@RequestParam String productId){
        modelMap.addAttribute("productId", productId);

        return "productDetail";
    }

    @GetMapping("/detail/book")
    public String bookDetail(ModelMap modelMap,@RequestParam String productId,@RequestParam Integer quantity,@RequestParam String size,@RequestParam String color,@RequestParam String name){
        modelMap.addAttribute("productId", productId);
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("size", size);
        modelMap.addAttribute("color", color);
        modelMap.addAttribute("quantity", quantity);
        return "book";
    }

    @GetMapping("/product/book/all")
    public String allBookProduct(ModelMap modelMap){
        return "allProduct";
    }
}
