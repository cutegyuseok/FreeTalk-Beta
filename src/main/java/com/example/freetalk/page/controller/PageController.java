package com.example.freetalk.page.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequiredArgsConstructor
public class PageController {


    @GetMapping("/socialLogin")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/search")
    @ResponseBody
    public String search(@RequestParam String keyword) {
        String[] keywords = keyword.split(" ");
        return keyword;
    }

    @GetMapping("/Logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }



    @GetMapping("/addCommunity")
    public String community(){
        return "addCommunity";
    }

    @GetMapping("/sidemenu")
    public String side(){
        return "side";
    }

    @GetMapping("/community/communityPage")
    public String communityPage(@RequestParam String c_key){
        System.out.println(c_key);
        return "index";
    }

    @GetMapping("/posting")
    public String writing(Model model){
        model.addAttribute("c_key",1);//CommunityPage 완성시 수정
        return "writing";
    }



}

