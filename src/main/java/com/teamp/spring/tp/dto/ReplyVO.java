package com.teamp.spring.tp.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyVO {
	private int r_no;				//���� primary key
	private int b_no;				//����� �� ��ȣ
	private String r_content;		//���� ����
	private String r_writer;		//���� �ۼ���
	private Timestamp r_writedate;	//���� �ۼ���
	private int r_likecount;		//���� ��õ��� ����?
}
