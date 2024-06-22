package com.tiagoaraujo00.viacep.features.home.viewmodel

import androidx.lifecycle.ViewModel
import com.tiagoaraujo00.viacep.features.form.action.FormAction
import com.tiagoaraujo00.viacep.features.home.state.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel: ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    var state: StateFlow<HomeState> = _state

    init {

    }

    fun action(action: FormAction) {

    }
}