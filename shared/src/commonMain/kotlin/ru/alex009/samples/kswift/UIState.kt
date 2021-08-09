package ru.alex009.samples.kswift

sealed interface UIState<out T> {
    object Loading : UIState<Nothing>
    object Empty : UIState<Nothing>
    data class Data<T>(val value: T) : UIState<T>
    data class Error(val throwable: Throwable) : UIState<Nothing>
}
