/*
 * Copyright (c) 2017 - 2018 Hiraishin Software. All Rights Reserved.
 */

package com.hiraishin.rain.entity.spawner;

import com.hiraishin.rain.entity.item.Energy;
import com.hiraishin.rain.level.Level;

public class EnergySpawner extends Spawner {

    public EnergySpawner(double x, double y, double width, double height, Level level, int rate,
                         int variation, int count) {
        super(x, y, width, height, level, rate, variation, count);
    }

    @Override
    public void spawn() {
        this.level.add(new Energy(getRandomX(), getRandomY(), this.level));
    }

}
