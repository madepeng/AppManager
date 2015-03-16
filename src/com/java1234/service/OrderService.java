package com.java1234.service;

import java.util.List;

import com.java1234.entity.Order;
import com.java1234.entity.PageBean;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface OrderService {

	/**
	 * ���涩��
	 * @param order
	 */
	public void saveOrder(Order order);
	
	/**
	 * ��ѯ����
	 * @param order
	 * @return
	 */
	public List<Order> findOrderList(Order s_order,PageBean pageBean);
	
	/**
	 * ��ȡ�����ļ�¼��
	 * @param s_product
	 * @return
	 */
	public Long getOrderCount(Order s_order);
	
	/**
	 * �޸Ķ���״̬
	 * @param status
	 */
	public void updateOrderStatus(int status,String orderNo);
	
	/**
	 * ͨ�������Ż�ȡ����
	 * @param orderId
	 * @return
	 */
	public Order getOrderById(int orderId);
	
}
