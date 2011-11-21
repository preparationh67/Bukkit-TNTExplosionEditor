package PreparationH67.TNTExplosionEditor;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import java.util.logging.Logger;
import org.bukkit.util.config.Configuration;

/**
* Main class for the Spirit Bomb Explosion Attack plugin
* This class handles the primary objects needed in order to use the plugin
*
* @author PreparationH67
*/
public class Main extends JavaPlugin
{
	//private final SBPlayerListener playerListener = new SBPlayerListener(this);
    //private final SBBlockListener blockListener = new SBBlockListener(this);
    private final HashMap<Player, Boolean> debugees = new HashMap<Player, Boolean>();
    private final Logger log = Logger.getLogger("Minecraft");
    protected Configuration config;
    
    private boolean debug;
    
    public void onEnable() 
    {
    	Logger log = this.getServer().getLogger();
    	log.info("TNT Explosion Editor has been enabled!");
        // TODO: Place any custom enable code here including the registration of any events
    	
        // Register our events
        //PluginManager pm = this.getServer().getPluginManager();
        //pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener, Priority.Normal, this);
        
        // Register our commands
        getCommand("tnt").setExecutor(new TNTEECommand(this));
        
        PluginDescriptionFile pdfFile = this.getDescription();
        log.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
    }
    
    public void onDisable() 
    {
    	log.info("TNT Explosion Editor has been disabled.");
        // TODO: Place any custom disable code here
        // NOTE: All registered events are automatically unregistered when a plugin is disabled
    }
    
}
