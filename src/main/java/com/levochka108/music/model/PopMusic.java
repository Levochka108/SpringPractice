/**
 * @author Dmitrii Klochkov
 * Date:15.05.2023
 * Time:11:19
 */
package com.levochka108.music.model;

import com.levochka108.music.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "They Don't Care About Us\n"+
                "Michele Jackson";
    }
}
