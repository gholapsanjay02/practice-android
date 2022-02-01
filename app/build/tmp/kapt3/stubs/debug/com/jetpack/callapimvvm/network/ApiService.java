package com.jetpack.callapimvvm.network;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/jetpack/callapimvvm/network/ApiService;", "", "()V", "provideUserRepository", "Lcom/jetpack/callapimvvm/repository/UserRespository;", "api", "Lcom/jetpack/callapimvvm/network/ApiInterface;", "providesUserApi", "app_debug"})
@dagger.Module()
public final class ApiService {
    
    public ApiService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.jetpack.callapimvvm.repository.UserRespository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.jetpack.callapimvvm.network.ApiInterface api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.jetpack.callapimvvm.network.ApiInterface providesUserApi() {
        return null;
    }
}