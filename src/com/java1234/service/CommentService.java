package com.java1234.service;

import java.util.List;

import com.java1234.entity.Comment;
import com.java1234.entity.PageBean;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface CommentService {

	/**
	 * �������Լ���
	 * @param pageBean
	 * @return
	 */
	public List<Comment> findCommentList(Comment s_Comment,PageBean pageBean);
	
	/**
	 * ��ȡ�����ܼ�¼��
	 * @param s_Comment
	 * @return
	 */
	public Long getCommentCount(Comment s_Comment);
	
	/**
	 * ��������
	 * @param comment
	 */
	public void saveComment(Comment comment);
	
	/**
	 * ɾ������
	 * @param comment
	 */
	public void delete(Comment comment);
	
	/**
	 * ͨ������id��ȡ����
	 * @param commentId
	 * @return
	 */
	public Comment getCommentById(int commentId);
}
