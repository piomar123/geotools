/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2019, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 */

package org.geotools.wcs.bindings;

import javax.xml.namespace.QName;
import org.geotools.wcs.WCS;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Binding object for the type http://www.opengis.net/wcs:WCS_CapabilitiesType.
 *
 * <p>
 *
 * <pre>
 *  <code>
 *  &lt;complexType name="WCS_CapabilitiesType"&gt;
 *      &lt;annotation&gt;
 *          &lt;documentation&gt;Metadata for a WCS server, also known as Capabilities document. Reply from a WCS that performed the GetCapabilities operation. &lt;/documentation&gt;
 *      &lt;/annotation&gt;
 *      &lt;sequence&gt;
 *          &lt;element ref="wcs:Service"/&gt;
 *          &lt;element ref="wcs:Capability"/&gt;
 *          &lt;element ref="wcs:ContentMetadata"/&gt;
 *      &lt;/sequence&gt;
 *      &lt;attribute fixed="1.0.0" name="version" type="string" use="required"/&gt;
 *      &lt;attribute name="updateSequence" type="string" use="optional"&gt;
 *          &lt;annotation&gt;
 *              &lt;documentation&gt;Service metadata (Capabilities) document version, having values that are "increased" whenever any change is made in service metadata document. Values are selected by each server, and are always opaque to clients. When supported by server, server shall return this attribute. &lt;/documentation&gt;
 *          &lt;/annotation&gt;
 *      &lt;/attribute&gt;
 *  &lt;/complexType&gt;
 *
 *   </code>
 *  </pre>
 *
 * @generated
 */
public class WCS_CapabilitiesTypeBinding extends AbstractComplexBinding {

    /** @generated */
    public QName getTarget() {
        return WCS.WCS_CapabilitiesType;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    public Class getType() {
        return null;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {

        // TODO: implement and remove call to super
        return super.parse(instance, node, value);
    }
}
