package com.example.imLighter.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board_list")
    public String BoardList(){
        return "/board/BoardList";
    }


}
