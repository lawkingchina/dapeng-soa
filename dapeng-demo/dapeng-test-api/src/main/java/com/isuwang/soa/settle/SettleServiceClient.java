package com.isuwang.soa.settle;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.isuwang.soa.settle.SettleServiceCodec.*;
      import com.isuwang.soa.settle.service.SettleService;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class SettleServiceClient implements SettleService{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public SettleServiceClient() {
        this.serviceName = "com.isuwang.soa.settle.service.SettleService";
        this.version = "1.0.0";

        ServiceLoader<SoaConnectionPoolFactory> factories = ServiceLoader.load(SoaConnectionPoolFactory.class);
        for (SoaConnectionPoolFactory factory: factories) {
          this.pool = factory.getPool();
          break;
        }
        this.pool.registerClientInfo(serviceName,version);
      }

      
          
            /**
            * 
            **/
            
              public void createSettle(com.isuwang.soa.settle.domain.Settle settle) throws SoaException{

              String methodName = "createSettle";

              createSettle_args createSettle_args = new createSettle_args();
              createSettle_args.setSettle(settle);
                

              createSettle_result response = pool.send(serviceName,version,"createSettle",createSettle_args, new CreateSettle_argsSerializer(), new CreateSettle_resultSerializer());

              
                  
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public com.isuwang.soa.settle.domain.Settle getSettleById(Integer settleId) throws SoaException{

              String methodName = "getSettleById";

              getSettleById_args getSettleById_args = new getSettleById_args();
              getSettleById_args.setSettleId(settleId);
                

              getSettleById_result response = pool.send(serviceName,version,"getSettleById",getSettleById_args, new GetSettleById_argsSerializer(), new GetSettleById_resultSerializer());

              
                  
                      return response.getSuccess();
                    
                
            }
            
          

        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        String methodName = "getServiceMetadata";
        getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
        getServiceMetadata_result response = pool.send(serviceName,version,methodName,getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        return response.getSuccess();
      }

    }
    