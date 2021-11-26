package com.felece.görev.controller;

import com.felece.görev.entity.Bilet;
import com.felece.görev.entity.BiletStatus;
import com.felece.görev.repository.BiletRepository;
import com.felece.görev.service.BiletService;
import com.felece.görev.service.BiletStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BiletController {

    @Autowired
    private BiletService biletService;


    @Autowired
    private BiletStatusService biletStatusService;

    @GetMapping(path = "/biletler")
    public String loadBiletPage(Model model){
        List<Bilet> biletList =biletService.getAll();
        model.addAttribute("biletList",biletList);
        return "bilets";
    }

    @PostMapping(path ="/biletler/yeniBilet")
    public String createBilet(Bilet bilet){
        biletService.create(bilet);
        return "redirect:/biletler";
    }

    @GetMapping(path ="/biletler/yeniBilet")
    public String createBilet(Model model){
        Bilet bilet =new Bilet();

        List<BiletStatus> statusList =biletStatusService.getAllStatuses();

        model.addAttribute("biletModel",bilet);
        model.addAttribute("statusList",statusList);

        return "biletForm";
    }

}
