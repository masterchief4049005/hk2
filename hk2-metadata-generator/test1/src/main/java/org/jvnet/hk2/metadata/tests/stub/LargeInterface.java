/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.jvnet.hk2.metadata.tests.stub;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jvnet.hk2.annotations.Contract;

/**
 * Imagine that this is an interface with a lot of methods on it
 * 
 * @author jwells
 *
 */
@Contract
public interface LargeInterface {
    
    
    /**
     * This method will not be overridden
     * 
     * @param param
     * @return
     */
    public boolean notOverridden(boolean param);
    
    public void methodVoids();
    public boolean methodBoolean(boolean param);
    public byte methodByte(byte param);
    public char methodChar(char param);
    public double methodDouble(double param);
    public float methodFloat(float param);
    public int methodInt(int param);
    public long methodInt(long param);
    public short methodShort(short param);
    public List<String> methodDeclared(Map<Object, String> param, String param1, Random param2);
    
    public boolean[] methodBooleanArray(boolean[] param);
    public byte[][][][] methodByteArray(byte[] param);
    public char[] methodCharArray(char[][] param);
    public double[][] methodDoubleArray(double[][][] param);
    public float[] methodFloatArray(float[][] param);
    public int[][] methodIntArray(int[] param);
    public long[] methodIntArray(long[][][][][] param);
    public short[] methodShortArray(short[] param);
    public List<String>[] methodDeclaredArray(Map<Object, String>[] param, String[] param1, Random... param2);
    
}
