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
 * @since       2013-02-18
 */
public class Licence extends CKANResource
{
    public boolean domain_content;
    public boolean domain_data;
    public boolean domain_software;
    public String family;
    public String id;
    public boolean is_generic;
    public boolean is_okd_compliant;
    public boolean is_osi_compliant;
    public String maintainer;
    public String status;
    public String title;
    public String url;
}
