/**
 * Copyright (C) 2010 Cubeia Ltd <info@cubeia.com>
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

package com.cubeia.backoffice.wallet.api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * <p>The DateAdapter specifies the date format used in the 
 * protocol objects.</p>
 * 
 * <p>The date format follows the <strong>ISO 8601</strong> standard including milliseconds.</p>
 * 
 * @author Fredrik Johansson, Cubeia Ltd
 */
public class DateAdapter extends XmlAdapter<String, Date> {

	private static final String DATE_FORMAT = "yyyy-MM-dd kk:mm:ss.SSS";

	public Date unmarshal(String date) throws Exception {
	    // NOTE: SimpleDateFormat is not thread safe, this is why we create a new instance
		return new SimpleDateFormat(DATE_FORMAT).parse(date);
	}

	public String marshal(Date date) throws Exception {
        // NOTE: SimpleDateFormat is not thread safe, this is why we create a new instance
		return new SimpleDateFormat(DATE_FORMAT).format(date);
	}
}