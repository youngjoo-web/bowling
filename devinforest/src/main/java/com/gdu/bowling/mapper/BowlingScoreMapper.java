package com.gdu.bowling.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.bowling.vo.BowlingScore;
import com.gdu.bowling.vo.FrameScore;
import com.gdu.bowling.vo.PinBoard;
import com.gdu.bowling.vo.ScoreBoard;
import com.gdu.bowling.vo.ScoreRanking;

@Mapper
public interface BowlingScoreMapper {

	public List<ScoreRanking> selectScoreRankList();
	
	public int insertPinBoardOne(PinBoard pinBoard);
	
	public int insertFrameScoreOne(FrameScore frameScore);
	
	public int insertScoreBoardOne(ScoreBoard scoreBoard);
}
