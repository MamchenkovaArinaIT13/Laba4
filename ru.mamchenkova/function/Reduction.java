package ru.mamchekova.function;

public interface Reduction<T> {
    T reduce(T accumulator, T current);
}
