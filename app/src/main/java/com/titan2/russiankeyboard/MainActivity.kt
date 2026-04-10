package com.titan2.russiankeyboard

import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.info_text)
        textView.text = """
            Titan2 Russian Keyboard
            
            Установите раскладку клавиатуры:
            1. Откройте Настройки → Система → Язык и ввод
            2. Выберите Физическая клавиатура
            3. Выберите Titan2 Keyboard
            4. Выберите раскладку: Russian (Cyrillic) или Russian (Translit)
        """.trimIndent()
    }
}
