/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.internal.commands;

import java.io.IOException;
import java.util.List;

interface IMutableRegistry extends IRegistry {

	void save()
		throws IOException;

	void setActiveKeyConfigurationDefinitions(List activeKeyConfigurationDefinitions);
	
	void setCategoryDefinitions(List categoryDefinitions);
	
	void setCommandDefinitions(List commandDefinitions);
	
	void setContextBindingDefinitions(List contextBindingDefinitions);

	void setImageBindingDefinitions(List imageBindingDefinitions);

	void setKeyBindingDefinitions(List keyBindingDefinitions);
	
	void setKeyConfigurationDefinitions(List keyConfigurationDefinitions);
}
