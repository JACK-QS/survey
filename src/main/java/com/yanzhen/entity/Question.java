package com.yanzhen.entity;

import com.yanzhen.utils.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author 596183363@qq.com
 * @time 2020-06-09 10:18:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question extends Entity {

	/**
	 * text;number;date
	 */
	private String checkStyle;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer creator;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 0顺序1随机
	 */
	private Integer orderStyle;
	/**
	 * 
	 */
	private Integer orderby;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 0非必填1必填
	 */
	private Integer required;
	/**
	 * 
	 */
	private Integer score;
	/**
	 * 1;2;3;4
	 */
	private Integer showStyle;
	/**
	 * 
	 */
	private Integer surveyId;
	/**
	 * 0不测评1测评
	 */
	private Integer test;
	/**
	 * 
	 */
	private String title;
	/**
	 * 1radio|2checkbox|3text|4textarea
	 */
	private Integer type;

	private List<QuestionOpt> options;


}