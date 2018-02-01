package com.isuwang.soa.settle;
        import com.isuwang.soa.order.domain.serializer.*;import com.github.dapeng.soa.domain.serializer.*;import com.isuwang.soa.price.domain.serializer.*;import com.isuwang.soa.user.domain.serializer.*;import com.isuwang.soa.settle.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import com.github.dapeng.core.definition.SoaServiceDefinition;
        import com.github.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        import com.isuwang.soa.settle.service.SettleServiceAsync;
        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class SettleServiceAsyncCodec {

        
            public static class createSettle_args {
            
                private com.isuwang.soa.settle.domain.Settle settle;
                public com.isuwang.soa.settle.domain.Settle getSettle(){
                return this.settle;
              }
                public void setSettle(com.isuwang.soa.settle.domain.Settle settle){
                this.settle = settle;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("settle").append("\":").append(this.settle == null ? "null" : this.settle.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class createSettle_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class CreateSettle_argsSerializer implements BeanSerializer<createSettle_args>{
            
      @Override
      public createSettle_args read(TProtocol iprot) throws TException{

      createSettle_args bean = new createSettle_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.isuwang.soa.settle.domain.Settle elem0 = new com.isuwang.soa.settle.domain.Settle();
        elem0=new com.isuwang.soa.settle.domain.serializer.SettleSerializer().read(iprot);
       bean.setSettle(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(createSettle_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createSettle_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("settle", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.settle.domain.Settle elem0 = bean.getSettle();
             new com.isuwang.soa.settle.domain.serializer.SettleSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(createSettle_args bean) throws TException{
      
              if(bean.getSettle() == null)
              throw new SoaException(SoaCode.NotNull, "settle字段不允许为空");
            
                if(bean.getSettle() != null)
                new com.isuwang.soa.settle.domain.serializer.SettleSerializer().validate(bean.getSettle());
              
    }
    

            @Override
            public String toString(createSettle_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class CreateSettle_resultSerializer implements BeanSerializer<createSettle_result>{
            @Override
            public createSettle_result read(TProtocol iprot) throws TException{

              createSettle_result bean = new createSettle_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.VOID){
                    
      com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(createSettle_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createSettle_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(createSettle_result bean) throws TException{
      
    }
    

            @Override
            public String toString(createSettle_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class createSettle<I extends com.isuwang.soa.settle.service.SettleServiceAsync> extends SoaFunctionDefinition.Async<I, createSettle_args, createSettle_result>
            {
              public createSettle()
              {
                super("createSettle", new CreateSettle_argsSerializer(),  new CreateSettle_resultSerializer());
              }

              @Override
              public CompletableFuture<createSettle_result> apply(SettleServiceAsync iface, createSettle_args createSettle_args) throws SoaException
              {

                CompletableFuture<Void> result = (CompletableFuture<Void>) iface.createSettle(createSettle_args.settle ,50000);

                return result.thenApply((Void) -> {
                  createSettle_result res = new createSettle_result();
                  
                  return res;
              });
              }

            }
          
            public static class getSettleById_args {
            
                private Integer settleId;
                public Integer getSettleId(){
                return this.settleId;
              }
                public void setSettleId(Integer settleId){
                this.settleId = settleId;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("settleId").append("\":").append(settleId).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class getSettleById_result {

            
                  private com.isuwang.soa.settle.domain.Settle success;
                  public com.isuwang.soa.settle.domain.Settle getSuccess(){
                  return success;
                }

                  public void setSuccess(com.isuwang.soa.settle.domain.Settle success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class GetSettleById_argsSerializer implements BeanSerializer<getSettleById_args>{
            
      @Override
      public getSettleById_args read(TProtocol iprot) throws TException{

      getSettleById_args bean = new getSettleById_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setSettleId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(getSettleById_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getSettleById_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("settleId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getSettleId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(getSettleById_args bean) throws TException{
      
    }
    

            @Override
            public String toString(getSettleById_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class GetSettleById_resultSerializer implements BeanSerializer<getSettleById_result>{
            @Override
            public getSettleById_result read(TProtocol iprot) throws TException{

              getSettleById_result bean = new getSettleById_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
                    com.isuwang.soa.settle.domain.Settle elem0 = new com.isuwang.soa.settle.domain.Settle();
        elem0=new com.isuwang.soa.settle.domain.serializer.SettleSerializer().read(iprot);
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(getSettleById_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getSettleById_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
            com.isuwang.soa.settle.domain.Settle elem0 = bean.getSuccess();
             new com.isuwang.soa.settle.domain.serializer.SettleSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(getSettleById_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new com.isuwang.soa.settle.domain.serializer.SettleSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(getSettleById_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class getSettleById<I extends com.isuwang.soa.settle.service.SettleServiceAsync> extends SoaFunctionDefinition.Async<I, getSettleById_args, getSettleById_result>
            {
              public getSettleById()
              {
                super("getSettleById", new GetSettleById_argsSerializer(),  new GetSettleById_resultSerializer());
              }

              @Override
              public CompletableFuture<getSettleById_result> apply(SettleServiceAsync iface, getSettleById_args getSettleById_args) throws SoaException
              {

                CompletableFuture<com.isuwang.soa.settle.domain.Settle> result = (CompletableFuture<com.isuwang.soa.settle.domain.Settle>) iface.getSettleById(getSettleById_args.settleId ,50000);

                return result.thenApply(( com.isuwang.soa.settle.domain.Settle i) -> {
                  getSettleById_result res = new getSettleById_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.isuwang.soa.settle.service.SettleServiceAsync> extends SoaFunctionDefinition.Async<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public CompletableFuture<getServiceMetadata_result> apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

           return CompletableFuture.supplyAsync(() -> {
            try (InputStreamReader isr = new InputStreamReader(SettleServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.settle.service.SettleService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          });
          }

        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.isuwang.soa.settle.service.SettleServiceAsync> extends SoaServiceDefinition<com.isuwang.soa.settle.service.SettleServiceAsync>
        {

          public Processor(com.isuwang.soa.settle.service.SettleServiceAsync iface, Class<com.isuwang.soa.settle.service.SettleServiceAsync> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.isuwang.soa.settle.service.SettleServiceAsync> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("createSettle", new createSettle());
              
                processMap.put("getSettleById", new getSettleById());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            return processMap;
          }
        }

      }
      