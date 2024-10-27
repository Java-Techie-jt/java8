package com.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Project{

	private String projectCode;
	private String name ;
	private String client;
	private String buLeadName;
}