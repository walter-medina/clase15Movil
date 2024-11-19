package com.sena.introducctionjetpackcompose.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class LoginViewModel:ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var loginError by mutableStateOf("")

    // Lógica de validación
    fun onLogin(navController: NavController, onError: (String) -> Unit) {
        if (email == "walter.medina@gmail.com" && password == "123456") {
            navController.navigate("home")
        } else {
            loginError = "Email o contraseña incorrectos"
            onError(loginError) // Llamar al callback para mostrar el Toast
        }
    }
}