package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    public void fridgeAlgorithm(@org.jetbrains.annotations.NotNull Fridge fridge) {
        fridge.open(); // Открыть холодильник
        fridge.getMilk();// Взять молоко
        fridge.close();
    }
}
