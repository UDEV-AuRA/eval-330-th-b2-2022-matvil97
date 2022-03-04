package com.ipiecoles.java.eval.th330.controller;

import com.ipiecoles.java.eval.th330.service.AlbumService;
import com.ipiecoles.java.eval.th330.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccueilController {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/"
    )
    public String employe() {

        return "accueil";
    }}