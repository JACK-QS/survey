package com.yanzhen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 
 * @author 596183363@qq.com
 * @time 2020-06-09 10:18:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionOpt{

	/**
	 * 默认为NULL；1答案
	 */
	private Integer answer;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private String opt;
	/**
	 * 
	 */
	private Integer orderby;
	/**
	 * 
	 */
	private Integer questionId;
	/**
	 * 
	 */
	private Integer surveyId;
	/**
	 * 1radio|2checkbox
	 */
	private Integer type;

	//被投票数量
	private Integer num;

}