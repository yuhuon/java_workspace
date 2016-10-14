/*
 *  ������ �����츦 �����Ѵ�. 1024 x 768
 *  
 *  ������ �������̽��� 3�� �̻��� ������ �޼��带 ������ ���
 *  ��������� �ʴ� �޼��带 �ڵ������ ���� ���Ѿ� �ϴ� ���ո���
 *  ��찡 �߻��ϰ� �ȴ�.
 *  
 *  �ذ�å!!!!
 *  sun������ ����Ͷ�� Ŭ������ ���� �� ������ �ذ��� ��
 * */

package com.sds.game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWindow extends JFrame implements ActionListener{
	GamePanel gamePanel;
	JMenuBar bar;
	JMenu[] menu=new JMenu[2];
	JMenuItem[] item=new JMenuItem[3];
	String[] itemTitle={"���ӽ���","�Ͻ� ����","��������"};
//	KeyAdapter keyAdapter;//�츮 ��� KeyListener�� ������ �߻� Ŭ����!!!!
										//�츮�� ����keyReleased,keyPresses,keyTyped�� ����
										//���� �ǹ��� ����!!
										//KeyBoard Ŭ������ ���� ���� �Ⱦ�                                         
	KeyBoard keyboard;
	
	
	public GameWindow() {
		
		
		add(gamePanel=new GamePanel());
		pack();
		
		//�޴� ����
		bar = new JMenuBar();
		menu[0]=new JMenu("���ӿɼ�");
		menu[1]=new JMenu("����");
		
		
		for(int i=0;i<item.length;i++){
			item[i]= new JMenuItem(itemTitle[i]);
			menu[0].add(item[i]);
			item[i].addActionListener(this);// �����ʿ� ����!!
		}
		bar.add(menu[0]);
		bar.add(menu[1]);
		
		setJMenuBar(bar);
			
		//������� Ű������ ����
		this.addKeyListener(keyboard=new KeyBoard(gamePanel.objectManager));
	
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(Color.BLACK);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==item[0]){//���ӽ���
			gamePanel.startGame();
			
		}else if(obj==item[1]){//���� �Ͻ� ����
			gamePanel.pauseGame();
			
		}else if(obj==item[2]){//���� ����
			gamePanel.exitGame();
		}
	}
	
	
	public static void main(String[] args) {
		new GameWindow();
	}

}