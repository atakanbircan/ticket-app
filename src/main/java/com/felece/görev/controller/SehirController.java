package com.felece.görev.controller;

import com.felece.görev.entity.Arac;
import com.felece.görev.entity.Sehir;
import com.felece.görev.repository.SehirRepository;
import com.felece.görev.service.AracService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SehirController {

    @Autowired
    private SehirRepository sehirRepository;

    @GetMapping(path ="/sehirler")
    public String cities(Model model){
        List<Sehir> sehirList =sehirRepository.findAll();
        model.addAttribute("sehirList",sehirList);
        return "sehirler";
    }

    @GetMapping(path ="/sehirler/delete/{id}")
    public String deleteCity(@PathVariable("id") Long id){
        sehirRepository.deleteById(id);
        return "redirect:/sehirler";
    }

    @GetMapping(path ="/sehirler/newSehir")
    public String cityForm(Model model){
        Sehir sehir =new Sehir();
        model.addAttribute("sehirModel",sehir);
        return "sehirForm";
    }

    @PostMapping(path ="/sehir/newSehir")
    public String createCity(Sehir sehir){
        sehirRepository.save(sehir);
        return "redirect:/sehirler";
    }
}
