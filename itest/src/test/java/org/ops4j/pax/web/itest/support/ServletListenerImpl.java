package org.ops4j.pax.web.itest.support;

import org.ops4j.pax.web.service.spi.ServletEvent;
import org.ops4j.pax.web.service.spi.ServletListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServletListenerImpl implements ServletListener {
	private static final Logger LOG = LoggerFactory.getLogger(ServletListenerImpl.class);
	
	private boolean event;

	@Override
	public void servletEvent(ServletEvent servletEvent) {
		LOG.info("Got event: " + servletEvent);
		if (servletEvent.getType() == 2) {
			this.event = true;
		}
	}

	public boolean gotEvent() {
		return event;
	}
}