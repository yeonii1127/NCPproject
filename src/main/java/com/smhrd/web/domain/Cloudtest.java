package com.smhrd.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Entity 무조건 있어야 함
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	
	@Id // 절대 빠지면 안됨 (primary key)
	private Long id;
	private String name;
	private String gender;
	private int age;
	
}
