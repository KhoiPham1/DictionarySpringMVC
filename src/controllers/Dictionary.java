package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @PostMapping("/dic")
    public String dictionary(@RequestParam String search, Model model){

        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin chào");
        dictionary.put("book"," Sách ");
        dictionary.put("computer","Máy tính");
        dictionary.put("Search","Tìm kiếm");
        dictionary.put("Research","Nghiên cứu");

        String searchdic = search;
        searchdic = dictionary.get(search);

        model.addAttribute("search",searchdic);

        return "index";

    }
}




