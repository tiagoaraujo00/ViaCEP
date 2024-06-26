package com.tiagoaraujo00.viacep.features.form.viewmodel

import androidx.lifecycle.ViewModel
import com.tiagoaraujo00.viacep.features.form.action.FormAction
import com.tiagoaraujo00.viacep.features.form.state.FormState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class FormViewModel: ViewModel() {
    private val _state = MutableStateFlow(FormState())
    var state: StateFlow<FormState> = _state

    init {

    }

    fun action(action: FormAction) {

    }
}