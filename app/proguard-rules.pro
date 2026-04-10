# ========================================
# Правила ProGuard (proguard-rules.pro)
# ========================================
#
# ProGuard — инструмент обфускации и уменьшения кода.
# Эти правила указывают, какие классы НЕ обфусцировать.
# ========================================

# Сохранять аннотации и сигнатуры (нужны для сериализации)
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod

# Сохранять native-методы (вызываются из C/C++)
-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}
