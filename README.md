# Titan2 Russian Keyboard

Android-приложение с KCM-раскладкой для физической клавиатуры [Titan 2](https://www.unihertz.com/ru-ru/products/titan-2).

## Что внутри

Одна раскладка — **Russian (Translit)**. Фонетическое соответствие
английских клавиш русским буквам.

### Основная раскладка

| Q | W | E | R | T | Y | U | I | O | P |
|---|---|---|---|---|---|---|---|---|---|
| я | ш | е | р | т | ы | у | и | о | п |

| A | S | D | F | G | H | J | K | L |
|---|---|---|---|---|---|---|---|---|
| а | с | д | ф | г | ч | ь | к | л |

| Z | X | C | V | B | N | M |
|---|---|---|---|---|---|---|
| з | х | ц | в | б | н | м |

### Sym — дополнительные буквы

| W | E | U | I | J | Z |
|---|---|---|---|---|---|
| щ | э | ю | й | ъ | ж |

Shift+Sym — заглавные.

## Установка

1. Скачайте APK из [Releases](https://github.com/revengel/titan2-russian-keyboard/releases)
2. Установите APK на устройство:

   **Через ADB (с компьютера):**

   ```bash
   adb install Titan2RussianKeyboard-0.1.15-release.apk
   ```

   **Вручную:** скопируйте APK на телефон, откройте через файловый
   менеджер и разрешите установку неизвестных приложений.

3. Откройте **Настройки → Система → Язык и ввод → Физическая клавиатура**
4. Выберите вашу клавиатуру → **Russian (Translit)**

## Сборка

```bash
git clone https://github.com/revengel/titan2-russian-keyboard.git
cd titan2-russian-keyboard
gradle assembleRelease
```

APK появится в `app/build/outputs/apk/release/`.
