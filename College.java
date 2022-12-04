package com.miit.hybridannoxml;

import org.springframework.stereotype.Component;

@Component
public class College implements Building {

	@Override
	public void room() {
		System.out.println("Room in College");

	}

}
