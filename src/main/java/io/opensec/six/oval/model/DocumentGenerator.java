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
package io.opensec.six.oval.model;




/**
 * The DocumentGenerator defines an element that is used to hold
 * information about when a particular OVAL document was compiled,
 * what version of the schema was used,
 * what tool compiled the document, and
 * what version of that tools was used.
 *
 * <p>
 * This type is extracted from GeneratorType defined in the OVAL Common schema
 * to refer from the OVAL Definitions elements: Definition, Test, Object, State, and Variable.
 * </p>
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DocumentGenerator
    implements OvalObject
{

    private String  product_name;
    //{xsd:string, 0..1}

    private String  product_version;
    //{xsd:string, 0..1}

    private String  schema_version;
    //5.10  {xsd:decimal, 1..1}
    //5.10.1{xsd:pattern value="[0-9]+\.[0-9]+(\.[0-9]+)?"}

    /**
     * The required timestamp specifies when the particular
     * OVAL document was compiled.
     * The format for the timestamp is yyyy-mm-dd'T'hh:mm:ss.
     */
    private String  timestamp;
//    private Date  _timestamp;
    //{xsd:dateTime, 1..1}



    /**
     * Constructor.
     */
    public DocumentGenerator()
    {
    }


    public DocumentGenerator(
                    final String schema_version,
                    final String timestamp
                    )
    {
        this( schema_version, timestamp, null, null );
    }


    public DocumentGenerator(
                    final String schema_version,
                    final String timestamp,
                    final String prod_name,
                    final String prod_version
                    )
    {
        setSchemaVersion( schema_version );
        setTimestamp( timestamp );
        setProductName( prod_name );
        setProductVersion( prod_version );
    }



    /**
     */
    public void setProductName(
                    final String product_name
                    )
    {
        this.product_name = product_name;
    }


    public String getProductName()
    {
        return product_name;
    }



    /**
     */
    public void setProductVersion(
                    final String product_version
                    )
    {
        this.product_version = product_version;
    }


    public String getProductVersion()
    {
        return product_version;
    }



    /**
     */
    public void setSchemaVersion(
                    final String schema_version
                    )
    {
        this.schema_version = schema_version;
    }


    public String getSchemaVersion()
    {
        return schema_version;
    }



    public void setTimestamp(
                    final String timestamp
                    )
    {
        this.timestamp = timestamp;
    }


    public String getTimestamp()
    {
        return timestamp;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  productName = getProductName();
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());

        String  productVersion = getProductVersion();
        result = prime * result + ((productVersion == null) ? 0 : productVersion.hashCode());

        String  schemaVersion = getSchemaVersion();
        result = prime * result + ((schemaVersion == null) ? 0 : schemaVersion.hashCode());

        String  timestamp = getTimestamp();
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());

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

        if (!(obj instanceof DocumentGenerator)) {
            return false;
        }

        DocumentGenerator  other = (DocumentGenerator)obj;
        String  other_ts = other.getTimestamp();
        String   this_ts =  this.getTimestamp();
        if (this_ts == other_ts
                        ||  (this_ts != null  &&  this_ts.equals( other_ts ))) {
            String  other_sv = other.getSchemaVersion();
            String   this_sv =  this.getSchemaVersion();
            if (this_sv == other_sv
                            ||  (this_sv != null  &&  this_sv.equals( other_sv ))) {
                String  other_pn = other.getProductName();
                String   this_pn =  this.getProductName();
                if (this_pn == other_pn
                                ||  (this_pn != null  &&  this_pn.equals( other_pn ))) {
                    String  other_pv = other.getProductVersion();
                    String   this_pv =  this.getProductVersion();
                    if (this_pv == other_pv
                                    ||  (this_pv != null  &&  this_pv.equals( other_pv ))) {
                        return true;
                    }
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[product_name=" + getProductName()
                        + ", product_version=" + getProductVersion()
                        + ", schema_version=" + getSchemaVersion()
                        + ", timestamp=" + getTimestamp()
                        + "]";
    }

}
//
