/*
 * Copyright (c) Sasha Stevens (2017 - 2018)
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.sasha.asuna.mod.waypoint;

import com.sasha.asuna.mod.AsunaMod;

import java.io.Serializable;

public class Waypoint implements Serializable {

    /**
     * Must use objects cuz serialisation
     */
    private Integer x;
    private Integer y;
    private Integer z;
    private Integer dim;
    private Boolean doesRender;
    private String ip;
    private String name;

    public Waypoint(int x, int y, int z, boolean doesRender, String ip, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = AsunaMod.minecraft.player.dimension;
        this.doesRender = doesRender;
        this.ip = ip;
        this.name = name;
    }

    public Waypoint(int x, int y, int z, int dim, boolean doesRender, String ip, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = dim;
        this.doesRender = doesRender;
        this.ip = ip;
        this.name = name;
    }

    public int[] getCoords() {
        int[] kek = {this.x, this.y, this.z};
        return kek;
    }

    public String getName() {
        return this.name;
    }

    public String getIp() {
        return ip;
    }

    public int getDim() {
        return dim;
    }

    public boolean isDoesRender() {
        return doesRender;
    }

    public void toggle() {
        doesRender = !doesRender;
    }
}
