/**
 * Copyright (C) 2010 Cubeia Ltd info@cubeia.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

package com.cubeia.firebase.guice.game;

import com.cubeia.firebase.api.game.table.TableGameState;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * This provider is used to bind the game state as 
 * retrieved from the table for each event execution.
 * 
 * @author larsan
 */
public class StateProvider<T> implements Provider<T> {

	@Inject
	private TableGameState state;
	
	@Override
	@SuppressWarnings("unchecked")
	public T get() {
		return (T) state.getState();
	}
}
