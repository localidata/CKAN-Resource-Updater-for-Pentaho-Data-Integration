/*
CKANClient-J - Data Catalogue Software client in Java
Copyright (C) 2013 Newcastle University

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.ckan.client.resource.impl;

import org.ckan.client.resource.CKANResource;

/**
 *
 * @author      Andrew Martin <andrew.martin@ncl.ac.uk>
 * @version     1.8
 * @since       2013-02-26
 */
public class Membership extends CKANResource
{
    public String active;
    public String capacity;
    public String group_id;
    public String id;
    public String revision_id;
    public String table_id;
    public String table_name;
}
