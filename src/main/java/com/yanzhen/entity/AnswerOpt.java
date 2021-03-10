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
public class AnswerOpt{

	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Integer optId;
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
	private String type;
	/**
	 * 
	 */
	private String voter;

}