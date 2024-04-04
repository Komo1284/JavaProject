package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.model.vo.AccountVO;

@Service
public class QuizService {
	
	AccountVO[] accs = {
			new AccountVO("itbank", "it", "아뱅"),
			new AccountVO("karan", "karan", "카렌"),
			new AccountVO("test", "11", "테스트")
	};
	
	public String login(AccountVO input) {
		
		String msg = "로그인 실패";
		
		for(int i = 0; i < accs.length; i++) {
			if(accs[i].equals(input)) {
				msg = accs[i].getNick() + "님 로그인";
			}
		}

		return msg;
	}
	
}
