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
package jp.go.aist.six.oval.model.pixos;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The line state defines the different information that can be used to evaluate
 * the result of a specific SHOW sub-command.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LineState.java 3197 2013-07-05 08:11:39Z nakamura5akihito@gmail.com $
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

        _oval_family = Family.PIXOS;
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
