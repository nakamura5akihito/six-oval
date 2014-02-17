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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import jp.go.aist.six.oval.model.OvalObject;
import jp.go.aist.six.oval.model.common.FamilyEnumeration;



/**
 * A description of the family, platform(s), and product(s)
 * to be evaluated for an OVAL Definition.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: AffectedType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AffectedType
    implements OvalObject
{

    private final Collection<String>  platform = new HashSet<String>();
//  private final Collection<Platform>  platform = new HashSet<Platform>();
    //{0..*, unique}


    private final Collection<String>  product = new HashSet<String>();
//  private final Collection<Product>  product = new HashSet<Product>();
    //{0..*, unique}


    private FamilyEnumeration  family;
    //{required}



    /**
     * Constructor.
     */
    public AffectedType()
    {
    }


    public AffectedType(
                    final FamilyEnumeration family
                    )
    {
        setFamily( family );
    }


//    /**
//     * Constructor.
//     */
//    public AffectedType(
//                    final FamilyEnumeration family,
//                    final Collection<? extends Platform> platform,
//                    final Collection<? extends Product> product
//                    )
//    {
//        setFamily( family );
//        setPlatform( platform );
//        setProduct( product );
//    }
//
//

    public AffectedType(
                    final FamilyEnumeration family,
                    final Platform[] platform,
                    final Product[] product
                    )
    {
        setFamily( family );

        if (platform != null) {
            setPlatform( Arrays.asList( platform ) );
        }

        if (product != null) {
            setProduct( Arrays.asList( product ) );
        }
    }



    /**
     */
    public void setPlatform(
                    final Collection<? extends Platform> platforms
                    )
    {
        platform.clear();
        if (platforms != null  &&  platforms.size() > 0) {
            for (Platform  p : platforms) {
                addPlatform( p );
            }
        }
    }


    public boolean addPlatform(
                    final Platform platform
                    )
    {
        if (platform == null) {
            throw new IllegalArgumentException( "empty platform" );
        }

        return addPlatform( platform.getName() );
    }


    public boolean addPlatform(
                    final String platform
                    )
    {
        if (platform == null) {
            throw new IllegalArgumentException( "empty platform name" );
        }

        return this.platform.add( platform );
    }


    public AffectedType platform(
                    final Platform platform
                    )
    {
        addPlatform( platform );
        return this;
    }


    public AffectedType platform(
                    final String platform
                    )
    {
        addPlatform( platform );
        return this;
    }


    public Collection<Platform> getPlatform()
    {
        Collection<Platform>  c = new HashSet<Platform>();
        for (String  platform : this.platform) {
            c.add( new Platform( platform ) );
        }

        return c;
    }


    public Iterator<Platform> iteratePlatform()
    {
        return getPlatform().iterator();
    }

//    public void setPlatform(
//                    final Collection<? extends Platform> platforms
//                    )
//    {
//        if (this.platform != platforms) {
//            this.platform.clear();
//            if (platforms != null  &&  platforms.size() > 0) {
//                this.platform.addAll( platforms );
//            }
//        }
//    }
//
//
//    public boolean addPlatform(
//                    final Platform platform
//                    )
//    {
//        if (platform == null) {
//            return false;
//        }
//
//        return this.platform.add( platform );
//    }
//
//
//    public AffectedType platform(
//                    final Platform platform
//                    )
//    {
//        addPlatform( platform );
//        return this;
//    }
//
//
//    public AffectedType platform(
//                    final String platform
//                    )
//    {
//        addPlatform( new Platform( platform ) );
//        return this;
//    }
//
//
//    public Collection<Platform> getPlatform()
//    {
//        return this.platform;
//    }
//
//
//    public Iterator<Platform> iteratePlatform()
//    {
//        return this.platform.iterator();
//    }



    /**
     */
    public void setProduct(
                    final Collection<? extends Product> products
                    )
    {
        product.clear();
        if (products != null  &&  products.size() > 0) {
            for (Product  p : products) {
                addProduct( p );
            }
        }
    }


    public boolean addProduct(
                    final Product product
                    )
    {
        if (product == null) {
            throw new IllegalArgumentException( "empty product" );
        }

        return addProduct( product.getName() );
    }


    public boolean addProduct(
                    final String product
                    )
    {
        if (product == null) {
            return false;
        }

        return this.product.add( product );
    }


    public AffectedType product(
                    final Product product
                    )
    {
        addProduct( product );
        return this;
    }


    public AffectedType product(
                    final String product
                    )
    {
        addProduct( product );
        return this;
    }


    public Collection<Product> getProduct()
    {
        Collection<Product>  c = new HashSet<Product>();
        for (String  product : this.product) {
            c.add( new Product( product ) );
        }

        return c;
    }


    public Iterator<Product> iterateProduct()
    {
        return getProduct().iterator();
    }


    /* using Product class */
//    public void setProduct(
//                    final Collection<? extends Product> products
//                    )
//    {
//        if (this.product != products) {
//            this.product.clear();
//            if (products != null  &&  products.size() > 0) {
//                this.product.addAll( products );
//            }
//        }
//    }
//
//
//    public boolean addProduct(
//                    final Product product
//                    )
//    {
//        if (product == null) {
//            return false;
//        }
//
//        return this.product.add( product );
//    }
//
//
//    public AffectedType product(
//                    final Product product
//                    )
//    {
//        addProduct( product );
//        return this;
//    }
//
//
//    public AffectedType product(
//                    final String product
//                    )
//    {
//        addProduct( new Product( product ) );
//        return this;
//    }
//
//
//    public Collection<Product> getProduct()
//    {
//        return this.product;
//    }
//
//
//    public Iterator<Product> iterateProduct()
//    {
//        return this.product.iterator();
//    }



    /**
     */
    public void setFamily(
                    final FamilyEnumeration family
                    )
    {
        this.family = family;
    }


    public FamilyEnumeration getFamily()
    {
        return family;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        Collection<Platform>  platform = getPlatform();
        result = prime * result + ((platform == null) ? 0 : platform.hashCode());

        Collection<Product>  product = getProduct();
        result = prime * result + ((product == null) ? 0 : product.hashCode());

        FamilyEnumeration  family = getFamily();
        result = prime * result + ((family == null) ? 0 : family.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AffectedType)) {
            return false;
        }

        AffectedType  other = (AffectedType)obj;
        Collection<Product>  other_product = other.getProduct();
        Collection<Product>   this_product =  this.getProduct();
        if (this_product == other_product
                        ||  (this_product != null  &&  other_product != null
                                        &&  this_product.size() == other_product.size()
                                        &&  this_product.containsAll( other_product ))) {
            Collection<Platform>  other_platform = other.getPlatform();
            Collection<Platform>   this_platform =  this.getPlatform();
            if (this_platform == other_platform
                        ||  (this_platform != null  &&  other_platform != null
                                        &&  this_platform.size() == other_platform.size()
                                        &&  this_platform.containsAll( other_platform ))) {
                if (this.getFamily() == other.getFamily()) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[family=" + getFamily()
                        + ", platform=" + getPlatform()
                        + ", product="  + getProduct()
                        + "]";
    }

}
// AffectedType
