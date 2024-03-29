package com.lic.epgs.gratuity.policyservices.common.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PolicyServiceStatusResponseDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object responseData;
	private String status;
	private String message;

}
