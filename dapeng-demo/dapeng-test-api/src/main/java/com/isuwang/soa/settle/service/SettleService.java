
      package com.isuwang.soa.settle.service;

      import com.github.dapeng.core.Processor;
      import com.github.dapeng.core.Service;
      import com.github.dapeng.core.SoaGlobalTransactional;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      * 
      **/
      @Service(name="com.isuwang.soa.settle.service.SettleService",version = "1.0.0")
      @Processor(className = "com.isuwang.soa.settle.SettleServiceCodec$Processor")
      public interface SettleService {
      
          /**
          * 
          **/
          
             
             void createSettle( com.isuwang.soa.settle.domain.Settle settle) throws com.github.dapeng.core.SoaException;
            
        
          /**
          * 
          **/
          
             
             com.isuwang.soa.settle.domain.Settle getSettleById( Integer settleId) throws com.github.dapeng.core.SoaException;
            
        
      }
      