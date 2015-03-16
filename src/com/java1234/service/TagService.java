package com.java1234.service;

import java.util.List;

import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;
import com.java1234.entity.Tag;

/**
 * ��ǩservice�ӿ�
 * @author Administrator
 *
 */
public interface TagService {

	/**
	 * ��ѯ��ǩ����
	 * @return
	 */
	public List<Tag> findTagList(Tag s_tag,PageBean pageBean);
	
	/**
	 * ��ѯ��ǩ����
	 * @param s_tag
	 * @return
	 */
	public Long getTagCount(Tag s_tag);
	
	/**
	 * �����ǩ
	 * @param tag
	 */
	public void saveTag(Tag tag);
	
	/**
	 * ɾ����ǩ
	 * @param tag
	 */
	public void delete(Tag tag);
	
	/**
	 * ͨ����ǩid��ȡ��ǩ
	 * @param tagId
	 * @return
	 */
	public Tag getTagById(int tagId);
}
