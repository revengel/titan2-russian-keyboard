// Объявляем пакет приложения
package com.titan2.russiankeyboard

// Импорт класса Bundle для сохранения состояния Activity
import android.os.Bundle
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
    }
}
