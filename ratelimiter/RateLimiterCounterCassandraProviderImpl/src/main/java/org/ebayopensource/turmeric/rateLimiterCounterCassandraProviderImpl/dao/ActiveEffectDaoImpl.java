
/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *    
 *******************************************************************************/
package org.ebayopensource.turmeric.rateLimiterCounterCassandraProviderImpl.dao;

import org.ebayopensource.turmeric.rateLimiterCounterProvider.Policy.model.RateLimiterPolicyModel;
import org.ebayopensource.turmeric.utils.cassandra.dao.AbstractColumnFamilyDao;

/*
 *  @author jamuguerza
 */
public class ActiveEffectDaoImpl extends AbstractColumnFamilyDao<String, RateLimiterPolicyModel>
		implements ActiveEffectDao {

	/**
	 * Instantiates a new active effect dao impl.
	 *
	 * @param clusterName the cluster name
	 * @param host the host
	 * @param keySpace the key space
	 * @param cf the cf
	 */
	public ActiveEffectDaoImpl(final String clusterName, final String host, final String keySpace, final String cf,  final Class<String> kTypeClass) {
		super(clusterName, host, keySpace, kTypeClass, RateLimiterPolicyModel.class, cf);
	}
	
}
