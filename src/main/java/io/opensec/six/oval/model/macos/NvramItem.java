/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * This item stores output of 'nvram -p'.
 *
 * @author  Akihito Nakamura, AIST
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
