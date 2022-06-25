package com.example.gdg2022backend.web.common.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthReqeust {

	private String email;
	private String password;
}
