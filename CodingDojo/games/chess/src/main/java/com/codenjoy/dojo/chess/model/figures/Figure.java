package com.codenjoy.dojo.chess.model.figures;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.chess.model.Field;
import com.codenjoy.dojo.chess.model.Player;
import com.codenjoy.dojo.services.Point;
import com.codenjoy.dojo.services.multiplayer.PlayerHero;

public class Figure extends PlayerHero<Field> {

    private boolean isWhite;
    private boolean alive;
    private Player player;

    public Figure(Point xy, boolean isWhite) {
        super(xy);
        this.isWhite = isWhite;
        alive = true;
    }

    @Override
    public void tick() {
        if (!alive) return;

        // TODO
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean hasPlayer() {
        return player != null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isWhite() {
        return isWhite;
    }

    @Override
    public void down() {
        // do nothing
    }

    @Override
    public void up() {
        // do nothing
    }

    @Override
    public void left() {
        // do nothing
    }

    @Override
    public void right() {
        // do nothing
    }

    @Override
    public void act(int... p) {
        // do nothing
    }

}
