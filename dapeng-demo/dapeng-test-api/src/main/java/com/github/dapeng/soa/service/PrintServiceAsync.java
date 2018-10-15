
        package com.github.dapeng.soa.service;

        import com.github.dapeng.core.Processor;
        import com.github.dapeng.core.Service;
        import com.github.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name="com.github.dapeng.soa.service.PrintService",version = "1.0.0")
        @Processor(className = "com.github.dapeng.soa.PrintServiceAsyncCodec$Processor")
        public interface PrintServiceAsync  extends com.github.dapeng.core.definition.AsyncService {
        
            /**
            * 
            **/
            
            
              Future<Void> print() throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<String> printInfo( com.github.dapeng.soa.domain.Info info) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<String> printInfo2( String name) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<String> printInfo3() throws com.github.dapeng.core.SoaException;
            
          
      }
      