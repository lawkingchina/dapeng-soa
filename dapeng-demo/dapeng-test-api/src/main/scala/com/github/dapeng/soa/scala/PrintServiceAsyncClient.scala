package com.github.dapeng.soa.scala

        import com.github.dapeng.core._;
        import com.github.dapeng.org.apache.thrift._;
        import java.util.ServiceLoader;
        import java.util.concurrent.CompletableFuture;
        import com.github.dapeng.soa.scala.PrintServiceAsyncCodec._;
        import com.github.dapeng.soa.scala.service.PrintServiceAsync;
        import scala.concurrent.duration._
        import scala.concurrent.{Future, Promise}
        import scala.concurrent.ExecutionContext.Implicits.global

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        class PrintServiceAsyncClient extends PrintServiceAsync {

        val serviceName = "com.github.dapeng.soa.service.PrintService"
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
        *  java CompletableFuture => scala Future common function
        */
        def toScala[T,R](response: CompletableFuture[T])(extractor: T => R): Future[R] = {

          val promise = Promise[R]()
          response.whenComplete((res: T, ex) => {
            if (ex != null) promise.failure(ex)
            else promise.success(extractor(res))
          })
          promise.future
        }


        

            /**
            * 
            **/
            def print() : Future[Unit] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "print",
            print_args(),
            new Print_argsSerializer(),
            new Print_resultSerializer() ).asInstanceOf[CompletableFuture[print_result]]

            toScala(response)(null)

          }

          

            /**
            * 
            **/
            def printInfo(info:com.github.dapeng.soa.scala.domain.Info ) : Future[String] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "printInfo",
            printInfo_args(info),
            new PrintInfo_argsSerializer(),
            new PrintInfo_resultSerializer() ).asInstanceOf[CompletableFuture[printInfo_result]]

            toScala(response)(_.success)

          }

          

            /**
            * 
            **/
            def printInfo2(name:String ) : Future[String] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "printInfo2",
            printInfo2_args(name),
            new PrintInfo2_argsSerializer(),
            new PrintInfo2_resultSerializer() ).asInstanceOf[CompletableFuture[printInfo2_result]]

            toScala(response)(_.success)

          }

          

            /**
            * 
            **/
            def printInfo3() : Future[String] = {

            val response = pool.sendAsync(
            serviceName,
            version,
            "printInfo3",
            printInfo3_args(),
            new PrintInfo3_argsSerializer(),
            new PrintInfo3_resultSerializer() ).asInstanceOf[CompletableFuture[printInfo3_result]]

            toScala(response)(_.success)

          }

          
      }
      