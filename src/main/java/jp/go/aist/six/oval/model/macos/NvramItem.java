/**
 * SIX OVAL - http://code.google.com/p/six-oval/
 * Copyright (C) 2010
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H22PRO-1124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.go.aist.six.oval.model.macos;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item stores output of 'nvram -p'.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NvramItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NvramItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   nvram_var;
    private EntityItemStringType   nvram_value;



    /**
     * Constructor.
     */
    public NvramItem()
    {
        this( 0 );
    }


    public NvramItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.NVRAM;
    }



    /**
     */
    public void setNvramVar(
                    final EntityItemStringType nvram_var
                    )
    {
        this.nvram_var = nvram_var;
    }


    public EntityItemStringType getNvramVar()
    {
        return nvram_var;
    }



    /**
     */
    public void setNvramValue(
                    final EntityItemStringType nvram_value
                    )
    {
        this.nvram_value = nvram_value;
    }


    public EntityItemStringType getNvramValue()
    {
        return nvram_value;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "nvram_item[" + super.toString()
                        + ", nvram_var="   + getNvramVar()
                        + ", nvram_value=" + getNvramValue()
             + "]";
    }

}
//
