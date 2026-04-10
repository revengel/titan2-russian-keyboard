package com.titan2.russiankeyboard

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.info_text)
        textView.text = """
            Titan2 Russian Keyboard
            
            Раскладки установлены!
            
            Как использовать:
            1. Подключите физическую клавиатуру
            2. Откройте Настройки → Система → Язык и ввод
            3. Выберите Физическая клавиатура
            4. Выберите вашу клавиатуру
            5. Выберите раскладку:
               • Russian (Standard ЙЦУКЕН)
               • Russian (Translit)
        """.trimIndent()
    }
}
