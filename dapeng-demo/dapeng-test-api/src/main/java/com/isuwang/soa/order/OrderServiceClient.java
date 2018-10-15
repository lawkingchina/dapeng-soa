package com.isuwang.soa.order;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.ServiceLoader;
      import com.isuwang.soa.order.OrderServiceCodec.*;
      import com.isuwang.soa.order.service.OrderService;

      /**
       * Autogenerated by Dapeng-Code-Generator (2.1.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class OrderServiceClient implements OrderService{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public OrderServiceClient() {
        this.serviceName = "com.isuwang.soa.order.service.OrderService";
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
            
              public void createOrder(com.isuwang.soa.order.domain.Order order) throws SoaException{

              String methodName = "createOrder";

              createOrder_args createOrder_args = new createOrder_args();
              createOrder_args.setOrder(order);
                

              createOrder_result response = pool.send(serviceName,version,"createOrder",createOrder_args, new CreateOrder_argsSerializer(), new CreateOrder_resultSerializer());

              
                  
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public com.isuwang.soa.order.domain.Order getOrderById(Integer orderId) throws SoaException{

              String methodName = "getOrderById";

              getOrderById_args getOrderById_args = new getOrderById_args();
              getOrderById_args.setOrderId(orderId);
                

              getOrderById_result response = pool.send(serviceName,version,"getOrderById",getOrderById_args, new GetOrderById_argsSerializer(), new GetOrderById_resultSerializer());

              
                  
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
    