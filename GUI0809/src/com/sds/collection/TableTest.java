/*
 * swing���� �����͸� ��� �� �����ϱ� ���� �뵵�� �����Ǵ�
 * ������Ʈ�� JTable �̴�.!!
 * 
 * JTable �� ���� �������� ���̱� ���� , �����ΰ� ��(���� �� ������)
 * �� �и���Ų ���� �߰��Ѵ�.
 * ���� JTable�� ���� �����͸� �����ִ� â(Window)��Ȱ�� �ϰ�
 * ���� ������ �����͸� �����ϴ� ��ü�� TableModel�̴�.
 * 
 * �� ������?????
 * ���� ���� ���� ����!
 * ��Ȳ�� ���� �����͸� �ٲٱ� ������
 * */

package com.sds.collection;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TableTest extends JFrame {
	JTable table;
	JScrollPane scroll;
	TableModel model;
	
	
	
	public TableTest() {
		table= new JTable(model=new PetModel());
		scroll=new JScrollPane(table);
		
		//add(table);
		add(scroll);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TableTest();
	}

}