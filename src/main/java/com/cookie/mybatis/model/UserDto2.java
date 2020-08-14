package com.cookie.mybatis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author sunbing_vendor
 */
@Data
public class UserDto2 {

	private String userId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime birthdayTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime graduationTime;
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private LocalDate localDate;
}