// Объявляем пакет приложения
package com.titan2.russiankeyboard

// Импорт класса Bundle для сохранения состояния Activity
import android.os.Bundle
// Импорт базового класса Activity с поддержкой Material Design
import androidx.appcompat.app.AppCompatActivity

// Главный экран приложения — показывает раскладку и инструкцию
class MainActivity : AppCompatActivity() {

    // Вызывается при создании Activity — загружаем XML-шаблон
    override fun onCreate(savedInstanceState: Bundle?) {
        // Вызываем родительский метод (обязательно)
        super.onCreate(savedInstanceState)

        // Загружаем XML-шаблон с таблицей клавиш (res/layout/activity_main.xml)
        setContentView(R.layout.activity_main)
    }
}
