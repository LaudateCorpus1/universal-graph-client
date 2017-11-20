/*
 * Copyright (c) 2017.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    tfast - initial API and implementation and/or initial documentation
 *    ajain17 & nverma1 - API implementation, enhancements and extension
 */

package com.intuit.ugc.api;

/**
 *
 * @author tfast
 */
@SuppressWarnings("serial")
public class AccessControlException extends RuntimeException {
    
    public AccessControlException() {
        super();
    }
    
    public AccessControlException(String message) {
        super(message);
    }
    
    public AccessControlException(String message, Throwable cause) {
        super(message,cause);
    }
}
