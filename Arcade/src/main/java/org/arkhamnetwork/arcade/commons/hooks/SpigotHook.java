/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arkhamnetwork.arcade.commons.hooks;

/**
 *
 * @author devan_000
 */
public class SpigotHook {

    public static void injectAsyncCatcher(boolean enabled) {
        org.spigotmc.AsyncCatcher.enabled = enabled;
    }

}
