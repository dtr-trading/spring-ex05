package com.dtr.oas.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class StrategyDTO implements Serializable {
	
	private static final long serialVersionUID = -6518171412015203128L;
	
	private Integer id;

	@NotNull(message = "Please provide a strategy type")
	@NotEmpty(message = "Please provide a strategy type")
	private String type;
	
	@NotNull(message = "Please provide a strategy name")
	@NotEmpty(message = "Please provide a strategy name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getString() {
		return String.format("StrategyDTO - Id: [%s]  Type: [%s]  Name: [%s]", this.id, this.type, this.name);
	}

}
