package com.example.switchyard.fswdemo1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

import com.example.switchyard.fswdemo1.model.Order;

@Service(ZoneAOrderService.class)
public class ZoneAOrderServiceBean implements ZoneAOrderService {
	Logger log = LogManager.getLogger(ZoneAOrderServiceBean.class);

	@Override
	public void order(Order order) {
		log.info("Save order record to ZoneA Ordering database. \n"
				+ "orderId: " + order.getOrderId() + "\n"
				+ "itemId: " + order.getItemId() + "\n"
				+ "orderNum: " + order.getItemId() );
	}

}
