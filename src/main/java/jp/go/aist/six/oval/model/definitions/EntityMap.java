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
package jp.go.aist.six.oval.model.definitions;

import java.util.HashMap;
import java.util.Iterator;



/**
 * Experimental:
 * Is there any smart way to manage entities of OVAL Objects and States?
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityMap.java 3061 2013-02-25 03:00:25Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityMap<K extends Enum<K>>
    extends HashMap<K, EntityAttributeGroup>
{

    /**
     * constructor.
     */
    public EntityMap()
    {
    }



    /**
     */
    public Iterator<EntityAttributeGroup> iterateEntity()
    {
        return values().iterator();
    }



    /**
     */
    public <T extends EntityAttributeGroup> T getEntity(
                    final K key,
                    final Class<T> type
                    )
    {
        EntityAttributeGroup  e = get( key );
        return type.cast( e );
    }



    /**
     */
    public void setEntity(
                    final K key,
                    final EntityAttributeGroup value
                    )
    {
        put( key, value );
    }

}
//public class EntityMap<K extends Enum<K>>
//extends EnumMap<K, EntityAttributeGroup>
//{
//
///**
// * constructor.
// */
//public EntityMap(
//                final Class<K> keyType
//                )
//{
//    super( keyType );
//}
//
//
//
///**
// */
//public Iterator<EntityAttributeGroup> iterateEntities()
//{
//    return values().iterator();
//}
//
//
//
///**
// */
//public <T extends EntityAttributeGroup> T getEntity(
//                final K key,
//                final Class<T> type
//                )
//{
//    EntityAttributeGroup  p = get( key );
//    return type.cast( p );
//}
//
//
//
///**
// */
//public void setEntity(
//                final K key,
//                final EntityAttributeGroup value
//                )
//{
//    put( key, value );
//}
//
//}
//
