package com.codenjoy.dojo.icancode.model.items;

/*-
 * #%L
 * iCanCode - it's a dojo-like platform from developers to developers.
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


import com.codenjoy.dojo.icancode.model.Elements;
import com.codenjoy.dojo.icancode.model.Player;
import com.codenjoy.dojo.icancode.model.enums.FeatureItem;

import java.util.Arrays;
import java.util.List;

public class Box extends FieldItem {

    public Box(Elements el) {
        super(el, new FeatureItem[]{FeatureItem.IMPASSABLE});
    }

    @Override
    public Elements state(Player player, Object... alsoAtPoint) {
        List<Object> objects = Arrays.asList(alsoAtPoint);
        for (Object object : objects) {
            if (object == player.getHero().getItem()) {
                return Elements.ROBO_FLYING_ON_BOX;
            }
            if (object instanceof HeroItem) {
                return Elements.ROBO_OTHER_FLYING_ON_BOX;
            }
        }
        return Elements.BOX;
    }
}