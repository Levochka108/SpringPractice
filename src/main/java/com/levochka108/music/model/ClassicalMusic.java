/**
 * @author Dmitrii Klochkov
 * Date:15.05.2023
 * Time:11:03
 */
package com.levochka108.music.model;

import com.levochka108.music.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
