package com.felece.görev.controller;

import com.felece.görev.entity.Arac;
import com.felece.görev.entity.Kullanici;
import com.felece.görev.service.AracService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AracController {

    @Autowired
    private AracService aracService;

    @GetMapping(path ="/araclar")
    public String loadVehicles(Model model){
        List<Arac> aracList =aracService.getAll();
        model.addAttribute("aracList",aracList);
        return "araclar";
    }

    @GetMapping(path ="/araclar/delete/{id}")
    public String deleteVehicle(@PathVariable("id") Long id){
        aracService.delete(id);
        return "redirect:/araclar";
    }

    @GetMapping(path ="/araclar/newArac")
    public String aracRegister(Model model){
        Arac arac =new Arac();
        model.addAttribute("aracModel",arac);
        return "aracForm";
    }

    @PostMapping(path ="/araclar/newArac")
    public String createVehicle(Arac aracModel){
        aracService.create(aracModel);
        return "redirect:/araclar";
    }
}
