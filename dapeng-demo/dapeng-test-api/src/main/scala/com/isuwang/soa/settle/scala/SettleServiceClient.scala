package com.isuwang.soa.settle.scala

        import com.github.dapeng.core._;
        import com.github.dapeng.org.apache.thrift._;
        import java.util.ServiceLoader;
        import com.isuwang.soa.settle.scala.SettleServiceCodec._;
        import com.isuwang.soa.settle.scala.service.SettleService;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        class SettleServiceClient extends SettleService {

        import java.util.function.{ Function ⇒ JFunction, Predicate ⇒ JPredicate, BiPredicate }
        implicit def toJavaFunction[A, B](f: Function1[A, B]) = new JFunction[A, B] {
          override def apply(a: A): B = f(a)
        }

        val serviceName = "com.isuwang.soa.settle.service.SettleService"
        val version = "1.0.0"
        val pool = {
          val serviceLoader = ServiceLoader.load(classOf[SoaConnectionPoolFactory])
          if (serviceLoader.iterator().hasNext) {
            val poolImpl = serviceLoader.iterator().next().getPool
            poolImpl.registerClientInfo(serviceName,version)
            poolImpl
          } else null
        }

        def getServiceMetadata: String = {
          pool.send(
          serviceName,
          version,
          "getServiceMetadata",
          new getServiceMetadata_args,
          new GetServiceMetadata_argsSerializer,
          new GetServiceMetadata_resultSerializer
          ).success
        }


        
            /**
            * 
            **/
            def createSettle(settle:com.isuwang.soa.settle.scala.domain.Settle ) : Unit = {

            val response = pool.send(
            serviceName,
            version,
            "createSettle",
            createSettle_args(settle),
            new CreateSettle_argsSerializer(),
            new CreateSettle_resultSerializer())

            

          }
          
            /**
            * 
            **/
            def getSettleById(settleId:Int ) : com.isuwang.soa.settle.scala.domain.Settle = {

            val response = pool.send(
            serviceName,
            version,
            "getSettleById",
            getSettleById_args(settleId),
            new GetSettleById_argsSerializer(),
            new GetSettleById_resultSerializer())

            response.success

          }
          
      }
      