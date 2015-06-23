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
package io.opensec.six.oval.model.definitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The time difference function calculates the difference
 * in seconds between date-time values.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TimeDifferenceFunctionType
    extends FunctionGroup
{

    private final Collection<ComponentGroup>  component =
        new ArrayList<ComponentGroup>( 2 );
    //{1..2}


    public static final DateTimeFormatEnumeration  DEFAULT_FORMAT_1 = DateTimeFormatEnumeration.YEAR_MONTH_DAY;
    private DateTimeFormatEnumeration  format_1;
    //{optional, default="year_month_day"}

    public static final DateTimeFormatEnumeration  DEFAULT_FORMAT_2 = DateTimeFormatEnumeration.YEAR_MONTH_DAY;
    private DateTimeFormatEnumeration  format_2;
    //{optional, default="year_month_day"}




    /**
     * Constructor.
     */
    public TimeDifferenceFunctionType()
    {
    }



    /**
     */
    public void setComponent(
                    final Collection<? extends ComponentGroup> components
                    )
    {
        if (components != component) {
            component.clear();
            if (components != null  &&  components.size() > 0) {
                for (ComponentGroup  component : components) {
                    addComponent( component );
                }
            }
        }
    }


    public boolean addComponent(
                    final ComponentGroup component
                    )
    {
        if (component == null) {
            return false;
        }

        return this.component.add( component );
    }


    public Collection<ComponentGroup> getComponent()
    {
        return component;
    }


    public Iterator<ComponentGroup> iterateComponent()
    {
        return component.iterator();
    }



    /**
     */
    public void setFormat1(
                    final DateTimeFormatEnumeration format_1
                    )
    {
        this.format_1 = format_1;
    }


    public DateTimeFormatEnumeration getFormat1()
    {
        return format_1;
    }


    public static DateTimeFormatEnumeration format1(
                    final TimeDifferenceFunctionType obj
                    )
    {
        DateTimeFormatEnumeration  format1 = obj.getFormat1();
        return (format1 == null ? DEFAULT_FORMAT_1 : format1);
    }



    /**
     */
    public void setFormat2(
                    final DateTimeFormatEnumeration format_2
                    )
    {
        this.format_2 = format_2;
    }


    public DateTimeFormatEnumeration getFormat2()
    {
        return format_2;
    }


    public static DateTimeFormatEnumeration format2(
                    final TimeDifferenceFunctionType obj
                    )
    {
        DateTimeFormatEnumeration  format2 = obj.getFormat2();
        return (format2 == null ? DEFAULT_FORMAT_2 : format2);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "time_difference[" + getComponent()
                        + ", format_1=" + getFormat1()
                        + ", format_2=" + getFormat2()
                        + "]";
    }

}
//TimeDifferenceFunctionType
