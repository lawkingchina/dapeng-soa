package com.github.dapeng.doc;


import com.github.dapeng.core.InvocationContextImpl;
import com.github.dapeng.core.helper.DapengUtil;
import com.github.dapeng.core.helper.IPUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author yuand
 * @date 2018/3/21
 */
public class ServiceInvocationProxy implements InvocationContextImpl.InvocationContextProxy {

    public void init() {
        InvocationContextImpl.Factory.setInvocationContextProxy(this);
    }

    public void destroy() {
    }

    @Override
    public Optional<String> callerMid() {
        return Optional.of("documentSite");
    }

    @Override
    public Map<String, String> cookies() {
        return new HashMap<>(16);
    }

    @Override
    public Optional<Long> userId() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> operatorId() {
        return Optional.empty();
    }

    @Override
    public Optional<String> operatorName() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> customerId() {
        return Optional.empty();
    }

    @Override
    public Optional<String> customerName() {
        return Optional.empty();
    }

    @Override
    public Optional<String> callerFrom() {
        return Optional.empty();
    }

    @Override
    public Optional<String> sessionId() {
        return Optional.empty();
    }

    @Override
    public Optional<String> sessionTid() {
        return Optional.of(DapengUtil.generateTid());
    }

    @Override
    public Optional<String> userIp() {
        return Optional.ofNullable(IPUtils.localIp());
    }
}

