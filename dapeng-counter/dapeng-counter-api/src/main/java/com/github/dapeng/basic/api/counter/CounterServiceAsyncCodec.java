package com.github.dapeng.basic.api.counter;
        import com.github.dapeng.basic.api.counter.domain.serializer.*;

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
        import com.github.dapeng.basic.api.counter.CounterServiceSuperCodec.*;

        import com.github.dapeng.basic.api.counter.service.CounterServiceAsync;
        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.1-final)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class CounterServiceAsyncCodec {

        

            public static class submitPoint<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaFunctionDefinition.Async<I, submitPoint_args, submitPoint_result>
            {
              public submitPoint()
              {
                super("submitPoint", new SubmitPoint_argsSerializer(),  new SubmitPoint_resultSerializer());
              }

              @Override
              public CompletableFuture<submitPoint_result> apply(CounterServiceAsync iface, submitPoint_args submitPoint_args) throws SoaException
              {
                CompletableFuture<Void> result = (CompletableFuture<Void>) iface.submitPoint(submitPoint_args.getDataPoint());
                return result.thenApply((Void) -> {
                  submitPoint_result res = new submitPoint_result();
                  
                  return res;
              });
              }

            }
          

            public static class submitPoints<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaFunctionDefinition.Async<I, submitPoints_args, submitPoints_result>
            {
              public submitPoints()
              {
                super("submitPoints", new SubmitPoints_argsSerializer(),  new SubmitPoints_resultSerializer());
              }

              @Override
              public CompletableFuture<submitPoints_result> apply(CounterServiceAsync iface, submitPoints_args submitPoints_args) throws SoaException
              {
                CompletableFuture<Void> result = (CompletableFuture<Void>) iface.submitPoints(submitPoints_args.getDataPoints());
                return result.thenApply((Void) -> {
                  submitPoints_result res = new submitPoints_result();
                  
                  return res;
              });
              }

            }
          

            public static class queryPoints<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaFunctionDefinition.Async<I, queryPoints_args, queryPoints_result>
            {
              public queryPoints()
              {
                super("queryPoints", new QueryPoints_argsSerializer(),  new QueryPoints_resultSerializer());
              }

              @Override
              public CompletableFuture<queryPoints_result> apply(CounterServiceAsync iface, queryPoints_args queryPoints_args) throws SoaException
              {
                CompletableFuture<java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint>> result = (CompletableFuture<java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint>>) iface.queryPoints(queryPoints_args.getCondition(),queryPoints_args.getBeginTimeStamp(),queryPoints_args.getEndTimeStamp());
                return result.thenApply(( java.util.List<com.github.dapeng.basic.api.counter.domain.DataPoint> i) -> {
                  queryPoints_result res = new queryPoints_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          

        public static class getServiceMetadata<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaFunctionDefinition.Async<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public CompletableFuture<getServiceMetadata_result> apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

            //fake async method, to avoid using the JDK default ForkJoinPool.common, which will case heap-off OOM
            CompletableFuture<getServiceMetadata_result> resultFuture = new CompletableFuture<>();

            try (InputStreamReader isr = new InputStreamReader(CounterServiceCodec.class.getClassLoader().getResourceAsStream("com.github.dapeng.basic.api.counter.service.CounterService.xml"));
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
              result.setSuccess(str.toString());
            } catch (Exception e) {
              e.printStackTrace();
              result.setSuccess("");
            }
            resultFuture.complete(result);
            return resultFuture;
          }

        }

        public static class echo<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaFunctionDefinition.Async<I, echo_args, echo_result> {
          public echo() {
            super("echo", new echo_argsSerializer(), new echo_resultSerializer());
          }

          @Override
          public CompletableFuture<echo_result> apply(I iface, echo_args args) {
            echo_result result = new echo_result();
            CompletableFuture<echo_result> resultFuture = new CompletableFuture<>();

            String echoMsg = (String) TransactionContext.Factory.currentInstance().getAttribute("container-threadPool-info");
            result.setSuccess(echoMsg);
            //result.setSuccess("PONG");
            resultFuture.complete(result);
            return resultFuture;
          }

        }




        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> extends SoaServiceDefinition<com.github.dapeng.basic.api.counter.service.CounterServiceAsync>
        {

          public Processor(com.github.dapeng.basic.api.counter.service.CounterServiceAsync iface, Class<com.github.dapeng.basic.api.counter.service.CounterServiceAsync> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.github.dapeng.basic.api.counter.service.CounterServiceAsync> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("submitPoint", new submitPoint());
              
                processMap.put("submitPoints", new submitPoints());
              
                processMap.put("queryPoints", new queryPoints());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            processMap.put("echo", new echo());
            return processMap;
          }
        }

      }
      