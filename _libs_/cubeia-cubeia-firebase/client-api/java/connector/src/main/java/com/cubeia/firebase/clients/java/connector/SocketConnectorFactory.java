/**
 * Copyright (C) 2011 Cubeia Ltd <info@cubeia.com>
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cubeia.firebase.clients.java.connector;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class SocketConnectorFactory implements ConnectorFactory {

	private final String host;
	private final int port;

	public SocketConnectorFactory(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	@Override
	public void start() throws IOException { }

	@Override
	public Connector createConnector() throws IOException, GeneralSecurityException {
		return createConnector(null);
	}

	@Override
	public Connector createConnector(SecurityConfig conf) throws IOException, GeneralSecurityException {
		if(conf == null) {
			return new SocketConnector(host, port);
		} else {
			return new SocketConnector(host, port, conf.encryption, conf.useHandshake, conf.handshakeSignature);
		}
	}

	@Override
	public void stop() { }

}
