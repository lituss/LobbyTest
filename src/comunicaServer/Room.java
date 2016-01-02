package comunicaServer;
import java.util.ArrayList;
import java.util.Observable;

import utils.Array;


public abstract class Room extends Observable{
	public static enum Tipus {Setimig};
	protected Tipus tipus;
	protected String nom;
	
	protected static Array<LobbyPlayer> players = new Array<LobbyPlayer>();
	protected static Array<LobbyGame> games = new Array<LobbyGame>();
	protected int maxPlayers;
	protected int maxGames;
	
	protected Room(String nom,int maxPlayers,int maxGames){
		this.nom = nom;
		this.maxPlayers = maxPlayers;
		this.maxGames = maxGames;
		}
	
	public boolean addPlayer(LobbyPlayer player){
		boolean retorn;
		synchronized(players){
			if (players.size < maxPlayers){
				players.add(player);
				retorn = true;
			}
			else retorn = false;
		}
		if (retorn) {
			notifyObservers(player);
			return true;
		}
		else return false;
		
	}
	public boolean removePlayer(LobbyPlayer player){
		boolean retorn;
		
		synchronized(players){
			retorn = players.removeValue(player, true);
		}
		if (retorn) notifyObservers(player);
		return retorn;
	}

	public boolean addGame(LobbyGame game){
		boolean retorn;
		synchronized(games){
			if (games.size < maxGames){
				games.add(game);
				retorn = true;
			}
			else retorn = false;
		}
		if (retorn){
			notifyObservers(game);
			return true;
		}
		else return false;
		
	}
	
	public boolean removeGame(LobbyGame game){
		boolean retorn;
		
		synchronized(games){
			retorn = games.removeValue(game, true);
		}
		if (retorn) notifyObservers(game);
		return retorn;
	}
}
