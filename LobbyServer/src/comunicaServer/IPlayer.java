package comunicaServer;

public interface IPlayer {
LobbyPlayer.Estat login(String user,String pass);
LobbyPlayer.Estat join(String user,String pass);
Room[] getRooms(Room.Tipus tipus);
LobbyPlayer.Estat joinRoomSetimig(Room room);
LobbyGame[] getRoomGames(Room room);
LobbyPlayer.Estat joinGame(LobbyGame lobbyGame);
LobbyPlayer.Estat createGame(LobbyGame lobbyGame);

}
