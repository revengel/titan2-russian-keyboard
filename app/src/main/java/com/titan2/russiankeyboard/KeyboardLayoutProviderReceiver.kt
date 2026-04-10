// Объявляем пакет приложения
package com.titan2.russiankeyboard

// BroadcastReceiver — класс для получения системных широковещательных сообщений
import android.content.BroadcastReceiver
// Context — доступ к системным сервисам Android
import android.content.Context
// Intent — сообщение, которое отправляется системой
import android.content.Intent

/**
 * Приёмник системного запроса QUERY_KEYBOARD_LAYOUTS.
 *
 * Когда пользователь подключает физическую клавиатуру,
 * система Android отправляет этот Intent. Android читает
 * meta-data из AndroidManifest.xml и находит список
 * раскладок, описанных в XML-файле (res/xml/keyboard_layouts.xml).
 *
 * Логика в onReceive() не нужна — система автоматически
 * читает мета-данные из манифеста.
 */
class KeyboardLayoutProviderReceiver : BroadcastReceiver() {

    /**
     * Вызывается при получении широковещательного сообщения.
     * В данном случае просто заглушка — Android сам читает
     * meta-data из манифеста, не вызывая этот метод.
     */
    override fun onReceive(context: Context, intent: Intent) {
        // Система автоматически читает meta-data из манифеста.
        // Этот метод вызывается, но не требует действий.
    }
}
