/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import fr.mrmicky.fastboard.FastBoard;
import org.bukkit.entity.Player;

import java.util.Set;

public interface RScoreboard {

    FastBoard newGameScoreboard(Player player);

    void removeGameScoreboard(Player player);

    void updateBoard(FastBoard board);

    Set<FastBoard> getBoards();

}
