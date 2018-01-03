/**
 * Project Name:dt59homework
 * File Name:fangDaoDoor.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:57:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:57:38 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class FangDaoDoor extends Door  implements  Lock,DoorBell{
	private final static Logger LOG=Logger.getLogger(LogDemo.class);

	@Override
	public void doorOpen() {
		
		LOG.info("门开了!");
		
	}

	@Override
	public void doorClose() {
		
		LOG.info("门关了!");
		
	}

	@Override
	public void lockOpen() {
		
		LOG.info("锁开了!");
		
	}

	@Override
	public void lockClose() {
		
		LOG.info("上锁!");
		
	}

	@Override
	public void bell() {
		
		LOG.info("铃响了!");
		
	}

}

