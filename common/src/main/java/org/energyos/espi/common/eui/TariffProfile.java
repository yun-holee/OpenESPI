/*******************************************************************************
 * Copyright (c) 2011, 2012 EnergyOS.Org
 *
 * Licensed by EnergyOS.Org under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  The EnergyOS.org licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at:
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *  
 *******************************************************************************/

 

package org.energyos.espi.common.eui;



/**
 * A schedule of charges; structure associated with Tariff that allows the
 * definition of complex tarif structures such as step and time of use.
 * @author svanausdall
 * @version 1.0
 * @updated 22-Aug-2011 9:39:26 AM
 */
public class TariffProfile {

	/**
	 * The name is any free human readable and possibly non unique text naming the
	 * object.
	 */
	public String name;

	public TariffProfile(){

	}

	public void finalize() throws Throwable {

	}
}//end TariffProfile