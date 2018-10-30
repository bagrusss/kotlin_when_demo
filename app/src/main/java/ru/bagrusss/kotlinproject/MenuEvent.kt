package ru.bagrusss.kotlinproject

/**
 * Created by bagrusss on 28.09.2018
 */
class MenuEvent (
        @JvmField val type: MenuEventType,
        @JvmField val data: Any
)

enum class MenuEventType {
    OPTIONS,
    OVERLAY
}