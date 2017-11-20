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

package com.intuit.ugc.impl.core.queryplan;

/**
 * 
 * @author ajain17
 *
 */
public interface OperationList {
    /**
     * Add an operation
     * 
     * @param op
     */
    public void add(Operation op);
    
    /**
     * Get Current Operation
     * 
     * @return
     */
    public Operation getTailOperation();
    
    /**
     * Get Iterator
     * 
     * @return
     */
    public OperationIterator iterator();

}