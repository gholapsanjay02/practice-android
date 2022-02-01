package com.jetpack.callapimvvm.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/jetpack/callapimvvm/viewmodel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userRespository", "Lcom/jetpack/callapimvvm/repository/UserRespository;", "(Lcom/jetpack/callapimvvm/repository/UserRespository;)V", "_getUserData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/jetpack/callapimvvm/model/UserResponse;", "getUserData", "Landroidx/lifecycle/LiveData;", "getGetUserData", "()Landroidx/lifecycle/LiveData;", "setGetUserData", "(Landroidx/lifecycle/LiveData;)V", "isLoading", "Landroidx/compose/runtime/MutableState;", "", "()Landroidx/compose/runtime/MutableState;", "setLoading", "(Landroidx/compose/runtime/MutableState;)V", "Lcom/jetpack/callapimvvm/utils/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final com.jetpack.callapimvvm.repository.UserRespository userRespository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.jetpack.callapimvvm.model.UserResponse>> _getUserData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.jetpack.callapimvvm.model.UserResponse>> getUserData;
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.jetpack.callapimvvm.repository.UserRespository userRespository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jetpack.callapimvvm.model.UserResponse>> getGetUserData() {
        return null;
    }
    
    public final void setGetUserData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.jetpack.callapimvvm.model.UserResponse>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jetpack.callapimvvm.utils.Resource<java.util.List<com.jetpack.callapimvvm.model.UserResponse>>> p0) {
        return null;
    }
}