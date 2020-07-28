package com.gdu.bowling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gdu.bowling.mapper.BowlingScoreMapper;
import com.gdu.bowling.vo.BowlingScore;

@Controller
public class BowlingScoreController {
	@Autowired
	private BowlingScoreMapper bowlingScoreMapper;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<BowlingScore>list = bowlingScoreMapper.selectBowlingScoreList();
		model.addAttribute("list",list);
		return "index";
	}
	
}
