package com.teamp.jang.kiosk;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class KioskInsFinal extends KioskIns4 {
	
	boolean kioskInsurance1 = false;
	boolean kioskInsurance2 = false;
	boolean kioskInsurance3injury = false;
	boolean kioskInsurance3disease = false;
	boolean kioskInsurance3thooth = false;
	boolean kioskInsurance4 = false;

	public KioskDto kioskDto;
	public KioskDAO kioskDAO = new KioskDAO();
	
	@Override
	public void KioskGUI() {
		super.KioskGUI();
		kioskInsurance1 = true;
		
		backButtonClick();
		insuranceButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("보험1 선택");
				kioskInsurance1 = false;
				kioskInsurance2 = true;
				kioskInsurance1Show();
				kioskInsurance2Show();
				i_name = "보험1";
			}
		});
		
		injuryButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("상해 선택");
				kioskInsurance2 = false;
				kioskInsurance3injury = true;
				kioskInsurance2Show();
				kioskInsurance3Show();
			}
		});
		
		injuryButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("상해1 선택");
				chooseButton = "상해1";
				chooseButtonShow();
				selectedButtonshow();
			}
		});
		
		injuryButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("상해2 선택");
				chooseButton = "상해2";
				chooseButtonShow();
				selectedButtonshow();
			}
		});
		
		injuryButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("상해3 선택");
				chooseButton = "상해3";
				chooseButtonShow();
				selectedButtonshow();
			}
		});
		
		
		diseaseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("질병 선택");
				kioskInsurance2 = false;
				kioskInsurance3disease = true;
				kioskInsurance2Show();
				kioskInsurance3Show();
			}
		});
		
		diseaseButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("질병1 선택");
				// todo 보험옮기기
			}
		});
		
		diseaseButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("질병2 선택");
			}	
		});
		
		diseaseButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("질병3 선택");
				// todo 보험옮기기
			}
		});
		
		thoothButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("치아 선택");
				kioskInsurance2 = false;
				kioskInsurance3thooth = true;
				kioskInsurance2Show();
				kioskInsurance3Show();
			}
		});
		
		thoothButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("치아1 선택");
				// todo 보험옮기기
			}
		});
		
		thoothButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("치아2 선택");
			}
		});
		
		thoothButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("치아3 선택");
				// todo 보험옮기기
			}
		});
		
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("제출 선택");
				System.out.printf("i_name = %s, i_selected1 = %s, i_selected2 = %s, i_selected3 = %s, i_selected4 = %s", i_name, selected1, selected2, selected3, selected4);
				
				kioskDto = new KioskDto(i_name, selected1, selected2, selected3, selected4);
				ArrayList<KioskDto> dto_List = kioskDAO.list(kioskDto);
				
			}
		});
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	@Override
	public void screenDraw(Graphics2D g) {
		super.screenDraw(g);
	}
	
	public void kioskInsurance1Show() {
		// kioskIns1 보이고 안보이고 하는 함수
		if(kioskInsurance1) {
		insuranceButton1.setVisible(true);
		insuranceButton2.setVisible(true);
		insuranceButton3.setVisible(true);
		insuranceButton4.setVisible(true);
		insuranceButton5.setVisible(true);
		insuranceButton6.setVisible(true);
		insuranceButton7.setVisible(true);
		insuranceButton8.setVisible(true);
		insuranceButton9.setVisible(true);
		backButton1.setVisible(true);
		}else if(!kioskInsurance1) {
			insuranceButton1.setVisible(false);
			insuranceButton2.setVisible(false);
			insuranceButton3.setVisible(false);
			insuranceButton4.setVisible(false);
			insuranceButton5.setVisible(false);
			insuranceButton6.setVisible(false);
			insuranceButton7.setVisible(false);
			insuranceButton8.setVisible(false);
			insuranceButton9.setVisible(false);
			backButton1.setVisible(false);
		}
	}
	
	public void kioskInsurance2Show() {
		// kioskIns2 보이고 안보이고 하는 함수
		if(kioskInsurance2) {
			injuryButton.setVisible(true);
			diseaseButton.setVisible(true);
			thoothButton.setVisible(true);
			backButton2.setVisible(true);
		}else if(!kioskInsurance2) {
			injuryButton.setVisible(false);
			diseaseButton.setVisible(false);
			thoothButton.setVisible(false);
			backButton2.setVisible(false);
		}
	}
	
	public void kioskInsurance3Show() {
		// kioskIns3 보이고 안보이고 하는 함수
		if(kioskInsurance3disease) {
			diseaseButton1.setVisible(true);
			diseaseButton2.setVisible(true);
			diseaseButton3.setVisible(true);
			backButton3.setVisible(true);
			
		}else if(kioskInsurance3injury) {
			injuryButton1.setVisible(true);
			injuryButton2.setVisible(true);
			injuryButton3.setVisible(true);
			backButton3.setVisible(true);
		}else if(kioskInsurance3thooth) {
			thoothButton1.setVisible(true);
			thoothButton2.setVisible(true);
			thoothButton3.setVisible(true);
			backButton3.setVisible(true);
			
			
		}else if(!kioskInsurance3disease) {
			diseaseButton1.setVisible(false);
			diseaseButton2.setVisible(false);
			diseaseButton3.setVisible(false);
			backButton3.setVisible(false);
			
			
		}else if(!kioskInsurance3injury) {
			injuryButton1.setVisible(false);
			injuryButton2.setVisible(false);
			injuryButton3.setVisible(false);
			backButton3.setVisible(false);
			
		}else if(!kioskInsurance3thooth) {
			thoothButton1.setVisible(false);
			thoothButton2.setVisible(false);
			thoothButton3.setVisible(false);
			backButton3.setVisible(false);
		}
			
	}
	
	public void kioskInsurance4Show() {
		// kioskIns4 보이고 안보이고 하는 함수
		
	}
	
	public void backButtonClick() {
		backButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton1.setIcon(backButtonEntered);
				// backButton1가 Entered로 변경 
				backButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 마우스 커서를 잡는 모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 이미지 밖에 있다면 발생하는 함수
				backButton1.setIcon(backButtonBasic);
				// backButton1을 Basic로 변경
				backButton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				// 마우스 커서를 기본 모양으로 변경
			}	
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				System.out.println("backButton1 실행");
				
			}
		});
		
		backButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton2.setIcon(backButtonEntered);
				// backButton2가 Entered로 변경 
				backButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 마우스 커서를 잡는 모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 이미지 밖에 있다면 발생하는 함수
				backButton2.setIcon(backButtonBasic);
				// backButton2을 Basic로 변경
				backButton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				// 마우스 커서를 기본 모양으로 변경
			}	
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				System.out.println("backButton2 실행");
				kioskInsurance1=true;
				kioskInsurance2=false;
				kioskInsurance1Show();
				kioskInsurance2Show();
			}
		});
		
		backButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton3.setIcon(backButtonEntered);
				// backButton3가 Entered로 변경 
				backButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 마우스 커서를 잡는 모양으로 변경
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 이미지 밖에 있다면 발생하는 함수
				backButton3.setIcon(backButtonBasic);
				// backButton3을 Basic로 변경
				backButton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				// 마우스 커서를 기본 모양으로 변경
			}	
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				System.out.println("backButton3실행");
				kioskInsurance2=true;
				kioskInsurance3disease=false;
				kioskInsurance3injury=false;
				kioskInsurance3thooth=false;
				kioskInsurance2Show();
				kioskInsurance3Show();
				
			}
		});
	}
	
	public void selectedshow() {
		// 보험 내용 선택 시 선택한 것들 출력하는 함수
		selectedButton1.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			//마우스로 이미지를 눌렀을때 발생하는 함수
			if(selected2 !=null) {
			selected1 = selected2;
			}
			if(selected3!=null) {
				selected2 = selected3;
			}
			if(selected4!=null) {
				selected3 = selected4;
			}
			selected4 = null;
			
		}
		});
		selectedButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				if(selected3!=null) {
					selected2 = selected3;
				}
				if(selected4!=null) {
					selected3 = selected4;
				}
				selected4 = null;
			}
		});
		selectedButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				if(selected4!=null) {
					selected3 = selected4;
				}
				selected4 = null;
			}
		});
		selectedButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 이미지를 눌렀을때 발생하는 함수
				selected4 = null;
			}
		});
	}
	
}
