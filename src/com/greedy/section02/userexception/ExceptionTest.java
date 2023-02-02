package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money) 
			throws PriceNegativeException, MoneyNegativeException, NegativeException, NotEnoughMoneyException {
		
		if(price < 0) {
			throw new PriceNegativeException("��ǰ ������ ������ �� �����ϴ�.");
		}
		
		if(money < 0) {
			throw new MoneyNegativeException("���� ���� ������ �� �����ϴ�.");
		}
		
		if(money < price) {
			throw new NotEnoughMoneyException("���� �� ���� ��ǰ ������ �� ��Դϴ�.");
		}
		
		System.out.println("���� ���� ����մϴ�. ��ſ� ���� �ϼ���");
	}
}
