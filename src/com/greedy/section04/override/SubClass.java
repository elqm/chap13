package com.greedy.section04.override;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	/* ���ܸ� ������ ���� ���� �������̵� �� �� �ִ�. */
//	@Override
//	public void method() {}
	
	/* ���� ���ܸ� �����ִ� �������� �������̵� �ؾ� �Ѵ�. */
//	@Override
//	public void method() throws IOException {}
	
	/* �θ��� ����ó�� Ŭ�������� ���� ���ܷδ� �ļ�Ŭ�������� �������̵� �� �� ����. */
//	@Override
//	public void method() throws Exception {}
	
	/* ������ �θ��� ���� Ŭ�������� �� ������ �ִ� ����(�� ��ü���� ��Ȳ)�� ��� �������̵� �� �� �ִ�. */
	@Override
	public void method() throws FileNotFoundException {}
}
