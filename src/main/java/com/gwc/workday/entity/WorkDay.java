package com.gwc.workday.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * user.
 *
 * @author chenggaowei
 * @version V1.0
 * @description: 用户
 * @date 2017-09-21 21:58
 */
@Getter
@Setter
@ToString
@Entity(name = "t_work_day")
public class WorkDay {

  @Id
  @GeneratedValue
  private Integer id;
  private String date;
  /**
   * 是否工作日，添加的都是休息日，所以都是false
   */
  private Integer isWorkDay;
}
