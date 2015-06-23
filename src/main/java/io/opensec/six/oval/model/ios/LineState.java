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
package io.opensec.six.oval.model.ios;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The line state defines the different information that can be used to evaluate
 * the result of a specific SHOW sub-command.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LineState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           show_subcommand;
    private EntityStateStringType           config_line;



    /**
     * Constructor.
     */
    public LineState()
    {
        this( null, 0 );
    }


    public LineState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public LineState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.IOS;
        _oval_component = ComponentType.LINE;
    }




    /**
     */
    public void setShowSubcommand(
                    final EntityStateStringType show_subcommand
                    )
    {
        this.show_subcommand = show_subcommand;
    }


    public EntityStateStringType getShowSubcommand()
    {
        return show_subcommand;
    }



    /**
     */
    public void setConfigLine(
                    final EntityStateStringType config_line
                    )
    {
        this.config_line = config_line;
    }


    public EntityStateStringType getConfigLine()
    {
        return config_line;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getShowSubcommand() );
        ref_list.add( getConfigLine() );

        return ref_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof LineState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "line_state[" + super.toString()
                        + ", show_subcommand="  + getShowSubcommand()
                        + ", config_line="      + getConfigLine()
             + "]";
    }

}
//
