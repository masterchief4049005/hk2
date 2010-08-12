/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 *  Copyright 2010 Sun Microsystems, Inc. All rights reserved.
 *
 *  The contents of this file are subject to the terms of either the GNU
 *  General Public License Version 2 only ("GPL") or the Common Development
 *  and Distribution License("CDDL") (collectively, the "License").  You
 *  may not use this file except in compliance with the License. You can obtain
 *  a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 *  or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 *  language governing permissions and limitations under the License.
 *
 *  When distributing the software, include this License Header Notice in each
 *  file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 *  Sun designates this particular file as subject to the "Classpath" exception
 *  as provided by Sun in the GPL Version 2 section of the License file that
 *  accompanied this code.  If applicable, add the following below the License
 *  Header, with the fields enclosed by brackets [] replaced by your own
 *  identifying information: "Portions Copyrighted [year]
 *  [name of copyright owner]"
 *
 *  Contributor(s):
 *
 *  If you wish your version of this file to be governed by only the CDDL or
 *  only the GPL Version 2, indicate your decision by adding "[Contributor]
 *  elects to include this software in this distribution under the [CDDL or GPL
 *  Version 2] license."  If you don't indicate a single choice of license, a
 *  recipient has the option to distribute your version of this file under
 *  either the CDDL, the GPL Version 2 or to extend the choice of license to
 *  its licensees as provided above.  However, if you add GPL Version 2 code
 *  and therefore, elected the GPL Version 2 license, then the option applies
 *  only if the new code is made subject to such option by the copyright
 *  holder.
 */

package org.glassfish.hk2.classmodel.reflect;

import java.util.Collection;
import java.net.URI;

/**
 * A type defines java type which can be an interface or a class.
 *
 * @author Jerome Dochez
 */
public interface Type extends AnnotatedElement {

    /**
     * Returns an unmodifiable collection of methods that are declared
     * in this type.
     *
     * @return methods declared on this type
     */
    Collection<MethodModel> getMethods();

    /**
     * Returns a unmodifiable collection of this type references. A
     * reference can be a field declaration in a type which type is this
     * instance or it can be a method declaration which return type is
     * this type
     *
     * @return references on this type
     */
    Collection<Member> getReferences();

    /**
     * Returns the defining URIs
     * @return a collection of URIs in which the type was defined
     */
    Collection<URI> getDefiningURIs();

    /**
     * Determine if this type was defined in one of the passed URI or not
     *
     * @param uris collection of URI to check if this type was defined in them.
     * @return true if this type as defined in one the passed URI
     */
    boolean wasDefinedIn(Collection<URI> uris);
}
