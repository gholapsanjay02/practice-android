package com.jetpack.callapimvvm.repository;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/jetpack/callapimvvm/repository/UserRespository;", "", "apiInterface", "Lcom/jetpack/callapimvvm/network/ApiInterface;", "(Lcom/jetpack/callapimvvm/network/ApiInterface;)V", "getUserResponse", "Lcom/jetpack/callapimvvm/utils/Resource;", "", "Lcom/jetpack/callapimvvm/model/UserResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRespository {
    private final com.jetpack.callapimvvm.network.ApiInterface apiInterface = null;
    
    @javax.inject.Inject()
    public UserRespository(@org.jetbrains.annotations.NotNull()
    com.jetpack.callapimvvm.network.ApiInterface apiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserResponse(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jetpack.callapimvvm.utils.Resource<java.util.List<com.jetpack.callapimvvm.model.UserResponse>>> p0) {
        return null;
    }
}