// Объявляем пакет приложения
package com.titan2.russiankeyboard

// Импорт класса Bundle для сохранения состояния Activity
import android.os.Bundle
// Импорт TextView для отображения текста на экране
import android.widget.TextView
// Импорт базового класса Activity с поддержкой Material Design
import androidx.appcompat.app.AppCompatActivity

// Главный экран приложения — показывает инструкцию по установке раскладки
class MainActivity : AppCompatActivity() {

    // Вызывается при создании Activity — здесь инициализируем UI
    override fun onCreate(savedInstanceState: Bundle?) {
        // Вызываем родительский метод (обязательно)
        super.onCreate(savedInstanceState)

        // Устанавливаем XML-шаблон экрана (res/layout/activity_main.xml)
        setContentView(R.layout.activity_main)

        // Находим TextView по ID из XML-шаблона
        val textView = findViewById<TextView>(R.id.info_text)

        // Устанавливаем текст с инструкцией
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
