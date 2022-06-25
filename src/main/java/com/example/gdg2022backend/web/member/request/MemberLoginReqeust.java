package com.example.gdg2022backend.web.member.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberLoginReqeust {

	private String email;
	private String password;
}
