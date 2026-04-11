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

            Подключите клавиатуру и выберите
            раскладку Russian (Translit):

            Настройки → Язык и ввод →
            Физическая клавиатура → Translit

            ┌────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
            │ Q  │ W  │ E  │ R  │ T  │ Y  │ U  │ I  │ O  │ P  │
            │ я  │ ш  │ е  │ р  │ т  │ ы  │ у  │ и  │ о  │ п  │
            │    │ щ  │ э  │    │    │    │ ю  │ й  │    │    │
            ├────┼────┼────┼────┼────┼────┼────┼────┼────┴────┤
            │ A  │ S  │ D  │ F  │ G  │ H  │ J  │ K  │    L    │
            │ а  │ с  │ д  │ ф  │ г  │ ч  │ ь  │ к  │    л    │
            │    │    │    │    │    │    │ ъ  │    │         │
            ├────┼────┼────┼────┼────┼────┼────┴────┬────┬────┤
            │ Z  │ X  │ C  │ V  │ B  │ N  │    M    │    │    │
            │ з  │ х  │ ц  │ в  │ б  │ н  │    м    │    │    │
            │ ж  │    │    │    │    │    │         │    │    │
            └────┴────┴────┴────┴────┴────┴─────────┴────┴────┘

            Sym — доп. буквы (щ, э, ю, й, ъ, ж)
            Shift+Sym — заглавные
        """.trimIndent()
    }
}
