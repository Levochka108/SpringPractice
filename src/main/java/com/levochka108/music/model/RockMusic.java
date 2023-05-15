/**
 * @author Dmitrii Klochkov
 * Date:15.05.2023
 * Time:11:04
 */
package com.levochka108.music.model;

import com.levochka108.music.Music;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Ace of Spades\n"+
        "Трек – Motörhead";
    }
}
