package de.tamion.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class As implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(!sender.hasPermission("DoAs.as")) {
            sender.sendMessage("You aren't allowed to execute this command");
            return false;
        }
        if(args.length < 2) {
            sender.sendMessage("/As [Player] [Command]");
            return false;
        }
        if(Bukkit.getPlayer(args[0]) == null) {
            sender.sendMessage("Player not online");
            return false;
        }
        Player t = Bukkit.getPlayer(args[0]);
        if(args[1].startsWith("/")) {
            Bukkit.dispatchCommand(t, String.join(" ", Arrays.copyOfRange(args, 1, args.length)).replaceFirst("/", ""));
        } else {
            t.chat(String.join(" ", Arrays.copyOfRange(args, 1, args.length)));
        }

        return true;
    }
}
