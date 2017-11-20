/*
 * Copyright (c) 2017.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    ajain17 - API and implementation and initial documentation
 *    nverma1 - enhancements
 */

package com.intuit.ugc.impl.core.helper;

import com.intuit.ugc.impl.core.AbstractGraphPersistence;
import com.intuit.ugc.impl.core.queryplan.MutationExecutorFactory;
import com.intuit.ugc.impl.core.spi.GraphVisitor;

/**
 * 
 * @author nverma1
 *
 */
public class MockGraphPersistence extends AbstractGraphPersistence {

	public MockGraphPersistence(GraphVisitor repository, MutationExecutorFactory factory) {
		super(repository, factory);
	}

}
