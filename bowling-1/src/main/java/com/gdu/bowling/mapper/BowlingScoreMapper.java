package com.gdu.bowling.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.bowling.vo.BowlingScore;

@Mapper
public interface BowlingScoreMapper {

	public int insertBowling(BowlingScore bowlingScore);
}
