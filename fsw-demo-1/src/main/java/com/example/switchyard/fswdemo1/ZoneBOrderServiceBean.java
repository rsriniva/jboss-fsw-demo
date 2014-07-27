package com.example.switchyard.fswdemo1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

import com.example.switchyard.fswdemo1.model.Order;

@Service(ZoneBOrderService.class)
public class ZoneBOrderServiceBean implements ZoneBOrderService {
	Logger log = LogManager.getLogger(ZoneBOrderServiceBean.class);

	@Override
	public void order(Order order) {
		log.info("Save order record to ZoneB Ordering database. \n"
				+ "orderId: " + order.getOrderId() + "\n"
				+ "itemId: " + order.getItemId() + "\n"
				+ "orderNum: " + order.getItemId() );
	}
}
