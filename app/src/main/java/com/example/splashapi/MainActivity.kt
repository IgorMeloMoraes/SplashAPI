package com.example.splashapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)

        // Instalar a tela inicial
        // SetKeepOnScreenCondition - Aponta para a condição da tela para animala
        installSplashScreen().setKeepOnScreenCondition{
            true
        }


        setContentView(R.layout.activity_main)
    }
}