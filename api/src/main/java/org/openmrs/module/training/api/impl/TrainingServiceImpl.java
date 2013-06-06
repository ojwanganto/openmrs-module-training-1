/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.training.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.training.Training;
import org.openmrs.module.training.api.TrainingService;
import org.openmrs.module.training.api.db.TrainingDAO;

/**
 * It is a default implementation of {@link TrainingService}.
 */
public class TrainingServiceImpl extends BaseOpenmrsService implements TrainingService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private TrainingDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(TrainingDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public TrainingDAO getDao() {
	    return dao;
    }

    @Override
    public Training saveTraining(Training training) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}