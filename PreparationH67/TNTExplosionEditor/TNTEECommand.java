package PreparationH67.TNTExplosionEditor;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TNTEECommand implements CommandExecutor
{

	private final Main plugin;
	
	public TNTEECommand(Main pPlugin)
	{
		plugin = pPlugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] split)
    {
		if (!(sender instanceof Player)) 
        {
            return false;
        }
		
		return true;
    }
	
}
