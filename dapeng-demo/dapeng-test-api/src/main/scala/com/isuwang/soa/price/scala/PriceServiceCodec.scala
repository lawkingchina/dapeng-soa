package com.isuwang.soa.price.scala
        import com.isuwang.soa.user.scala.domain.serializer._;import com.isuwang.soa.price.scala.domain.serializer._;import com.isuwang.soa.order.scala.domain.serializer._;import com.github.dapeng.soa.scala.domain.serializer._;import com.isuwang.soa.settle.scala.domain.serializer._;

        import com.github.dapeng.core._
        import com.github.dapeng.org.apache.thrift._
        import com.github.dapeng.org.apache.thrift.protocol._
        import com.github.dapeng.core.definition._

        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.0)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        object PriceServiceCodec {

        
            case class insertPrice_args(price:com.isuwang.soa.price.scala.domain.Price)

            case class insertPrice_result()

            class InsertPrice_argsSerializer extends BeanSerializer[insertPrice_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): insertPrice_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var price: com.isuwang.soa.price.scala.domain.Price = null
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT => price = 
          new com.isuwang.soa.price.scala.domain.serializer.PriceSerializer().read(iprot)
        
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = insertPrice_args(price = price)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: insertPrice_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("insertPrice_args"))

      
            {
            val elem0 = bean.price 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("price", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
            
          new com.isuwang.soa.price.scala.domain.serializer.PriceSerializer().write(elem0, oprot)
        
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: insertPrice_args): Unit = {
      
              if(bean.price == null)
              throw new SoaException(SoaCode.NotNull, "price字段不允许为空")
            
                if(bean.price != null)
                new com.isuwang.soa.price.scala.domain.serializer.PriceSerializer().validate(bean.price)
              
    }
    

            override def toString(bean: insertPrice_args): String = if(bean == null)  "null" else bean.toString
            }

            class InsertPrice_resultSerializer extends BeanSerializer[insertPrice_result]{

            @throws[TException]
            override def read(iprot: TProtocol): insertPrice_result = {

              var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              

              while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.github.dapeng.org.apache.thrift.protocol.TType.VOID =>  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = insertPrice_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: insertPrice_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("insertPrice_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: insertPrice_result): Unit = {
      
    }
    

            override def toString(bean: insertPrice_result): String = if(bean == null)  "null" else bean.toString
          }

            class insertPrice extends SoaFunctionDefinition.Sync[com.isuwang.soa.price.scala.service.PriceService, insertPrice_args, insertPrice_result]("insertPrice", new InsertPrice_argsSerializer(), new InsertPrice_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.price.scala.service.PriceService, args: insertPrice_args):insertPrice_result = {

              val _result = iface.insertPrice(args.price)
              insertPrice_result( )
            }
          }
          
            case class getPrices_args()

            case class getPrices_result(success:List[com.isuwang.soa.price.scala.domain.Price])

            class GetPrices_argsSerializer extends BeanSerializer[getPrices_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): getPrices_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = getPrices_args()
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: getPrices_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getPrices_args"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: getPrices_args): Unit = {
      
    }
    

            override def toString(bean: getPrices_args): String = if(bean == null)  "null" else bean.toString
            }

            class GetPrices_resultSerializer extends BeanSerializer[getPrices_result]{

            @throws[TException]
            override def read(iprot: TProtocol): getPrices_result = {

              var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : List[com.isuwang.soa.price.scala.domain.Price] = List.empty

              while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.github.dapeng.org.apache.thrift.protocol.TType.LIST =>  success = {
        val _list0 : com.github.dapeng.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {
          new com.isuwang.soa.price.scala.domain.serializer.PriceSerializer().read(iprot)
        }).toList
        iprot.readListEnd
        _result0
        }
                          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = getPrices_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: getPrices_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getPrices_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.LIST, 0.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.github.dapeng.org.apache.thrift.protocol.TList(com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, elem0.size))
        elem0.foreach(elem1 => {
          new com.isuwang.soa.price.scala.domain.serializer.PriceSerializer().write(elem1, oprot)
        })
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: getPrices_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空")
            
    }
    

            override def toString(bean: getPrices_result): String = if(bean == null)  "null" else bean.toString
          }

            class getPrices extends SoaFunctionDefinition.Sync[com.isuwang.soa.price.scala.service.PriceService, getPrices_args, getPrices_result]("getPrices", new GetPrices_argsSerializer(), new GetPrices_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.price.scala.service.PriceService, args: getPrices_args):getPrices_result = {

              val _result = iface.getPrices()
              getPrices_result(_result )
            }
          }
          

        case class getServiceMetadata_args()

        case class getServiceMetadata_result(success: String)

        class GetServiceMetadata_argsSerializer extends BeanSerializer[getServiceMetadata_args] {

          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_args = {

            iprot.readStructBegin

            var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null

            while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              iprot.readFieldEnd
            }

            iprot.readStructEnd

            val bean = getServiceMetadata_args()
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_args, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"))

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_args): Unit = {}

          override def toString(bean: getServiceMetadata_args): String = if (bean == null) "null" else bean.toString
        }



        class GetServiceMetadata_resultSerializer extends BeanSerializer[getServiceMetadata_result] {
          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_result = {
            iprot.readStructBegin

            var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null

            var success: String = null

            while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin

              schemeField.id match {
                case 0 =>
                schemeField.`type` match {
                  case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => success = iprot.readString
                  case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }
                case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              }
              iprot.readFieldEnd
            }

            iprot.readStructEnd
            val bean = getServiceMetadata_result(success)
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_result, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"))

            oproto.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 0.asInstanceOf[Short]))
            oproto.writeString(bean.success)
            oproto.writeFieldEnd

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_result): Unit = {
            if (bean.success == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空")
          }

          override def toString(bean: getServiceMetadata_result): String = if (bean == null) "null" else bean.toString

        }



  class getServiceMetadata extends SoaFunctionDefinition.Sync[com.isuwang.soa.price.scala.service.PriceService, getServiceMetadata_args, getServiceMetadata_result](
  "getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer()) {


      @throws[TException]
      override def apply(iface: com.isuwang.soa.price.scala.service.PriceService, args: getServiceMetadata_args): getServiceMetadata_result = {

              val source = scala.io.Source.fromInputStream(PriceServiceCodec.getClass.getClassLoader.getResourceAsStream("com.isuwang.soa.price.service.PriceService.xml"))
              val success = source.mkString
              source.close
              getServiceMetadata_result(success)

      }
      }

      class Processor(iface: com.isuwang.soa.price.scala.service.PriceService, ifaceClass: Class[com.isuwang.soa.price.scala.service.PriceService] ) extends
        SoaServiceDefinition(iface,classOf[com.isuwang.soa.price.scala.service.PriceService], Processor.getProcessMap)

        object Processor{

          type PF = SoaFunctionDefinition[com.isuwang.soa.price.scala.service.PriceService, _, _]

          def getProcessMap(): java.util.Map[String, PF] = {
             val map = new java.util.HashMap[String, PF]()
            map.put("insertPrice", new insertPrice)
              map.put("getPrices", new getPrices)
              
            map.put("getServiceMetadata", new getServiceMetadata)
            map
          }

        }
        }
      