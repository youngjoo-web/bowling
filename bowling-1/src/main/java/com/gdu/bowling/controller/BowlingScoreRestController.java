package com.gdu.bowling.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gdu.bowling.mapper.BowlingScoreMapper;
import com.gdu.bowling.vo.BowlingScore;



@RestController
public class BowlingScoreRestController {
	@Autowired private BowlingScoreMapper bowlingScoreMapper;
	// 아이디 중복체크
	@PostMapping("/addBowlingScore")
	public List<BowlingScore> addBowlingScore(BowlingScore bowling, Model model) {
		// 로그인 세션확인
		bowlingScoreMapper.insertBowling(bowling);
		
		
		List<BowlingScore>list = bowlingScoreMapper.selectBowlingScoreList();
		return list;
	}
	
}
