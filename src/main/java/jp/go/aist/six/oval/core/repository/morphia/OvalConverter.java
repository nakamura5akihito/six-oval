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
package jp.go.aist.six.oval.core.repository.morphia;

import jp.go.aist.six.oval.core.model.OvalEnumerationHelper;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.OvalEnumeration;
import jp.go.aist.six.oval.model.aix.FilesetStateEnumeration;
import jp.go.aist.six.oval.model.aix.FixInstallationStatusEnumeration;
import jp.go.aist.six.oval.model.aix.InterimFixStateEnumeration;
import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.common.ClassEnumeration;
import jp.go.aist.six.oval.model.common.DatatypeEnumeration;
import jp.go.aist.six.oval.model.common.ExistenceEnumeration;
import jp.go.aist.six.oval.model.common.FamilyEnumeration;
import jp.go.aist.six.oval.model.common.MessageLevelEnumeration;
import jp.go.aist.six.oval.model.common.OperationEnumeration;
import jp.go.aist.six.oval.model.common.OperatorEnumeration;
import jp.go.aist.six.oval.model.common.RecurseDirectionEnumeration;
import jp.go.aist.six.oval.model.common.RecurseEnumeration;
import jp.go.aist.six.oval.model.common.RecurseFileSystemEnumeration;
import jp.go.aist.six.oval.model.common.WindowsViewEnumeration;
import jp.go.aist.six.oval.model.definitions.ArithmeticEnumeration;
import jp.go.aist.six.oval.model.definitions.DateTimeFormatEnumeration;
import jp.go.aist.six.oval.model.definitions.FilterActionEnumeration;
import jp.go.aist.six.oval.model.definitions.SetOperatorEnumeration;
import jp.go.aist.six.oval.model.independent.EngineEnumeration;
import jp.go.aist.six.oval.model.independent.HashTypeEnumeration;
import jp.go.aist.six.oval.model.independent.LdapBehaviorsEnumeration;
import jp.go.aist.six.oval.model.independent.LdaptypeEnumeration;
import jp.go.aist.six.oval.model.linux.RpmVerifyResultEnumeration;
import jp.go.aist.six.oval.model.macos.PlistTypeEnumeration;
import jp.go.aist.six.oval.model.mitre.DefinitionStatusEnumeration;
import jp.go.aist.six.oval.model.redhat.SeverityEnumeration;
import jp.go.aist.six.oval.model.results.ContentEnumeration;
import jp.go.aist.six.oval.model.results.ResultEnumeration;
import jp.go.aist.six.oval.model.sc.FlagEnumeration;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;
import jp.go.aist.six.oval.model.solaris.SmfProtocolEnumeration;
import jp.go.aist.six.oval.model.solaris.SmfServiceStateEnumeration;
import jp.go.aist.six.oval.model.unix.CapabilityEnumeration;
import jp.go.aist.six.oval.model.unix.EncryptMethodEnumeration;
import jp.go.aist.six.oval.model.unix.EndpointEnumeration;
import jp.go.aist.six.oval.model.unix.GconfTypeEnumeration;
import jp.go.aist.six.oval.model.unix.InterfaceEnumeration;
import jp.go.aist.six.oval.model.unix.RoutingTableFlagsEnumeration;
import jp.go.aist.six.oval.model.unix.WaitStatusEnumeration;
import jp.go.aist.six.oval.model.unix.XinetdTypeStatusEnumeration;
import jp.go.aist.six.oval.model.windows.AddrTypeEnumeration;
import jp.go.aist.six.oval.model.windows.AdstypeEnumeration;
import jp.go.aist.six.oval.model.windows.AuditEnumeration;
import jp.go.aist.six.oval.model.windows.CmdletVerbEnumeration;
import jp.go.aist.six.oval.model.windows.DriveTypeEnumeration;
import jp.go.aist.six.oval.model.windows.FileTypeEnumeration;
import jp.go.aist.six.oval.model.windows.InterfaceTypeEnumeration;
import jp.go.aist.six.oval.model.windows.NamingContextEnumeration;
import jp.go.aist.six.oval.model.windows.PeSubsystemEnumeration;
import jp.go.aist.six.oval.model.windows.PeTargetMachineEnumeration;
import jp.go.aist.six.oval.model.windows.RegistryHiveEnumeration;
import jp.go.aist.six.oval.model.windows.RegistryTypeEnumeration;
import jp.go.aist.six.oval.model.windows.ServiceControlsAcceptedEnumeration;
import jp.go.aist.six.oval.model.windows.ServiceCurrentStateEnumeration;
import jp.go.aist.six.oval.model.windows.ServiceStartTypeEnumeration;
import jp.go.aist.six.oval.model.windows.ServiceTypeEnumeration;
import jp.go.aist.six.oval.model.windows.SharedResourceTypeEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mongodb.morphia.converters.SimpleValueConverter;
import org.mongodb.morphia.converters.TypeConverter;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.MappingException;



/**
 * Morphia type converter for the OVAL model objects.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalConverter.java 3142 2013-05-13 02:20:30Z nakamura5akihito@gmail.com $
 */
public class OvalConverter
    extends TypeConverter
    implements SimpleValueConverter
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalConverter.class );



    private static final Class<?>[]  _SUPPORTED_CLASSES_ = new Class[] {
        // six //
        ComponentType.class,
        ElementType.class,
        Family.class,
//      Platform.class,
//      Product.class

        // aix //
        FilesetStateEnumeration.class,
        FixInstallationStatusEnumeration.class,
        InterimFixStateEnumeration.class,

        // common //
        CheckEnumeration.class,
        ClassEnumeration.class,
        DatatypeEnumeration.class,
        ExistenceEnumeration.class,
        FamilyEnumeration.class,
        MessageLevelEnumeration.class,
        OperationEnumeration.class,
        OperatorEnumeration.class,
        RecurseDirectionEnumeration.class,
        RecurseEnumeration.class,
        RecurseFileSystemEnumeration.class,
        WindowsViewEnumeration.class,

        // definitions //
        ArithmeticEnumeration.class,
        DateTimeFormatEnumeration.class,
        FilterActionEnumeration.class,
        SetOperatorEnumeration.class,

        // independent //
        EngineEnumeration.class,
        HashTypeEnumeration.class,
        LdapBehaviorsEnumeration.class,
        LdaptypeEnumeration.class,

        // linux //
        jp.go.aist.six.oval.model.linux.ProtocolEnumeration.class,
        RpmVerifyResultEnumeration.class,

        // macos //
        jp.go.aist.six.oval.model.macos.PermissionCompareEnumeration.class,
        PlistTypeEnumeration.class,

        // mitre //
        DefinitionStatusEnumeration.class,

        // redhat //
        SeverityEnumeration.class,

        // results
        ContentEnumeration.class,
        ResultEnumeration.class,

        // sc //
        FlagEnumeration.class,
        StatusEnumeration.class,

        // solaris //
        jp.go.aist.six.oval.model.solaris.PermissionCompareEnumeration.class,
        SmfProtocolEnumeration.class,
        SmfServiceStateEnumeration.class,

        // unix //
        CapabilityEnumeration.class,
        EncryptMethodEnumeration.class,
        EndpointEnumeration.class,
        GconfTypeEnumeration.class,
        InterfaceEnumeration.class,
        RoutingTableFlagsEnumeration.class,
        WaitStatusEnumeration.class,
        XinetdTypeStatusEnumeration.class,

        //windows
        AddrTypeEnumeration.class,
        AdstypeEnumeration.class,
        AuditEnumeration.class,
        CmdletVerbEnumeration.class,
        DriveTypeEnumeration.class,
        FileTypeEnumeration.class,
        InterfaceTypeEnumeration.class,
        NamingContextEnumeration.class,
        PeSubsystemEnumeration.class,
        PeTargetMachineEnumeration.class,
        jp.go.aist.six.oval.model.windows.ProtocolEnumeration.class,
        RegistryHiveEnumeration.class,
        RegistryTypeEnumeration.class,
        ServiceControlsAcceptedEnumeration.class,
        ServiceCurrentStateEnumeration.class,
        ServiceStartTypeEnumeration.class,
        ServiceTypeEnumeration.class,
        SharedResourceTypeEnumeration.class
    };



    /**
     * Constructor.
     */
    public OvalConverter()
    {
        super( _SUPPORTED_CLASSES_ );
    }



    //*********************************************************************
    //  TypeConverter
    //*********************************************************************

    // Object (Java) --> simple value (Mongo)
    @Override
    public Object encode(
                    final Object object,
                    final MappedField optionalExtraInfo
                    )
    {
        if (object == null) {
            return null;
        }

        if (object instanceof OvalEnumeration) {
            return OvalEnumeration.class.cast( object ).value();
//        } else if (object instanceof NameEntity) {
//            return NameEntity.class.cast( object ).getName();
        }

        throw new MappingException( "unsupported type: "
                        + String.valueOf( object.getClass() ) );
    }



    // simple value (Mongo) --> Object (Java)
    @Override
    public Object decode(
                    @SuppressWarnings( "rawtypes" ) final Class targetClass,
                    final Object fromDBObject,
                    final MappedField optionalExtraInfo
                    )
    {
        _LOG_.trace( "target class: " + targetClass );
        if (fromDBObject == null) {
            return null;
        }

        if (OvalEnumeration.class.isAssignableFrom( targetClass )) {
            @SuppressWarnings( "unchecked" )
            Class<? extends OvalEnumeration>  enumClass =
                targetClass.asSubclass( OvalEnumeration.class );
            return OvalEnumerationHelper.fromValue( enumClass, fromDBObject.toString() );

//        } else if (NameEntity.class.isAssignableFrom( targetClass )) {
//            @SuppressWarnings( "unchecked" )
//            Class<? extends NameEntity>  nameClass =
//                targetClass.asSubclass( NameEntity.class );
//            return nameFromValue( nameClass, fromDBObject.toString() );
        }

        throw new MappingException( "unsupported type: "
                        + String.valueOf( targetClass ) );
    }



//  //**************************************************************
//  //  supporting NameEntity
//  //**************************************************************
//
//  /**
//   */
//  public static Object nameFromValue(
//                  final Class<? extends NameEntity> targetClass,
//                  final String name
//                  )
//  {
//      NameEntity  obj = null;
//
//      try {
//          obj = targetClass.newInstance();
//      } catch (Exception ex) {
//          _LOG_.error( ex.getMessage() );
//          throw new MappingException( ex.getMessage() );
//      }
//
//      obj.setName( name );
//      return obj;
//  }

}
//

