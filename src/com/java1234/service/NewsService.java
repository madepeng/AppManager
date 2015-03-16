package com.java1234.service;

import java.util.List;

import com.java1234.entity.News;
import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface NewsService {

	/**
	 * �������ż���
	 * @return
	 */
	public List<News> findNewsList(News s_news,PageBean pageBean);
	
	/**
	 * ��ѯ��������
	 * @param s_news
	 * @return
	 */
	public Long getNewsCount(News s_news);
	
	/**
	 * ��������
	 * @param news
	 */
	public void saveNews(News news);
	
	/**
	 * ɾ������
	 * @param news
	 */
	public void delete(News news);
	
	/**
	 * ͨ������id��ȡ����
	 * @param newsId
	 * @return
	 */
	public News getNewsById(int newsId);
}
