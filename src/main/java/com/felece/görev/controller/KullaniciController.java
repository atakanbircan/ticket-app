package com.felece.görev.controller;

import com.felece.görev.entity.Bilet;
import com.felece.görev.entity.Kullanici;
import com.felece.görev.repository.BiletRepository;
import com.felece.görev.repository.KullaniciRepository;
import com.felece.görev.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;


    @GetMapping(path ="/users")
    public String
    loadUsersPage(Model model){
        List<Kullanici> userList =kullaniciService.getAll();
        model.addAttribute("userList",userList);
        return "users";
    }

    @GetMapping(path ="/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        kullaniciService.delete(id);
        return "redirect:/users";
    }

    @GetMapping(path ="/")
    public String registerPage(Model model){
        return "homepage";
    }

    @GetMapping(path ="/users/newUser")
    public String register(Model model){
        Kullanici user =new Kullanici();
        model.addAttribute("userModel",user);
        return "userForm";
    }

    @PostMapping(path ="/users/saveUser")
    public String createUser(Kullanici user){
        kullaniciService.create(user);
        return "redirect:/users";
    }
}
